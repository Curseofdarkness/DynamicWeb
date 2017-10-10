package simpleWebApp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_SQLJDBC {

 
// Connect to SQLServer
// (Using JDBC Driver: SQLJDBC)    
public static Connection getSQLServerConnection_SQLJDBC()
        throws ClassNotFoundException, SQLException {
     
    // Note: Change the connection parameters accordingly.
     
    String hostName = "127.0.0.1";
    String sqlInstanceName = "CURSEOFDARKNESS";
    String database = "hearthstone";
   // String integrated = "integratedSecurity=true";
    String username = "root";
    String password = "";
    

    return getSQLServerConnection_SQLJDBC(hostName, sqlInstanceName,
            database, username, password);
}



//Connect to SQLServer, using SQLJDBC Library.
private static Connection getSQLServerConnection_SQLJDBC(String hostName,
        String sqlInstanceName, String database, String username, String password) throws ClassNotFoundException, SQLException {
   
    // Declare the class Driver for SQLServer DB
    // This is necessary with Java 5 (or older)
    // Java6 (or newer) automatically find the appropriate driver.
    // If you use Java> 5, then this line is not needed.        
	 Class.forName("com.mysql.jdbc.Driver");
	// jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr  
    String connectionURL = "jdbc:mysql://" + hostName +":3306"
    		+ "/" + database;
    
    Connection conn = DriverManager.getConnection(connectionURL, username, password);
    return conn;
}

}