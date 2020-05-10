package com.techdynamics.employeeskillmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.AddressService;
import com.techdynamics.employeeskillmanagement.entity.Address;

@RestController
@RequestMapping(path ="/rest/api/address")
public class AddressController extends BaseController<Address> {
	
	public AddressController(AddressService addressService) {
		super(addressService);
	}
}
