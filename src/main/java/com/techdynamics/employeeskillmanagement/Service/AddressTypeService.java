/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.AddressType;
import com.techdynamics.employeeskillmanagement.repository.AddressTypeRepository;

/**
 * @author aditya raj
 *
 */
@Service
public class AddressTypeService extends BaseService<AddressType> {

	public AddressTypeService(AddressTypeRepository addressTypeRepository) {
		super(addressTypeRepository);
	}

}
