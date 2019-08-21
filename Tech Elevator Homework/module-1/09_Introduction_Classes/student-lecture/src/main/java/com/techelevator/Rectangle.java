package com.techelevator;

public class Rectangle {
	
    private int width;
    private int height;
	
	
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
		return this.width;
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
	
		return (this.width + this.height) > width + height;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Rectangle other = (Rectangle) obj;
		return this.width == other.width && this.height == other.height;	
	}
	
	
	@Override
	public String toString() {
		return this.width + "X" + this.height + " = " + this.getArea() + " square feet.";
	}
	
	
	
	
}


