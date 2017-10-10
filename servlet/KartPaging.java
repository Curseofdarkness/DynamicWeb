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



@WebServlet(urlPatterns = { "/DoAra" })
public class KartPaging
	 extends HttpServlet {
		    private static final long serialVersionUID = 1L;
		    
		    public KartPaging() {
		        super();
		    }
		 
		    @Override
		    protected void doGet(HttpServletRequest request, HttpServletResponse response)
		            throws ServletException, IOException {
		        Connection conn = MyUtils.getStoredConnection(request);
		        int sayfaNumara=Integer.parseInt(request.getParameter("sayfa"));
		        String sqlPl=request.getParameter("sqlp");
		       
		        System.out.println(sqlPl);
		        System.out.println(sayfaNumara);
		        List<Kart> res= null;
		        String errorString = null;
		        List<Integer> SayfaNumarasi=null;
		        try{
		        res = DBUtils.resimgetir(conn,sqlPl,sayfaNumara);
		        SayfaNumarasi=DBUtils.Sayfanumarası(conn, sqlPl);
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
		        request.setAttribute("sqlp", sqlPl);
		         
		     
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
