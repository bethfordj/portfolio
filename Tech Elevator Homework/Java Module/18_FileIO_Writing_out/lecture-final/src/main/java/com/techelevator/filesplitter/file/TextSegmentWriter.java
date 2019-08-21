package com.techelevator.filesplitter.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TextSegmentWriter implements SegmentWriter {

	@Override
	public void write(List<String> lines, String filename, int segment) throws IOException {

		File outputFile = new File(filename + segment);
		
		try (PrintWriter writer = new PrintWriter(outputFile); 
				BufferedWriter buffered = new BufferedWriter(writer) ) {
			
			for (String line : lines) {
				buffered.write(line + System.getProperty("line.separator"));
			}
			
		} 
		
		 
	}

}
