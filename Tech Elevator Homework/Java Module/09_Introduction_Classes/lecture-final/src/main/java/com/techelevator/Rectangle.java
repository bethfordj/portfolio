package com.techelevator;

public class Rectangle {

	// Member Variables
	private int height;
	private int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = Math.abs(width);
		this.height = Math.abs(height);
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setHeight(int height) {
		this.height = Math.abs(height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = Math.abs(width);
	}
	
	public int getArea() {
		return this.height * this.width;
	}
	
	public boolean isLargerThan(Rectangle other) {
		return this.getArea() > other.getArea();
	}
	
	public boolean isLargerThan(int width, int height) {
		return (this.height * this.width) > width * height;
	}
	
	@Override
	public String toString() {
		return this.width + "X" + this.height + " = " + this.getArea() + " square feet";
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle other = (Rectangle) obj;
		return this.height == other.height && this.width == other.width;
	}
	
}
