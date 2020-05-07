/**
 * 
 */
package com.techdynamics.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.model.entity.AddressType;

/**
 * @author syadav
 *
 */
@Repository
public interface AddressTypeRepository extends JpaRepository<AddressType, Long>{

}
