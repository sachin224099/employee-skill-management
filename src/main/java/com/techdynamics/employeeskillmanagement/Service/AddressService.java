/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Address;
import com.techdynamics.employeeskillmanagement.entity.Employee;
import com.techdynamics.employeeskillmanagement.repository.AddressRepository;

/**
 * @author aditya raj
 *
 */
@Service
public class AddressService extends BaseService<Address> {

	private AddressRepository addressRepository;
	public AddressService(AddressRepository addressRepository) {
		super(addressRepository);
		this.addressRepository = addressRepository;
	}
	
	public List<Address> getAddressesByEmployee(Employee employee){
		return addressRepository.findByEmployee(employee);
	}
}
