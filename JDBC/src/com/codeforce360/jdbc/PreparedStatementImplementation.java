package com.codeforce360.jdbc;
import java.sql.*;
import java.util.Scanner;

public class PreparedStatementImplementation extends ConnectionToDatabase{

	public void doPreparedStatement() {
		
		try {
			String sql = "insert into employeedetails values(?,?,?)";
			
			PreparedStatement pt = doConnection().prepareStatement(sql);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the employee ID:");
			int id = scan.nextInt();
			System.out.println("Enter the Employee Name:");
			String name = scan.next();
			System.out.println("Enter the department Name:");
			String dname = scan.next();
			
			pt.setInt(1,id);
			pt.setString(2, name);
			pt.setString(3, dname);
			
		    pt.executeUpdate();
			
			System.out.println("Rows Inserted Successfully!!");
			doConnection().close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
