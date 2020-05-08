/**
 * 
 */
package com.techdynamics.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdynamics.model.entity.AddressType;
import com.techdynamics.model.repository.AddressTypeRepository;

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
		return addressTypeRepository.findAll();
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
