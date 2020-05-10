/**
 * 
 */
package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.ContactType;
import com.techdynamics.employeeskillmanagement.repository.ContactTypeRepository;

/**
 * @author aditya raj
 *
 */

@Service
public class ContactTypeService extends BaseService<ContactType> {

	public ContactTypeService(ContactTypeRepository contactTypeRepository) {
		super(contactTypeRepository);
	}

}
