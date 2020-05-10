/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.Contact;
import com.techdynamics.employeeskillmanagement.repository.ContactRepository;

/**
 * @author aditya raj
 *
 */

@Service
public class ContactService extends BaseService<Contact> {

	public ContactService(ContactRepository contactRepository) {
		super(contactRepository);
	}
}
