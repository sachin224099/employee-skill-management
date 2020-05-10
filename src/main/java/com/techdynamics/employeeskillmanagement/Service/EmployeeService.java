/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Employee;
import com.techdynamics.employeeskillmanagement.repository.EmployeeRepository;

/**
 * @author aditya raj
 *
 */

@Service
public class EmployeeService extends BaseService<Employee> {

	public EmployeeService(EmployeeRepository employeeRepository) {
		super(employeeRepository);
	}

}
