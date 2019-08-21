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
		
		String[] choices = {"Rock", "Paper", "Scissors"};
		
		Scanner in = new Scanner (System.in);
		
		int tie = 0;
		
		int playerWin = 0;
		
		int computerWin = 0;
		
		for ( ; true ; ) {
			System.out.println("Select Rock (1), Paper (2), or Scissors (3) to play. Select 0 to quit. ");
			int userChoice = in.nextInt();
			in.nextLine();
			
			if (userChoice < 0 || userChoice > 3) {
			System.out.println("*** INVALID SELECTION ***");
			continue;
			}
			
			if (userChoice == 0) {
			System.out.println("Thank you for playing!");
			break;
			}
			
			int computerChoice = (int)(Math.random() * 3) + 1;
			System.out.println("You chose " + choices[userChoice-1]+".");
			System.out.println("The computer chose " + choices[computerChoice-1]+".");
			
			if (userChoice==computerChoice) {
			System.out.println("You tied!");
			tie++;
			}
			
			else if ((userChoice == 1 && computerChoice == 3)||
					(userChoice > computerChoice + 1)){
				System.out.println("You won!");
				playerWin++;
				}
			else {
				
				System.out.println("The computer won. Better luck next time!");
				computerWin++;
				}
		
		}
		System.out.printf("\n%-10s %-10s %-10s", "Player", "Computer", "Tie");
		System.out.println("\n------------------------------");
		System.out.printf("\n%-10s %-10s %-10s", playerWin, computerWin, tie);
		System.out.println("\nThanks for playing!");
	}
	
}
