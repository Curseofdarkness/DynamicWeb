package simpleWebApp.utils;

import java.sql.Connection;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
 
public class MyUtils {
 
   public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";
 
   private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKIE";
 
    
   // Store Connection in request attribute.
   // (Information stored only exist during requests)
   public static void storeConnection(ServletRequest request, Connection conn) {
       request.setAttribute(ATT_NAME_CONNECTION, conn);
   }
 
   // Get the Connection object has been stored in one attribute of the request.
   public static Connection getStoredConnection(ServletRequest request) {
       Connection conn = (Connection) request.getAttribute(ATT_NAME_CONNECTION);
       return conn;
   }
 
 
 
   public static String getUserNameInCookie(HttpServletRequest request) {
       Cookie[] cookies = request.getCookies();
       if (cookies != null) {
           for (Cookie cookie : cookies) {
               if (ATT_NAME_USER_NAME.equals(cookie.getName())) {
                   return cookie.getValue();
               }
           }
       }
       return null;
   }
 
 
   // Delete cookie.
   public static void deleteUserCookie(HttpServletResponse response) {
       Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, null);
 
       // 0 seconds (Expires immediately)
       cookieUserName.setMaxAge(0);
       response.addCookie(cookieUserName);
   }
 
}