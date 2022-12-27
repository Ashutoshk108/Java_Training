package com.bhavna.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.bean.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
