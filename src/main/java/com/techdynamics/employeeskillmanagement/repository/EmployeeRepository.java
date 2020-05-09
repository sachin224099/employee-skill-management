/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdynamics.employeeskillmanagement.entity.Employee;

/**
 * @author syadav
 *
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
