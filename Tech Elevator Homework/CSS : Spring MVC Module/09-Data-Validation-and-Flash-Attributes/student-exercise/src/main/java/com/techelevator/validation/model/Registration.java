package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message="Your first name is required.")
	@Length(max = 20, message="Names cannot be longer than 20 characters.")
	private String firstName;
	
	@Length(max = 20, message="Names cannot be longer than 20 characters.")	
	@NotBlank(message="Your last name is required.")
	private String lastName;
	
	@NotBlank(message="An email address is required.")
	private String email;
	
	@NotBlank(message="An email address is required.")
	private String verifyEmail;
	
	@Length(min = 8, message="Passwords must be longer than 8 characters.")	
	@NotBlank(message="A password is required.")
	private String password;
	
	@NotBlank(message="A password is required.")
	private String verifyPassword;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotBlank(message="Your birth date is required.")
	private LocalDate birthDate;
	
	@Min(value=1, message="# of tickets must be between 1 and 10.")
	@Max(value=10, message="# of tickets must be between 1 and 10.")
	private int numberOfTickets;

	
	
	private boolean ticketNotBlank;
	
	@AssertTrue(message="# of tickets must be between 1 and 10.")
	public boolean isTicketNotBlank() {
	   if (numberOfTickets > 0) {
	        return true;
	    }
	    else {
	        return false;
	     }
	}
	
	
	
	private boolean emailMatching;
	
	@AssertTrue(message="Email address does not match.")
	public boolean isEmailMatching() {
	   if (email != null) {
	        return email.equals(verifyEmail);
	    }
	    else {
	        return false;
	     }
	}
	   
	private boolean passwordMatching;
	   
	@AssertTrue(message="Passwords do not match.")
	public boolean isPasswordMatching() {
	   if (password != null) {
	        return password.equals(verifyPassword);
	    }
	    else {
	        return false;
	     }
	
}
	
	private boolean emailFormatting;
	
	@AssertTrue(message="invalid email")
	public boolean isEmailFormatting() {
		if (email != null) {
			return email.contains("@");
		}
		else {
			return false;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public void setEmailMatching(boolean emailMatching) {
		this.emailMatching = emailMatching;
	}

	public void setPasswordMatching(boolean passwordMatching) {
		this.passwordMatching = passwordMatching;
	}

	public void setEmailFormatting(boolean emailFormatting) {
		this.emailFormatting = emailFormatting;
	}



}