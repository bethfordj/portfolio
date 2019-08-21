package com.techelevator;

public class TriangleClassifier {

	private final static String TYPE_INVALID = "invalid";
	private final static String TYPE_EQUILATERAL = "equilateral";
	private final static String TYPE_ISOSCELES = "isosceles";
	private final static String TYPE_SCALENE = "scalene";
	
	public String classify(int sideOne, int sideTwo, int sideThree) {
		
		if (isValidTriangle(sideOne, sideTwo, sideThree) == false) {
			return TYPE_INVALID;
		}

		if (isEquilateral(sideOne, sideTwo, sideThree)) {
			return TYPE_EQUILATERAL;
		}
		
		if (isIsosceles(sideOne, sideTwo, sideThree)) {
			return TYPE_ISOSCELES;
		}
		
		if (isScalene(sideOne, sideTwo, sideThree)) {
			return TYPE_SCALENE;
		}
		
		return TYPE_INVALID;
	}

	
	private boolean isScalene(int sideOne, int sideTwo, int sideThree) {
		if (sideOne != sideTwo && sideOne != sideThree && sideTwo != sideThree) {
			return true;
		}
		return false;
	}
	
	private boolean isIsosceles(int sideOne, int sideTwo, int sideThree) {
		if ((sideOne == sideTwo && sideOne != sideThree) ||
				(sideOne == sideThree && sideOne != sideTwo) ||
				(sideTwo == sideThree && sideTwo != sideOne)) {
			return true;
		}
		return false;
	}
	
	private boolean isEquilateral(int sideOne, int sideTwo, int sideThree) {
		if (sideOne == sideTwo && sideOne == sideThree) {
			return true;
		}
		return false;
	}

	private boolean isValidTriangle(int sideOne, int sideTwo, int sideThree) {
		if (sideOne < 1 || sideTwo < 1 || sideThree < 1) {
			return false;
		}
		
		if ((sideOne + sideTwo < sideThree) || 
				(sideOne + sideThree < sideTwo) ||
				(sideTwo + sideThree < sideOne)) {
			return false;
		}
		return true;
	}
}