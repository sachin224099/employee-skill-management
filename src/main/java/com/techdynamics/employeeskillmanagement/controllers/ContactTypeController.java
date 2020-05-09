package com.techdynamics.employeeskillmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.ContactTypeService;
import com.techdynamics.employeeskillmanagement.entity.ContactType;

@RestController
@RequestMapping(path ="/rest/api/contacttype")
public class ContactTypeController {
	@Autowired
	private ContactTypeService contactTypeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ContactType> getAllContactType(){
		return contactTypeService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public ContactType getContactTypeById(@PathVariable Long id) {
		return contactTypeService.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addContactType(@RequestBody ContactType contactType) {
		contactTypeService.save(contactType);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateContactType(@RequestBody ContactType contactType) {
		contactTypeService.update(contactType);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void removeContactType(@PathVariable Long id) {
		contactTypeService.removeById(id);
	}
}
