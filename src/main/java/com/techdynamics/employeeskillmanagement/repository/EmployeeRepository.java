/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.employeeskillmanagement.entity.Employee;

/**
 * @author syadav
 *
 */

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
