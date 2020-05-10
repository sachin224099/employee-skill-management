/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdynamics.employeeskillmanagement.entity.Address;
import com.techdynamics.employeeskillmanagement.entity.Employee;

/**
 * @author syadav
 *
 */

public interface AddressRepository extends JpaRepository<Address, Long>{
	List<Address> findByEmployee(Employee employee);
	
}
