package com.codeforce360.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionToDatabase{
	
	public Connection doConnection() {
		
		Connection con = null;
		try {
			
			 String url="jdbc:mysql://localhost:3306/employee";
			 String username = "root";
			 String password = "root";
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url, username, password);
			 
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Exception achieved!!"); 
		}
		return con;
		
	}
	
	
}
