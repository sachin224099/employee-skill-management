/**
 * 
 */
package com.techdynamics.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.model.entity.ContactType;

/**
 * @author syadav
 *
 */
@Repository
public interface ContactTypeRepository extends JpaRepository<ContactType, Long>{

}
