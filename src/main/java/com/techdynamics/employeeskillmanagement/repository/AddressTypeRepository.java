/**
 * 
 */
package com.techdynamics.employeeskillmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techdynamics.employeeskillmanagement.entity.AddressType;

/**
 * @author syadav
 *
 */

public interface AddressTypeRepository extends CrudRepository<AddressType, Long>{

}
