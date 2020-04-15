package com.fc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fc.connection.provider.ConnectionProvider;
import com.fc.connection.provider.Statement;
import com.fc.model.Employee;

public class EmployeeDao {
	
	private static ConnectionProvider cp;
	private static Connection connection;
	private ResultSet resultSet;
	
	ArrayList<Employee> empList;
	
	public static Connection createConnection() throws Exception {
		
		cp = new ConnectionProvider("a", "b", "c", "d"); 
		connection = cp.getConnection();
		
		return connection;

	}
	public void addEmployee(Employee employee) throws Exception  { 
		
		Connection con = EmployeeDao.createConnection();
		Statement stmt = cp.createStatement(con);
		
		empList = new ArrayList<Employee>(); 
		
		Employee ramesh = new Employee();
		ramesh.setId(0); 
		ramesh.setName("Ramesh");
		ramesh.setDesignation("SE");
		ramesh.setSalary(100020.67f); 
		
		Employee suresh = new Employee();
		suresh.setId(1); 
		suresh.setName("Suresh");
		suresh.setDesignation("SE");
		suresh.setSalary(200020.67f); 

		empList.add(ramesh);
		empList.add(suresh);
		
		System.out.println("Employee added successfully...."); 
	}
	public Employee getEmployee(int id){
		
	    Employee emp = empList.get(0);
		
		return emp;
	}
	public List<Employee> getEmployees(){
		
		List<Employee> al = new ArrayList<Employee>() ; 
		
		for(Employee e : empList) {
			al.add(e);
		}
		
		return al;
	}
}
