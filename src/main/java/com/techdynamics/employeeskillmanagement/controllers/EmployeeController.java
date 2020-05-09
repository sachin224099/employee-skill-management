package com.techdynamics.employeeskillmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.EmployeeService;
import com.techdynamics.employeeskillmanagement.entity.Employee;

@RestController
@RequestMapping(path ="/rest/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return employeeService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.update(employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void removeEmployee(@PathVariable Long id) {
		employeeService.removeById(id);
	}
}
