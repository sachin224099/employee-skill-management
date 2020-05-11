/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Employee;
import com.techdynamics.employeeskillmanagement.repository.EmployeeRepository;

/**
 * @author aditya raj
 *
 */

@Service
public class EmployeeService extends BaseService<Employee> {
	
	@Autowired
	private ContactService contactService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private SkillService skillService;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		super(employeeRepository);
	}
	
	public boolean isEmployeeExistById(Long id) {
		return getRepository().existsById(id);
	}

	@Override
	public void save(Employee entity) {
		super.save(entity);
		if (!entity.getAddresses().isEmpty()) {
			entity.getAddresses().stream().forEach(address -> addressService.save(address));
		}
		if(!entity.getContacts().isEmpty()) {
			entity.getContacts().stream().forEach(contact -> contactService.save(contact));
		}
		if(!entity.getSkills().isEmpty()) {
			entity.getSkills().stream().forEach(skill -> skillService.save(skill));
		}
	}
}
