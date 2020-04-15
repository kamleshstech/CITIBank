package com.fc.service;

import java.util.List;

import com.fc.dao.EmployeeDao;
import com.fc.model.Employee;

public class EmployeeService {
	
	private EmployeeDao empDao;
	private List<Employee> empList;
	
	public void addEmp(Employee emp) {
		empDao = new EmployeeDao();
		try {
			empDao.addEmployee(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Employee getEmp(int id) {
		Employee emp=empDao.getEmployee(id);
		return emp;
	}
	
	public List<Employee> getEmps(){
		
		empList = empDao.getEmployees();
		
		return empList;
	}
}
