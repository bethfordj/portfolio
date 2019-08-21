package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);

			System.out.print("What is the file that should be searched? ");
			String fileName = in.nextLine();
			File file = new File(fileName);
			String line = "";
			int lineCount = 0;

			System.out.print("What is the search word you are looking for? ");
			String wordSearched = in.next();
			
			System.out.print("Should the search be case sensitive? (Y\\N) ");
			String caseSensitivity = in.next();

			try (Scanner fileScanner = new Scanner(file)) {
				while(fileScanner.hasNextLine()){
					line = fileScanner.nextLine();
					lineCount++;
					String[] words = line.split(" ");
					if(caseSensitivity.contains("Y")) {
						for(String placeholder : words) {
							if(placeholder.contains(wordSearched)) {
								System.out.println("(" + lineCount + ") " + line);
							}
						}
						
					}
					else {
						for(String placeholder : words) {
							if(placeholder.contains(wordSearched.toLowerCase())) {
								System.out.println("(" + lineCount + ") " + line);
							}
						}

					}
				}
			}
			catch (FileNotFoundException e) {
				System.out.println("File " + file.getAbsolutePath() + "not found!");
			}
			catch (NullPointerException e) {
				System.out.println("Null Pointer Exception");
			}

	
		
	

	}
}
