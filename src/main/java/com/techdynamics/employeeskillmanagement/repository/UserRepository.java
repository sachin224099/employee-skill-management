package com.techdynamics.employeeskillmanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techdynamics.employeeskillmanagement.entity.User;



public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUserName(String userName);
	
	
}
