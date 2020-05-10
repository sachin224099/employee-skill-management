/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdynamics.employeeskillmanagement.entity.Contact;
import com.techdynamics.employeeskillmanagement.entity.Employee;

/**
 * @author syadav
 *
 */

public interface ContactRepository extends JpaRepository<Contact, Long>{
	List<Contact> findByEmployee(Employee employee);
	
}
