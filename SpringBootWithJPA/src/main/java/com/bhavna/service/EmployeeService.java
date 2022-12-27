package com.bhavna.service;


import java.util.Optional;

import com.bhavna.bean.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	
	public Optional<Employee> getEmployee(int id);
	
	public Employee updateEmployee(Employee emp, int id);
	
	public void deleteEmployee(int id);
	
	
}
