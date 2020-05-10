/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Contact;
import com.techdynamics.employeeskillmanagement.entity.Employee;
import com.techdynamics.employeeskillmanagement.repository.ContactRepository;

/**
 * @author aditya raj
 *
 */

@Service
public class ContactService extends BaseService<Contact> {

	private ContactRepository contactRepository;
	public ContactService(ContactRepository contactRepository) {
		super(contactRepository);
		this.contactRepository = contactRepository;
	}
	
	public List<Contact> getContactsByEmployee(Employee employee){
		return contactRepository.findByEmployee(employee);
	}
}
