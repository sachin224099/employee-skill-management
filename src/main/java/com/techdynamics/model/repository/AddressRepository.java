/**
 * 
 */
package com.techdynamics.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.model.entity.Address;

/**
 * @author syadav
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
