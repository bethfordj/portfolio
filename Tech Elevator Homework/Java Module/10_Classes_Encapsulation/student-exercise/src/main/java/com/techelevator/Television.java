package com.techelevator;

public class Television {
	
	private boolean isOn;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	public void turnOff() {
		isOn = false;
	}

	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	
	public void changeChannel(int newChannel) {
		if (isOn && newChannel >= 3 && newChannel <= 18) {
		currentChannel = newChannel;
		}
	}
	
	public void channelUp() {
		if (isOn) {
			if (currentChannel<=17) {
				currentChannel++;
			}
			else {
				currentChannel = 3;
			}
		}
	}
	
	public void channelDown() {
		if(isOn) {
			if (currentChannel >= 4) {
				currentChannel--;
			}
			else {
				currentChannel = 18;
			}
		}
	}
	
	public void raiseVolume() {
		if(isOn) {
			if (currentVolume<=9) {
				currentVolume++;
			}
		}
	}
	
	public void lowerVolume() {
		if(isOn) {
			if (currentVolume>=1) {
				currentVolume--;
			}
		}
	}
}
