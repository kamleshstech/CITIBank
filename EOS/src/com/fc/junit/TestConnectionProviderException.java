package com.fc.junit;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fc.connection.provider.ConnectionProvider;

public class TestConnectionProviderException {
	
	public static ConnectionProvider cp;
	@BeforeClass
	public static void forAllTest() {
		cp=new ConnectionProvider();
	}
	@Test(expected = ArithmeticException.class)
	public void getConnection() throws ArithmeticException{
		int i=1/0;
	}
	@After
	public void tearDown() {
		cp=null;
	}
}
