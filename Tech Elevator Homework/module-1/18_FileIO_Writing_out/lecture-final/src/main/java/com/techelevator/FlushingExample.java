package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FlushingExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// When we use BufferedWriter we have to add the \n manually1
		String message = "Another Line \n";
		
		// The File Object the identifies the file to write to
		File file = new File("flushing.txt");
		
		// The PrintWriter gives us access to write to the file
		// The BufferedWriter provides buffering to the output in case the file access can't keep up
		try (PrintWriter writer = new PrintWriter(file);
				BufferedWriter buffered = new BufferedWriter(writer)) {
			
			while (true) {
				buffered.write(message);
				
				/*
				 *  Don't worry about this line, it throttles the writing to once every
				 *  half a second so the file doesn't fill up too fast
				 */
				Thread.sleep(500);
				buffered.flush();
			}
		}

	}

}
