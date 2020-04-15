package com.fc.runner;

import java.util.List;

import com.fc.model.Employee;
import com.fc.service.EmployeeService;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService empService = new EmployeeService();
	
		Employee emp1 = new Employee();
				 emp1.setId(8056486);
				 emp1.setName("Mahesh");
				 emp1.setDesignation("ASE"); 
				 emp1.setSalary(534234.84f); 
		Employee emp2 = new Employee();
				 emp2.setId(0); 
				 emp2.setName("Ramesh");
				 emp2.setDesignation("SE");
				 emp2.setSalary(100020.67f); 
		Employee emp3 = new Employee();
			     emp3.setId(1); 
			     emp3.setName("Suresh");
			     emp3.setDesignation("SE");
			     emp3.setSalary(200020.67f); 
		
			     empService.addEmp(emp1);
			     
					/*
					 * Employee e = empService.getEmp(8056486); System.out.println(e.getName());
					 * 
					 * List<Employee> empList = empService.getEmps(); for(Employee e1 : empList) {
					 * System.out.println(e1.getName()); }
					 */	}

}
