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
	public List<T> getAll(){
		return service.getAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public T getById(@PathVariable Long id) {
		return service.getById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = {"application/json"})
	public void add(@RequestBody T entity) {
		service.save(entity);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody T entity) {
		service.update(entity);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void remove(@PathVariable Long id) {
		service.removeById(id);
	}
	
	public IService<T> getService() {
		return service;
	}
}
