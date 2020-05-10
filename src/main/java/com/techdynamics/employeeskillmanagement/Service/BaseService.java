package com.techdynamics.employeeskillmanagement.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class BaseService<T> implements IService<T> {

	private JpaRepository<T, Long> repository;

	public BaseService() {

	}

	public BaseService(JpaRepository<T, Long> repository) {
		this.repository = repository;
	}

	@Override
	public List<T> getAll() {
		return repository.findAll();
	}

	@Override
	public T getById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void update(T entity) {
		repository.save(entity);

	}

	@Override
	public void save(T entity) {
		repository.save(entity);

	}

	@Override
	public void removeById(Long id) {
		repository.deleteById(id);

	}

	@Override
	public void remove(T entity) {
		repository.delete(entity);

	}

}
