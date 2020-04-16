package com.fc.connection.provider;


public class ConnectionProvider {
	
	private Connection con;
	
	private String url;
	private String userName;
	private String pwd;
	private String driverClass;

	public Connection getConnection() throws ArithmeticException { 
		
		Connection con = new Connection("url", "userName", "pwd", "driverClass");
		
		return con;
	}
	
	public Statement createStatement(Connection con) {
		
		Statement stmt = con.createStatement(con);
		
		return stmt;
	}
}
