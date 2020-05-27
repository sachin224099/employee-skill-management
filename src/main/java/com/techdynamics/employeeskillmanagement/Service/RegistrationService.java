package com.techdynamics.employeeskillmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.entity.User;
import com.techdynamics.employeeskillmanagement.repository.UserRepository;

@Service
public class RegistrationService extends BaseService<User>{

	private UserRepository userRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public RegistrationService(UserRepository userRepository) {
		super(userRepository);
		this.userRepository = userRepository;
	}
	
	@Override
	public void save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		super.save(user);
	}
}
