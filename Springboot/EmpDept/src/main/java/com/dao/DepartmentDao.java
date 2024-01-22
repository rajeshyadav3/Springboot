package com.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class DepartmentDao {
	
	//Dependency Injection
	@Autowired
	DepartmentRepository departmentRepository;

}