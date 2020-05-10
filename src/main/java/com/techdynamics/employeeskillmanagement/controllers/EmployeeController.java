package com.techdynamics.employeeskillmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.EmployeeService;
import com.techdynamics.employeeskillmanagement.entity.Employee;

@RestController
@RequestMapping(path ="/rest/api/employees")
public class EmployeeController extends BaseController<Employee>{

	public EmployeeController(EmployeeService employeeService) {
		super(employeeService);
	}
}
