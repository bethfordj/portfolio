package com.techelevator;

public class Elevator {
	
	public Elevator(int totalNumberOfFloors) {
		numberOfFloors = totalNumberOfFloors;
	}

	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;

	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if (!doorOpen && desiredFloor<=numberOfFloors && desiredFloor > currentFloor) {
			currentFloor = desiredFloor;
		}
	}
	
	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor>=1 && desiredFloor < currentFloor) {
			currentFloor = desiredFloor;
		}
	}
	
	
	
	
	
	
}

