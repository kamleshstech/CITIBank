package com.fc.connection.provider;

import java.sql.Connection;

public class ConnectionProvider {
	private String url;
	private String userName;
	private String pwd;
	private String driverClass;
	
	
	public ConnectionProvider(String url, String userName, String pwd, String driverClass) {
		this.url = url;
		this.userName = userName;
		this.pwd = pwd;
		this.driverClass = driverClass;
	}


	public Connection getConnection() throws Exception { 
		
		ConnectionProvider connectionProvider = new ConnectionProvider("url", "userName", "pwd", "driverClass");
		
		return (Connection) connectionProvider;
	}
	
	public Statement createStatement(Connection con) {
		
		return new Statement();
	}
}
