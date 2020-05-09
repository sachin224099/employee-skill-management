/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import com.techdynamics.employeeskillmanagement.entity.ContactType;
import com.techdynamics.employeeskillmanagement.repository.ContactTypeRepository;

/**
 * @author aditya raj
 *
 */

@Service
public class ContactTypeService implements IService<ContactType> {

	@Autowired
	private ContactTypeRepository contactTypeRepository;

	@Override
	public List<ContactType> getAll() {
		List<ContactType> list = new ArrayList<>();
		 contactTypeRepository.findAll()
	                              .forEach(conT -> list.add(conT));
		 return list;
	}

	@Override
	public ContactType getById(Long id) {
		return contactTypeRepository.findById(id).orElse(null);
	}

	@Override
	public void update(ContactType entity) {
		contactTypeRepository.save(entity);

	}

	@Override
	public void save(ContactType entity) {
		contactTypeRepository.save(entity);

	}

	@Override
	public void removeById(Long id) {
		contactTypeRepository.deleteById(id);

	}

	@Override
	public void remove(ContactType entity) {
		contactTypeRepository.delete(entity);

	}

}
