package com.techdynamics.employeeskillmanagement.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techdynamics.employeeskillmanagement.Service.AddressService;
import com.techdynamics.employeeskillmanagement.Service.ContactService;
import com.techdynamics.employeeskillmanagement.Service.EmployeeService;
import com.techdynamics.employeeskillmanagement.Service.SkillService;
import com.techdynamics.employeeskillmanagement.entity.Address;
import com.techdynamics.employeeskillmanagement.entity.Contact;
import com.techdynamics.employeeskillmanagement.entity.Employee;
import com.techdynamics.employeeskillmanagement.entity.Skill;
import com.techdynamics.employeeskillmanagement.messages.Message;

/**
 * @author syadav
 *
 */
@RestController
@RequestMapping(path = "/rest/api/employees")
public class EmployeeController extends BaseController<Employee> {

	private EmployeeService employeeService;

	@Autowired
	private ContactService contactService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private SkillService skillService;

	public EmployeeController(EmployeeService employeeService) {
		super(employeeService);
		this.employeeService = employeeService;
	}


	@RequestMapping(path = "{employeeId}/contact", method = RequestMethod.POST)
	public Message addContact(@PathVariable Long employeeId, @RequestBody Contact contact) {
		if (employeeService.isEmployeeExistById(employeeId)) {
			Employee employee = employeeService.getById(employeeId);
			contact.setEmployee(employee);
			contactService.save(contact);
			return new Message("Contact saved");
		} else {
			return new Message("Contact not saved");
		}
	}

	@RequestMapping(path = "{employeeId}/contact", method = RequestMethod.GET)
	public List<Contact> getAllContactsByEmployeeId(@PathVariable Long employeeId) {
		if (employeeService.isEmployeeExistById(employeeId)) {
			Employee employee = employeeService.getById(employeeId);
			return contactService.getContactsByEmployee(employee);
		} else {
			return new ArrayList<>();
		}
	}

	@RequestMapping(path = "{employeeId}/address", method = RequestMethod.POST)
	public Message addAddress(@PathVariable Long employeeId, @RequestBody Address address) {
		if (employeeService.isEmployeeExistById(employeeId)) {
			Employee employee = employeeService.getById(employeeId);
			address.setEmployee(employee);
			addressService.save(address);
			return new Message("Address saved");
		} else {
			return new Message("Address not saved");
		}
	}

	@RequestMapping(path = "{employeeId}/address", method = RequestMethod.GET)
	public List<Address> getAllAddressesByEmployeeId(@PathVariable Long employeeId) {
		if (employeeService.isEmployeeExistById(employeeId)) {
			Employee employee = employeeService.getById(employeeId);
			return addressService.getAddressesByEmployee(employee);
		} else {
			return new ArrayList<>();
		}
	}

	@RequestMapping(path = "{employeeId}/skill", method = RequestMethod.POST)
	public Message addSkill(@PathVariable Long employeeId, @RequestBody Skill skill) {
		if (employeeService.isEmployeeExistById(employeeId)) {
			Employee employee = employeeService.getById(employeeId);
			skill.setEmployee(employee);
			skillService.save(skill);
			return new Message("Skill saved");
		} else {
			return new Message("Skill not saved");
		}
	}

	@RequestMapping(path = "{employeeId}/skill", method = RequestMethod.GET)
	public List<Skill> getAllSkillsByEmployeeId(@PathVariable Long employeeId) {
		if (employeeService.isEmployeeExistById(employeeId)) {
			Employee employee = employeeService.getById(employeeId);
			return skillService.getSkillsByEmployee(employee);
		} else {
			return new ArrayList<>();
		}
	}

}
