package com.techdynamics.employeeskillmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.AddressTypeService;
import com.techdynamics.employeeskillmanagement.entity.AddressType;

@RestController
@RequestMapping(path ="/rest/api/addresstype")
public class AddressTypeController {
	
	@Autowired
	private AddressTypeService addTypeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<AddressType> getAllAddressType(){
		return addTypeService.getAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public AddressType getAddressTypeById(@PathVariable Long id) {
		return addTypeService.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addAddressType(@RequestBody AddressType addressType) {
		addTypeService.save(addressType);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void updateAddressType(@RequestBody AddressType addressType) {
		addTypeService.update(addressType);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void removeAddressType(@PathVariable Long id) {
		addTypeService.removeById(id);
	}
}
