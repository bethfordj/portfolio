package com.techelevator;

public class Airplane {
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	//Getters & Setters

	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
		public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass && totalFirstClassSeats - bookedFirstClassSeats>=totalNumberOfSeats) {
			bookedFirstClassSeats += totalNumberOfSeats;
			return true;
		}
		else if (!forFirstClass && totalCoachSeats - bookedCoachSeats>=totalNumberOfSeats){
			bookedCoachSeats += totalNumberOfSeats;
			return true;
		}
		else {
			return false;
		}
	}

	
	
	
	

}
