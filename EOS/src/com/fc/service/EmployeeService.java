package com.fc.service;

import java.util.List;

import com.fc.dao.EmployeeDao;
import com.fc.model.Employee;

public class EmployeeService {
	
	private EmployeeDao empDao;
	private List<Employee> empList;
	
	public EmployeeService() {
		
		empDao = new EmployeeDao();
	}
	
	public void addEmp(Employee emp) {
	
		empDao.addEmployee(emp);
	}
	
	public Employee getEmp(int id) {
		System.out.println("empSVc "+id);  
		Employee emp=empDao.getEmployee(id);
		
		return emp;
	}	
	public List<Employee> getEmps(){
		
		empList = empDao.getEmployees();
		
		return empList;
	}
}
