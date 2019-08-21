package com.techelevator;

public class Employee {
	
	public Employee(int employeeID, String firstName, String lastName, double salary) {

		this.employeeId = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
		
	}
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public void raiseSalary(double percent) {
		annualSalary += (int)((percent/100) * annualSalary);
	}

}
