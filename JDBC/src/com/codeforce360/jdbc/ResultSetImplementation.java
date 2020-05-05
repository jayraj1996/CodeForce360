package com.codeforce360.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetImplementation extends ConnectionToDatabase {

	public void doResultSet() {
		
		String sql = "select * from employeedetails";
		
		try {
			
			
			Statement st = doConnection().createStatement();
			ResultSet set = st.executeQuery(sql);
			
			set.absolute(1);
			
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3));
			doConnection().close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
