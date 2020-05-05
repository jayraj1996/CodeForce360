package com.codeforce360.jdbc;

public class Main_Connection {
	
	public static void main(String args[]) {
		
		ConnectionToDatabase connection = new ConnectionToDatabase();
		//StatementImplementation st = new StatementImplementation();
		//PreparedStatementImplementation pt = new PreparedStatementImplementation();
		//CallableStatementImplementation ct = new CallableStatementImplementation();
		ResultSetImplementation rt = new ResultSetImplementation();
		connection.doConnection();
		//pt.doPreparedStatement();
		//st.doStatement();
		//ct.doCallableStatement();
		rt.doResultSet();
		
	}

}
