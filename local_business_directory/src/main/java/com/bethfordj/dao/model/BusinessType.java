package com.bethfordj.dao.model;

public class BusinessType {
	
	private Long typeId;
	private String specificType;
	private String generalType;
	
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public String getSpecificType() {
		return specificType;
	}
	public void setSpecificType(String specificType) {
		this.specificType = specificType;
	}
	public String getGeneralType() {
		return generalType;
	}
	public void setGeneralType(String generalType) {
		this.generalType = generalType;
	}

}
