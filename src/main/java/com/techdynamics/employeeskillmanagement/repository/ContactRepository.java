/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.employeeskillmanagement.entity.Contact;

/**
 * @author syadav
 *
 */

public interface ContactRepository extends CrudRepository<Contact, Long>{

}
