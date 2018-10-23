package com.uas.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static Connection conn= null; 
	
	  public static Connection getConnected() throws SQLException {
		  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","saurabh");
		    return conn;
	  }
}
