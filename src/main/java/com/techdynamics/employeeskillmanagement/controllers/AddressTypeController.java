package com.techdynamics.employeeskillmanagement.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.AddressTypeService;
import com.techdynamics.employeeskillmanagement.entity.AddressType;

/**
 * @author syadav
 *
 */
@RestController
@RequestMapping(path ="/rest/api/addresstype")
public class AddressTypeController extends BaseController<AddressType>{

	public AddressTypeController(AddressTypeService addressTypeService) {
		super(addressTypeService);
	}
}
