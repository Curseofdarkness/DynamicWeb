package simpleWebApp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import simpleWebApp.utils.DBUtils;
import simpleWebApp.utils.MyUtils;
import simpleWebApp.beans.Kart;



@WebServlet(urlPatterns = { "/DoArama" })
public class KartgosterServlet
	 extends HttpServlet {
		    private static final long serialVersionUID = 1L;
		    
		    public KartgosterServlet() {
		        super();
		    }
		 
		    @Override
		    protected void doGet(HttpServletRequest request, HttpServletResponse response)
		            throws ServletException, IOException {
		        Connection conn = MyUtils.getStoredConnection(request);
		        
		        String sinif=request.getParameter("sinif");
		        String nadir=request.getParameter("nadir");
		        String paket=request.getParameter("paket");
		        String mana=request.getParameter("mana");
		        String isim=request.getParameter("isim");
		        
		        List<String> aramaL =new ArrayList<String>();
		        String sqlPlus="";
		    	
		        if(sinif.equals("1"))
			        {
			        	//do nothing
			        }
		        else
			        {
			        	sinif= "sinif='" + sinif+ "'";		        	
			        	aramaL.add(sinif);
			        }
		    
		        if(nadir.equals("1"))
			        {
			        	//do nothing
			        }
		        else
			        {
			        	nadir="nadir='"+nadir+ "'";
			        	aramaL.add(nadir);
			        }
		        if(paket.equals("1"))
			        {
			        	//do nothing
			        }
		        else
			        {
			        	paket="paket='"+paket+ "'";
			        	aramaL.add(paket);
			        }
		        if(mana.equals("55"))
			        {
			        	//do nothing
			        }
		        else
			        {
			        	mana="mana="+mana;
			        	aramaL.add(mana);
			        }
		        if(isim.equals("isim"))
			        {
			        	//do nothing
			        }
		        else
			        {
		        		isim=isim.toUpperCase();
			        	isim= "isim LIKE '%" + isim + "%'";		        	
			        	aramaL.add(isim);
			        }
		        
		        int counter=0;
		        while(counter<aramaL.size())
		        {
			        	if(counter!=0)
				        	{	
			        		sqlPlus += " AND ";
			        		
			        		sqlPlus += aramaL.get(counter);
			        		sqlPlus += " ";
			        			
				        	}
				        else if(counter==0)
				        	{
				        	sqlPlus +="where";
		        			sqlPlus += " ";
		        			
		        			sqlPlus += aramaL.get(counter);
		        			sqlPlus += " ";
				        	}

		        	counter++;
		        }
		        System.out.println(sqlPlus);
		        List<Kart> res= null;
		        String errorString = null;
		        List<Integer> SayfaNumarasi=null;
		        try{
		        res = DBUtils.resimgetir(conn,sqlPlus,1);
		        SayfaNumarasi=DBUtils.Sayfanumarası(conn, sqlPlus);
		        }
		        catch (SQLException e)
		        {
		        	e.printStackTrace();
		        	errorString =e.getMessage();
		        }
		       
		     
		        // Store info in request attribute, before forward to views
		        request.setAttribute("errorString", errorString);
		        request.setAttribute("kartResim", res);
		        request.setAttribute("sayfaNumara", SayfaNumarasi);
		        request.setAttribute("sqlp", sqlPlus);
		         
		     
		        // Forward to /WEB-INF/views/productListView.jsp
		        RequestDispatcher dispatcher = request.getServletContext()
		                .getRequestDispatcher("/WEB-INF/views/Kartlar.jsp");
		        dispatcher.forward(request, response);
		        
		    }
		 
		    @Override
		    protected void doPost(HttpServletRequest request, HttpServletResponse response)
		            throws ServletException, IOException {
		        doGet(request, response);
		    }
		 
		    
}
