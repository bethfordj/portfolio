package com.techelevator;

import java.util.Scanner;

public class UserIO {
	
	private Scanner in = new Scanner(System.in);
	
	
	public String getFileNameFromUser() {
	System.out.print("Where is the quiz file? ");
	return in.nextLine();
	}
	
	public int getAnswerFromUser() {
	System.out.print("Your answer: ");
	return in.nextInt();
	}
	
	public void getFeedback(boolean isCorrect) {
		if(isCorrect) {
			System.out.println("That's correct!");
		}
		System.out.println("Sorry! That is incorrect!");
	}

}
