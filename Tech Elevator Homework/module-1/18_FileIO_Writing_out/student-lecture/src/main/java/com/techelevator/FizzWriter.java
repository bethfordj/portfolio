package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws IOException  {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What number do you want to stop at >>>");
		int endCount = in.nextInt();
		in.nextLine();
		
		System.out.printf("What file name would you like? ");
		String fileName = in.nextLine();
		
		File fizzBuzzFile = new File(fileName);
		
		try(PrintWriter writer = new PrintWriter(fizzBuzzFile);
				BufferedWriter buffered = new BufferedWriter(writer)){
			
			
			for (int i = 1 ; i < endCount ; i++) {
				buffered.write(getFizzBuzz(i) + System.getProperty("line.separator"));
			}
		}
		try(Scanner reader = new Scanner(fizzBuzzFile)){
			while (reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
		}

		
	}
	
	
	private static String getFizzBuzz(int i) {
		String line = "";
		
		if (i % 3 == 0) {
			line += "Fizz";
		}
		if (i % 5 == 0) {
			line += "Buzz";
		}
		
		return line.length() > 0 ? line : String.valueOf(i);
	}

}
