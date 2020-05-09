/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import com.techdynamics.employeeskillmanagement.entity.Contact;
import com.techdynamics.employeeskillmanagement.repository.ContactRepository;

/**
 * @author aditya raj
 *
 */

@Service
public class ContactService implements IService<Contact> {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<Contact> getAll() {
		List<Contact> list =new ArrayList<>();
		 contactRepository.findAll()
		                    .forEach(con -> list.add(con));
		 return list;
	}

	@Override
	public Contact getById(Long id) {
		return contactRepository.findById(id).orElse(null);
	}

	@Override
	public void update(Contact entity) {
		contactRepository.save(entity);

	}

	@Override
	public void save(Contact entity) {
		contactRepository.save(entity);

	}

	@Override
	public void removeById(Long id) {
		contactRepository.deleteById(id);

	}

	@Override
	public void remove(Contact entity) {
		contactRepository.delete(entity);

	}

}
