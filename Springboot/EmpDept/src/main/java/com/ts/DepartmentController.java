package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DepartmentDao;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentDao departmentDao;

}