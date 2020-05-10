/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Address;
import com.techdynamics.employeeskillmanagement.repository.AddressRepository;

/**
 * @author aditya raj
 *
 */
@Service
public class AddressService extends BaseService<Address> {

	public AddressService(AddressRepository addressRepository) {
		super(addressRepository);
	}
}
