package com.techelevator;

import java.util.Scanner;

public class RockPaperScissors {

	/*
	 * Command Line programs follow this structure:  Take Input, Calculate Data, Give Output
	 * 
	 * How could we use this structure, with what we know of Java, so far, to write a simple game
	 * like Rock, Paper, Scissors?
	 */
	public static void main(String[] args) {
		
		String[] choices = { "Rock", "Paper", "Scissors" };
		Scanner in = new Scanner(System.in);
		
		int ties = 0;
		int playerWins = 0;
		int computerWins = 0;
		
		for ( ; true ; ) { 
		
			System.out.print("Select (1) Rock, (2) Paper, (3) Scissors, or (0) to quit >>>");
			int userChoice = in.nextInt();
			in.nextLine();
			
			if ( userChoice < 0 || userChoice > 3) {
				System.out.println("*** INVALID SELECTION ***");
				continue;
			}
			
			if (userChoice == 0) {
				System.out.println("Thank you for playing!");
				break;
			}
			
			int computerChoice = (int) (Math.random() * 3) + 1;
			
			System.out.println("You chose " + choices[userChoice - 1]);
			System.out.println("The computer selected " + choices[computerChoice - 1]);
			
			if (userChoice == computerChoice) {
				System.out.println("Tie");
				ties++;
			} else if ( (userChoice == 1 && computerChoice == 3) || 
					(userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2) ) {
				System.out.println("The Player wins!");
				playerWins++;
			} else {
				System.out.println("The Computer wins!");
				computerWins++;
			}
		}
		
		System.out.printf("%-10s  %-10s  %-10s", "Player", "Computer", "Tie");
		System.out.println("\n-----------------------------------------");
		System.out.printf("%-10s  %-10s  %-10s", playerWins, computerWins, ties);
		
		
	}
}
