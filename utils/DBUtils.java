package simpleWebApp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 

import simpleWebApp.beans.Kart;
 
public class DBUtils {
 

 public static List<Kart> resimgetir(Connection conn, String sqlW, int PageNumber) throws SQLException
 {
	 
 String sql = "Select resim, COUNT(*) as total from kart " + sqlW + "ORDER BY sinif LIMIT 10 OFFSET "+ (PageNumber - 1) * 10;


 
 PreparedStatement pstm = conn.prepareStatement(sql);

 ResultSet rs = pstm.executeQuery();
 List<Kart> list = new ArrayList<Kart>();
 
 while (rs.next()) {
	  String resim = rs.getString("resim");
	 
	  Kart kart=new Kart();
	  kart.Setresim(resim);
	  System.out.println(kart.Getresim());
	  list.add(kart);
	    
	}

 	
 	
 	return list;
 	
 	
 }
 public static List<Integer> Sayfanumarası(Connection conn, String sqlW) throws SQLException
 {
	 String sql = "Select COUNT(*) as total from kart " + sqlW ;
	 PreparedStatement pstm = conn.prepareStatement(sql);
	 ResultSet rs = pstm.executeQuery();
	 List<Integer> pageNumber = new ArrayList<Integer>();
	 int counter=1;
	 int counter2=0;
	 while (rs.next()) {
		 counter2=((rs.getInt("total"))/10)+1;
		 
		}
	 while(counter<(counter2+1))
	 {
		 pageNumber.add(counter); 
		 counter++;
	 }
	 return pageNumber;
 }
 }