package com.techelevator.validation.model;

import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.NotBlank;

public class Login {
	
	
	@NotBlank(message="An email address is required.")
	private String email;
	
	@NotBlank(message="A password is required.")
	private String password;
	
	
	private boolean emailValid;
	
	@AssertTrue(message="invalid email")
	public boolean isEmailValid() {
		if (email != null) {
			return email.contains("@");
		}
		else {
			return false;
		}
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
