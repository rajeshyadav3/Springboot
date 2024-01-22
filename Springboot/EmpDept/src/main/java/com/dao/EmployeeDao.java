package com.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDao {

	//Dependency Injection
	@Autowired
	EmployeeRepository employeeRepository;
}