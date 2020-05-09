package com.techdynamics.employeeskillmanagement;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeSkillManagementApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EmployeeSkillManagementApplication.class);
		//SpringApplication.run(CourseApiApp.class, args);
		
		 app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8083"));
		        
		        
		        app.run(args);
	}

}
