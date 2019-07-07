package com.bethfordj.dao.model;

public class Business {
	
	private long businessId;
	private String businessName;
	private String slogan;
	private String imageName;
	private BusinessType type;
	private ContactInfo contact;
	private Address address;
	private double rating;
	

	public long getBusinessId() {
		return businessId;
	}
	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public BusinessType getType() {
		return type;
	}
	public void setType(BusinessType type) {
		this.type = type;
	}
	public ContactInfo getContact() {
		return contact;
	}
	public void setContact(ContactInfo contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
