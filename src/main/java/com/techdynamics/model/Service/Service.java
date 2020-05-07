package com.techdynamics.model.Service;

import java.util.List;

/**
 * @author syadav
 *
 */
public interface Service<T> {
	
	List<T> getAll();
	
	T getById(Long id);
	
	void update(T entity);
	
	void save(T entity);
	
	void removeById(Long id);
	
	void remove(T entity);
}
