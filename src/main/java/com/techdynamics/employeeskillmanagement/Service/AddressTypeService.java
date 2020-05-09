/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import com.techdynamics.employeeskillmanagement.entity.AddressType;
import com.techdynamics.employeeskillmanagement.repository.AddressTypeRepository;

/**
 * @author aditya raj
 *
 */
@Service
public class AddressTypeService implements IService<AddressType> {

	@Autowired
	private AddressTypeRepository addressTypeRepository;

	@Override
	public List<AddressType> getAll() {
		List<AddressType> list = new ArrayList<>();
		 addressTypeRepository.findAll()
				.forEach(addt -> list.add(addt));
		return list;
	}

	@Override
	public AddressType getById(Long id) {
		return addressTypeRepository.findById(id).orElse(null);
	}

	@Override
	public void update(AddressType entity) {
		addressTypeRepository.save(entity);

	}

	@Override
	public void save(AddressType entity) {
		addressTypeRepository.save(entity);

	}

	@Override
	public void removeById(Long id) {
		addressTypeRepository.deleteById(id);

	}

	@Override
	public void remove(AddressType entity) {
		addressTypeRepository.delete(entity);

	}

}
