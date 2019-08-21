package com.techelevator;

public class RectangleDemo {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle(10,20);
		Rectangle rectangle2 = new Rectangle(-8,-15);
		


		System.out.println(rectangle1.isLargerThan(rectangle2));
		System.out.println(rectangle1.isLargerThan(-8,-15));
		
		System.out.println(rectangle1);
		System.out.println(rectangle2);
	}

}
