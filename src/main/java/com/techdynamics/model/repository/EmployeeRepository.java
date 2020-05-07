/**
 * 
 */
package com.techdynamics.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.model.entity.Employee;

/**
 * @author syadav
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
