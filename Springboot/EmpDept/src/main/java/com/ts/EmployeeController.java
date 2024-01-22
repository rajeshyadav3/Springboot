package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;
}
