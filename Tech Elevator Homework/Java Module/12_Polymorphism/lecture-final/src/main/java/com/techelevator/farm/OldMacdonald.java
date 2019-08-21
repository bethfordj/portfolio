package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {
		
		Singable[] farmAnimals = new Singable[] { new Cow(), new Chicken(), new Sheep(), new Tractor(), new Dog(), new Truck()};
		
		for(Singable animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a "+name+", ee, ay, ee, ay, oh!");
			System.out.println("With a "+sound+" "+sound+" here");
			System.out.println("And a "+sound+" "+sound+" there");
			System.out.println("Here a "+sound+" there a "+sound+" everywhere a "+sound+" "+sound);
			System.out.println();
		}
		
		List<Sellable> animals = new ArrayList<Sellable>();
		animals.add(new Cow());
		animals.add(new Chicken());
		animals.add(new Sheep());
		animals.add(new Truck());
		animals.add(new Apple());
		
		
		for (Sellable animal : animals) {
			System.out.println("The " + animal.getName() + " costs $" + animal.getPrice());
			if (animal instanceof Singable) {
				Singable singer = (Singable) animal;
				System.out.println("and sings " + singer.getSound());
			}
		}
		
		
	}
}