package com.codeforce360.jdbc;

import java.sql.Statement;

public class StatementImplementation extends ConnectionToDatabase{
	
	public void doStatement(){
		
		try {
			
			String sql = "create table EmployeeDetails(eid int(20),ename varchar(30), department varchar(50))";
			Statement statement = doConnection().createStatement();
			statement.executeUpdate(sql);
			
			System.out.println("Successfully Inserted!!");
			doConnection().close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	} 

}
