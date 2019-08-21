package com.techelevator;

public class RectangleDemo {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(20, 10);
		Rectangle rect2 = new Rectangle(20, 10);
		
		System.out.println(rect1.isLargerThan(rect2));
		rect1.isLargerThan(20, 40);
		
	
		System.out.println(rect1);
		System.out.println(rect2);
		
		System.out.println("== " + (rect1 == rect2));
		System.out.println("equals() " + (rect1.equals(rect2)));
		
		
	}

}
