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
	
    public ArrayList<Employee> empList; 
	
	public EmployeeDao() {
		
		empList = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee)   { 
		//empList.clear();
		
		Employee emp1 = new Employee();
		 		 emp1.setId(1);
		 		 emp1.setName("Mahesh");
		 		 emp1.setDesignation("ASE"); 
		 		 emp1.setSalary(534234.84f); 
		Employee emp2 = new Employee();
		 		 emp2.setId(2); 
		 		 emp2.setName("Ramesh");
		 		 emp2.setDesignation("SE");
		 		 emp2.setSalary(100020.67f); 
		Employee emp3 = new Employee();
	     		 emp3.setId(3); 
	     		 emp3.setName("Suresh");
	     		 emp3.setDesignation("SE");
	     		 emp3.setSalary(200020.67f); 
	
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println(empList.size());
		System.out.println("Employee added successfully...."); 
	}
	public Employee getEmployee(int id){
		Employee emp1 = new Employee();
		         emp1.setId(1);
		         emp1.setName("Mahesh");
		         emp1.setDesignation("ASE"); 
		         emp1.setSalary(534234.84f); 
	    Employee emp2 = new Employee();
		 		 emp2.setId(2); 
		 		 emp2.setName("Ramesh");
		 		 emp2.setDesignation("SE");
		 		 emp2.setSalary(100020.67f); 
	    Employee emp3 = new Employee();
		 		 emp3.setId(3); 
		 		 emp3.setName("Suresh");
		 		 emp3.setDesignation("SE");
		 		 emp3.setSalary(200020.67f); 

	    empList.add(emp1);
	    empList.add(emp2);
	    empList.add(emp3);

		System.out.println("empDAO :"+id);
		int empId = id;
		System.out.println("EmpId : "+empId); 
		System.out.println("size of empList : "+empList.size()); 
	    Employee emp = empList.get(0);
		
		return emp;
	}
	public List<Employee> getEmployees(){
		
		Employee emp1 = new Employee();
         		 emp1.setId(1);
         		 emp1.setName("Mahesh");
         		 emp1.setDesignation("ASE"); 
         		 emp1.setSalary(534234.84f); 
        Employee emp2 = new Employee();
		         emp2.setId(2); 
		         emp2.setName("Ramesh");
		         emp2.setDesignation("SE");
		         emp2.setSalary(100020.67f); 
        Employee emp3 = new Employee();
		   	     emp3.setId(3); 
		         emp3.setName("Suresh");
		         emp3.setDesignation("SE");
		         emp3.setSalary(200020.67f); 

		         empList.add(emp1);
		         empList.add(emp2);
		         empList.add(emp3);

		return empList;
	}
}
