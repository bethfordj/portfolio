package com.techelevator.filesplitter;

import com.techelevator.filesplitter.userinput.Menu;

public class FileSplitterCLI {
	
	private Menu menu = new Menu();
	
	public void run() {
		String fileName = menu.getFileNameFromUser();
		
	}

	public static void main(String[] args) {
		FileSplitterCLI fs = new FileSplitterCLI();
		fs.run();
	}
	
	
	
	

}
