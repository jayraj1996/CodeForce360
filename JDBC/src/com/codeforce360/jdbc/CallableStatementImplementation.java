package com.codeforce360.jdbc;

import java.sql.CallableStatement;
import java.util.Scanner;

public class CallableStatementImplementation extends ConnectionToDatabase{
	
	public void doCallableStatement() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Employee ID");
		int eid = scan.nextInt();
		System.out.println("Enter the Employee Name");
		String ename = scan.next();
		System.out.println("Enter the Employee Department");
		String dname = scan.next();
		try {
		
			
			CallableStatement ct = doConnection().prepareCall("{call insertEmployeeDetails(?,?,?)}");
			ct.setInt(1,eid);
			ct.setString(2,ename);
			ct.setString(3,dname);
			
			ct.executeUpdate();
			
			System.out.println("Rows Inserted Successfully!!");
			doConnection().close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
