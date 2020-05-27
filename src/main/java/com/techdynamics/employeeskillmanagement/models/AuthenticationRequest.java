package com.techdynamics.employeeskillmanagement.models;

public class AuthenticationRequest {
    private String username;
    private String pasword;
    
	public AuthenticationRequest(String username, String pasword) {
		super();
		this.username = username;
		this.pasword = pasword;
	}
	
	public AuthenticationRequest() {
		super();
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
    
    
}
