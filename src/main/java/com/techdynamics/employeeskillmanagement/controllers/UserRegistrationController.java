package com.techdynamics.employeeskillmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.RegistrationService;
import com.techdynamics.employeeskillmanagement.entity.User;

@RestController
@RequestMapping(path = "/rest/api/register")
public class UserRegistrationController extends BaseController<User> {
	
	public UserRegistrationController(RegistrationService registrationService) {
		super(registrationService);
	}
	
	
}
