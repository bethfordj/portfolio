package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuizParts {
	
	private List <String> qAList = new ArrayList<String>();
	UserIO nameInput = new UserIO();
	String[] qaSplitToArray = null;
	File fileName = new File(nameInput.getFileNameFromUser());
	int correctAnswer = 0;
	String quiz = "";
	
	
	
	public void getQuestions() throws FileNotFoundException {
		try(Scanner fileScanner = new Scanner(fileName)){
			while(fileScanner.hasNextLine()){
				String line = fileScanner.nextLine();
				if (line == "") {
					continue;
				}
				qAList.add(line);
			}
		}
	
	}
	
	public void splitByQuestion(int index) {
		qaSplitToArray = (qAList.get(index)).split("|");
		qAList.remove(index);
	}
	
	
	public boolean isCorrectAnswer(int input) {

		if(qaSplitToArray[1].contains("*")) {
			correctAnswer = 1;
		}
		else if (qaSplitToArray[2].contains("*")) {
			correctAnswer = 2;
		}
		else if (qaSplitToArray[3].contains("*")) {
			correctAnswer = 3;
		}
		else if (qaSplitToArray[4].contains("*")) {
			correctAnswer = 4;
		}
	
		if(correctAnswer == input) {
			return true;
		}
		return false;
	}
	

	public List<String> getqAList() {
		return qAList;
	}

	public String[] getQaSplitToArray() {
		return qaSplitToArray;
	}

	public String getQuiz() {
		return quiz;
	}



}
