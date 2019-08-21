package com.techelevator.filesplitter.userinput;

import java.util.Scanner;

public class Menu {

	private Scanner in = new Scanner(System.in);
	
	public String getFileNameFromUser() {
		System.out.println("Path to file to split >>>");
		return in.nextLine();
	}
	
	public void displayMessageToUser(String message) {
		System.out.println(message);
		System.out.flush();
	}
}
