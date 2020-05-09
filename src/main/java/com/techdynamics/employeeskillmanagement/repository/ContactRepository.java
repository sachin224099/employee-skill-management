/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdynamics.employeeskillmanagement.entity.Contact;

/**
 * @author syadav
 *
 */

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
