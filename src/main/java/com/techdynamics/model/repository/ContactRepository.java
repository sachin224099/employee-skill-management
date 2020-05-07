/**
 * 
 */
package com.techdynamics.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.model.entity.Contact;

/**
 * @author syadav
 *
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{

}
