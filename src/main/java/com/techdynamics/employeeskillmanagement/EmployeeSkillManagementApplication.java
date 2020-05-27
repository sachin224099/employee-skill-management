package com.techdynamics.employeeskillmanagement;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class EmployeeSkillManagementApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EmployeeSkillManagementApplication.class);
		//SpringApplication.run(CourseApiApp.class, args);
		
		 app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8083"));
		        
		        
		        app.run(args);
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
