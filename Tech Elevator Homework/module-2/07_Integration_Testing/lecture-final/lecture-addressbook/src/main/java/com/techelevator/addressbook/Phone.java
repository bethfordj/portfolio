package com.techelevator.addressbook;

public class Phone {

	private int phoneId;
	private int personId;
	private String category;
	private String categoryDescription;
	private String phoneNumber;
	
	
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", personId=" + personId + ", category=" + category
				+ ", categoryDescription=" + categoryDescription + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
