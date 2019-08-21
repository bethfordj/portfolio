package com.techelevator;

public class HomeworkAssignment {
	
	// Constructor
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
		
	}
	
	// Data Members
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	// Getters and Setters
	public int getTotalMarks() {
		return totalMarks;
	}
	
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}
	
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	
	public String getLetterGrade() {
		if ((double)totalMarks/(double)possibleMarks >= 0.9) {
			return "A";
		}
		else if ((double)totalMarks/(double)possibleMarks >= 0.8) {
			return "B";
		}
		else if ((double)totalMarks/(double)possibleMarks >= 0.7) {
			return "C";
		}
		else if ((double)totalMarks/(double)possibleMarks >= 0.6) {
			return "D";
		}
		else {
			return "F";
		}
	}

	
	
	

}
