/**
 * 
 */
package com.techdynamics.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdynamics.model.entity.Employee;
import com.techdynamics.model.repository.ContactTypeRepository;
import com.techdynamics.model.repository.EmployeeRepository;

/**
 * @author aditya raj
 *
 */

@Service
public class EmployeeService implements IService<Employee> {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Employee entity) {
		employeeRepository.save(entity);

	}

	@Override
	public void save(Employee entity) {
		employeeRepository.save(entity);

	}

	@Override
	public void removeById(Long id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public void remove(Employee entity) {
		employeeRepository.delete(entity);

	}

}
