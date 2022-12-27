package com.bhavna.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavna.bean.Employee;
import com.bhavna.dao.EmployeeDao;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.save(emp);
	}

	@Override
	public Optional<Employee> getEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee emp,int id) {
		// TODO Auto-generated method stub
		Optional<Employee> empObj=employeeDao.findById(id);
		
		if(empObj.isPresent()) {
			empObj.get().setAge(emp.getId());
			empObj.get().setName(emp.getName());
			empObj.get().setAge(emp.getAge());
			empObj.get().setGender(emp.getGender());
			empObj.get().setJobTitle(emp.getJobTitle());
			empObj.get().setSalary(emp.getSalary());
			
			return employeeDao.save(empObj.get());
		}
		
		return new Employee();
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
		
	}


}
