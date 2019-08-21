package com.techelevator;

import java.io.FileNotFoundException;
import java.util.List;


public class QuizMaker {


	private QuizParts quizVar = new QuizParts();
	private String[] qaSplitToArray;
	private List<String> qAList = quizVar.getqAList();
	private String quiz = quizVar.getQuiz();
	private UserIO userInput = new UserIO();
	private int answerFromUser = 0;
	
	public void run() throws FileNotFoundException {
		userInput.getFileNameFromUser();
		quizVar.getQuestions();
		qaSplitToArray = quizVar.getQaSplitToArray();
		getQuizQA();

	}
	
	
	public String getQuizQA() {
		while(qAList.get(0) != "") {
			quizVar.splitByQuestion(0);
			for(String placeHolder : qaSplitToArray) {
				if(placeHolder.contains("*")) {
					placeHolder = placeHolder.replace("*","");
				}
				quiz += placeHolder + System.getProperty("line.separator");
			}
		System.out.print(quiz);
		answerFromUser = userInput.getAnswerFromUser();
		userInput.getFeedback(quizVar.isCorrectAnswer(answerFromUser));
	}
	
	return null;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		QuizMaker qm = new QuizMaker();
		qm.run();
	}

}
