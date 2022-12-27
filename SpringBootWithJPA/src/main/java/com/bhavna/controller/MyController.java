package com.bhavna.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhavna.bean.Employee;
import com.bhavna.dao.EmployeeDao;
import com.bhavna.service.EmployeeService;

@RestController
public class MyController {
	@Autowired 
	EmployeeService employeeService;
	@Autowired
	EmployeeDao employeeDao;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to home!";
	}
	
	@PostMapping("/addEmployee")
	public void addData(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
	}
	
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> fetchEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp, @PathVariable int id) {
		Employee employee=this.employeeService.updateEmployee(emp, id);
		return ResponseEntity.ok(employee);
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void removeEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
	@GetMapping("/employeeByPage/page={pgNo}&size={sze}")
	Page<Employee> fetchEmployeeByPage(@PathVariable int pgNo, @PathVariable int sze){
		return employeeDao.findAll(PageRequest.of(pgNo-1, sze));
	}
	
}
