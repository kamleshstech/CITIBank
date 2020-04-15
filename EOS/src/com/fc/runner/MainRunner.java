package com.fc.runner;

import java.util.List;

import com.fc.model.Employee;
import com.fc.service.EmployeeService;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService empService = new EmployeeService();
	
		Employee emp1 = new Employee();
		 emp1.setId(1);
		 emp1.setName("Mahesh");
		 emp1.setDesignation("ASE"); 
		 emp1.setSalary(534234.84f); 
		 
		 //empService.addEmp(emp1);

					//Employee e = empService.getEmp(8056486); 
					 //System.out.println("Emp Name : "+e.getName());
					  //System.out.println("EmpDTLS : "+e);
					  
						
		         List<Employee> empList = empService.getEmps(); 
		         for(Employee e1 : empList) {
		        	 System.out.println(e1); 
		         }
	}

}
