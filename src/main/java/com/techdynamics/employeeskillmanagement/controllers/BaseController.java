package com.techdynamics.employeeskillmanagement.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techdynamics.employeeskillmanagement.Service.IService;

/**
 * @author syadav
 *
 * @param <T>
 */
public abstract class BaseController<T> {
	
	private IService<T> service;
	
	public BaseController() {
		super();
	}
	
	public BaseController(IService<T> service) {
		super();
		this.service = service;
	}

	

	@RequestMapping(method = RequestMethod.GET)
	public List<T> getAllT(){
		return service.getAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public T getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void add(@RequestBody T addressType) {
		service.save(addressType);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody T addressType) {
		service.update(addressType);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void remove(@PathVariable Long id) {
		service.removeById(id);
	}
	
	
}
