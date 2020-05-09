/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Address;
import com.techdynamics.employeeskillmanagement.repository.AddressRepository;

/**
 * @author aditya raj
 *
 */
@Service
public class AddressService implements IService<Address> {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public List<Address> getAll() {
		 return addressRepository.findAll();
	}

	@Override
	public Address getById(Long id) {
		return addressRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Address entity) {
		addressRepository.save(entity);

	}

	@Override
	public void save(Address entity) {
		addressRepository.save(entity);

	}

	@Override
	public void removeById(Long id) {
		addressRepository.deleteById(id);

	}

	@Override
	public void remove(Address entity) {
		addressRepository.delete(entity);

	}

}
