package com.techdynamics.employeeskillmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.ContactTypeService;
import com.techdynamics.employeeskillmanagement.entity.ContactType;

/**
 * @author syadav
 *
 */
@RestController
@RequestMapping(path ="/rest/api/contacttype")
public class ContactTypeController extends BaseController<ContactType>{
	
	public ContactTypeController(ContactTypeService contactTypeService) {
		super(contactTypeService);
	}
}
