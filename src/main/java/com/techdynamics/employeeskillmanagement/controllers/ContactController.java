package com.techdynamics.employeeskillmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.ContactService;
import com.techdynamics.employeeskillmanagement.entity.Contact;

@RestController
@RequestMapping(path ="/rest/api/contact")
public class ContactController extends BaseController<Contact>{
	
	public ContactController(ContactService contactService) {
		super(contactService);
	}
}
