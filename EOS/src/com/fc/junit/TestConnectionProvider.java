package com.fc.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fc.connection.provider.Connection;
import com.fc.connection.provider.ConnectionProvider;
import com.fc.connection.provider.Statement;

public class TestConnectionProvider {
	
	 public static ConnectionProvider cp;
	 public Connection con;
	@BeforeClass
	public static void beforeTests() {
		cp = new ConnectionProvider();
	}
	@Before
	public void setUp() {
		con = cp.getConnection();
		System.out.println("setUp is executing....");
	}
	@Test
	public void getConnectionTest() throws ArithmeticException{
		
		Connection con = cp.getConnection();
		System.out.println("connection has been created.....");
	}
	@Test
	public void createStatementTest() {
		
		Statement st = cp.createStatement(con);
		System.out.println("connection has been created...."); 
	} 
	@After
	public void tearDown() {
		con=null;
	}
	@AfterClass
	public static void afterAllTest() {
		cp=null;
	}
}
