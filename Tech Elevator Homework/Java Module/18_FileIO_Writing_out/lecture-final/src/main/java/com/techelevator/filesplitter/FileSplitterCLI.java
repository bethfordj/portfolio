package com.techelevator.filesplitter;

import java.io.File;
import java.io.IOException;

import com.techelevator.filesplitter.file.FileProcessor;
import com.techelevator.filesplitter.userinput.Menu;

public class FileSplitterCLI {

	private Menu menu = new Menu();
	
	public void run() {
		
		// Get A File name from the user
		File inputFile = getFile();
		
		// Get the number lines to split on
		int lineCount = getLineCount();
		
		// Use something Split the file
		FileProcessor processor = new FileProcessor();
		try {
			processor.split(inputFile, lineCount);
		} catch (IOException e) {
			menu.displayMessageToUser("An Unexpected error occurred");
			throw new RuntimeException(e);
		}
		
	}
	
	
	// TODO: Finish getting line count from the user
	private int getLineCount() {
		return 700;
	}
	
	private File getFile() {
		File file = null;
		while (file == null) {
			String fileName = menu.getFileNameFromUser();
			file = new File(fileName);
			if (!file.exists() || !file.isFile()) {
				menu.displayMessageToUser(file.getAbsolutePath() + " does not exists.  Please try again.");
				file = null;
			}
		}
		return file;
	}
	
	public static void main(String[] args) {
		FileSplitterCLI fs = new FileSplitterCLI();
		fs.run();
	}

}
