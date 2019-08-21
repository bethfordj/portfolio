package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;


public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> instructors = new ArrayList<String>();
		
		// Can add to the List using the add() method
		instructors.add("John");
		instructors.add("Steve");
		instructors.add("Andrew");
		instructors.add("Stephanie");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
								// Can get the length of the List using size()
		for ( int i = 0 ; i < instructors.size() ; i++) {
			// Can get an item by index using the get(index) method
			System.out.println(instructors.get(i));
		}

		
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		instructors.add("John");

		for ( int i = 0 ; i < instructors.size() ; i++) {
			System.out.println(instructors.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		// Add can also take 2 arguments  ( index, value ) 
		instructors.add(2, "Rachelle");
		
		for ( int i = 0 ; i < instructors.size() ; i++) {
			System.out.println(instructors.get(i));
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		// Can remove from the list by index using remove(index)
		instructors.remove(5);
		
		for ( int i = 0 ; i < instructors.size() ; i++) {
			System.out.println(instructors.get(i));
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");	

		boolean isAndrewInInstructors = instructors.contains("Andrew");
		System.out.println("Andrew is in the the list: " + isAndrewInInstructors);


		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		// Declare an Array       =   Pass toArray a new Array of the proper type and size to be filled
		String[] instructorsArray = instructors.toArray(new String[instructors.size()]);

		// Collections can only use Reference Types
		//List<int> numbers = new ArrayList<int>();

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");
		
		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation 
		 * of a primitive value */
		Integer employees = new Integer(25);		// Can be initialized with an int
		Integer piecesOfCake = new Integer("24");	// Or can be initialized with a String that contains an int
		
		if (employees > piecesOfCake) {
			System.out.println("Not enough cake");
		}
		
		Integer objX = 10;
		int intY = 20;
		intY = objX + 5;
		objX = intY + 10;
		
		Double accountBalance = null;
		// Since accountBalance is null, the next line causes a NullPointerException when autoboxing happens
		//double newBalance = accountBalance + 100;

		// Use the Wrapper classes with Collections
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(new Integer("50"));
		
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		for (Integer num : numbers) {
			System.out.println(num);
		}
		
		for (String name : instructors) {
			System.out.println(name);
		}
		
		// Equivalent standard for loop:
//		for ( int i = 0 ; i < instructors.size() ; i++) {
//			System.out.println(instructors.get(i));
//		}

		double[] doubles = { 2.5d, 3.67d, 1.2d, 0.75d };
		for (double d : doubles) {
			System.out.println( d * 2 );
		}
		
		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();

		Queue<String> tasks = new LinkedList<String>();
		
		// Add Items to the Queue with Offer
		tasks.offer("Clean dishes");
		tasks.offer("Sweep floor");
		tasks.offer("clean counters");
		tasks.offer("scrub ceiling");
		
		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////
		
		// Peek allows the next item to be viewed, without changing the list
		System.out.println("The next tasks is: " + tasks.peek());

		while (!tasks.isEmpty()) {
			// Use poll to get and remove the next item
			System.out.println(tasks.poll());
			System.out.println("Tasks remaining: " + tasks.size());
		}
		
		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		Stack<String> history = new Stack<String>();

		////////////////////
		// PUSHING ITEMS TO THE STACK
		//////////////////// 
		
		// Add items to the Stack using push
		history.push("http://www.google.com");
		history.push("http://cnn.com");
		history.push("http://techelevator.com");
		history.push("https://blog.codinghorror.com");
		history.push("http://dashboard.techelevator.com");
	

		////////////////////
		// POPPING THE STACK
		////////////////////
		while ( !history.isEmpty() ) {
			// Get and Remove the next item from the Stack using pop()
			String previousPage = history.pop();
			System.out.println("Previous Page: " + previousPage);
		}
		
		int[] nums = { 10, 20, 30, 40, 50 };
		Stack<Integer> numStack = new Stack<Integer>();
		for (int n : nums) {
			numStack.push(n);
		}
		while ( !numStack.isEmpty() ) {
			System.out.println(numStack.pop());
		}
	}
}
