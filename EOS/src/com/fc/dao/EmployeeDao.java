package com.fc.dao;

import java.util.ArrayList;
import java.util.List;

import com.fc.connection.provider.Connection;
import com.fc.connection.provider.ConnectionProvider;
import com.fc.connection.provider.Statement;
import com.fc.model.Employee;

public class EmployeeDao {
	
	private static ConnectionProvider cp = new ConnectionProvider();
	private static Connection con;
	
	
	private ArrayList<Employee> empList;
	
	public void addEmployee(Employee employee)   { 
		try {
			con=cp.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		Statement st = cp.createStatement(con);
		
		empList = new ArrayList<Employee>(); 
		

		empList.add(employee);
		
		System.out.println("Employee added successfully...."+employee.getId()+":"+employee.getName()); 
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
