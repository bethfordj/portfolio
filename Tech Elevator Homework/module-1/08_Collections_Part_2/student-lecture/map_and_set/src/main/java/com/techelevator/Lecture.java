package com.techelevator;

import java.util.Map;
import java.util.Set;

import javax.swing.event.AncestorEvent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();
		
		/* DECLARING AND INSTANTIATING A MAP */
		
		Map<String, String> mapOfAnimalNoises = new HashMap<String,String>();
		

		
		
		

	

		
		/* ADDING ITEMS TO A MAP */
		mapOfAnimalNoises.put("Cow", "Moo");
		mapOfAnimalNoises.put("Lion","Roar");
		
		/* UPDATING AN ITEM IN A MAP */
		mapOfAnimalNoises.put("Tiger", "Roar");
		

		/* RETRIEVING AN ITEM FROM A MAP */
		String catNoise = mapOfAnimalNoises.get("Lion");
		System.out.println("The Lion says, " + catNoise);
		
		
		/* REMOVING AN ITEM FROM A MAP */

		String lionNoise = mapOfAnimalNoises.remove("Lion");
		System.out.println("The lion says " + lionNoise);
		
				
		String lionNoiseAfterRemove = mapOfAnimalNoises.remove("Lion");
		System.out.println("The lion says " + lionNoiseAfterRemove);
				
		
		/* CHECK IF AN ITEM EXISTS */
		System.out.println(mapOfAnimalNoises.containsKey("Cow"));
		System.out.println(mapOfAnimalNoises.containsValue("moo"));
		

		/* LOOPING OVER A MAP */
		

		for (String animalName : mapOfAnimalNoises.keySet()) {
			String noise = mapOfAnimalNoises.get(animalName);
			System.out.println(noise);
		}
		
		System.out.println();
		/* THE MAP KEY AND VALUE DATA TYPES */

		
					
		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		// Map<Integer, String> numbersToWords = new HashMap<Integer, String>(); 
		// Map<Integer, String> numbersToWords = new LinkedHashMap<Integer, String>(); 

		Map<Integer, String> numbersToWords = new TreeMap<Integer, String>();
		numbersToWords.put(2, "Two");
		numbersToWords.put(10, "Ten");
		numbersToWords.put(1, "One");

		for (Integer number : numbersToWords.keySet()) {

		System.out.println(number + " is " + numbersToWords.get(number));
		}
		
		
		
		/* DECLARE AND INSTANTIATE A HashSet */
					
		//Set<Integer> setOfNumbers = new HashSet<Integer>();
		Set<Integer> setOfNumbers = new LinkedHashSet<Integer>();
		
		
		/* ADD ITEMS TO THE SET */
		setOfNumbers.add(1);
		setOfNumbers.add(10);
		setOfNumbers.add(201);
		setOfNumbers.add(201);
		
		/* LOOP OVER A SET */
		for (Integer number : setOfNumbers) {
			System.out.println(number);
			}

		
		System.out.println();
		/* USE A SET TO REMOVE DUPLICATES AND ORDER THE ARRAY */
		String[] instructors = {"Rachelle", "John", "Andrew", "John", "Stephanie", "Rachelle", "Steve", "John", "Steve" };
		
		Set<String> instructorSet = new TreeSet<String>();
		for (String instructor : instructors) {
			instructorSet.add(instructor);
		}
		for (String instructor : instructorSet) {
			System.out.println(instructor);
		}

	}

}
