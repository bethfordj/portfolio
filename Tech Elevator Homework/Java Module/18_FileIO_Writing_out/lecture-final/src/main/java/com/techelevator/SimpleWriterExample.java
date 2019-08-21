package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SimpleWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		
		File ourFile = new File("numbers.txt");
		
		try(PrintWriter writer = new PrintWriter(ourFile)) {
			
			for (int i = 1 ; i <= 100 ; i++) {
				
				writer.println("Line " + i);
				
			}
			
		}
		
	}
	
}
