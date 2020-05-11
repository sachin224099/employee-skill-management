/**
 * 
 */
package com.techdynamics.employeeskillmanagement.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author syadav
 *
 */
@Entity
@Table(name = "employee")
public class Employee implements Serializable{

	private static final long serialVersionUID = 3816663760426613450L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dateOfBirth;
	private Date dateOfJoining;
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Contact> contacts;
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Address> addresses;
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Skill> skills;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public List<Contact> getContacts() {
		if(contacts == null)
			return new ArrayList<Contact>();
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public List<Address> getAddresses() {
		if(addresses == null)
		return new ArrayList<Address>();
		
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Skill> getSkills() {
		if(skills == null)
			return new ArrayList<Skill>();
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	
	
}
