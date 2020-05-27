package com.techdynamics.employeeskillmanagement.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.techdynamics.employeeskillmanagement.repository.UserRepository;

@Service
public class WebUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		com.techdynamics.employeeskillmanagement.entity.User user = userRepository.findByUserName(userName).orElseGet(null);
		if(user != null)
		return new User(user.getUserName(), user.getPassword(), user.getRoles());
		
		return new User(userName, "", new ArrayList<>());
	}

}
