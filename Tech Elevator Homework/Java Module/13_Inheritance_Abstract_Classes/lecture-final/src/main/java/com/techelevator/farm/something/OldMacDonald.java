package com.techelevator.farm.something;

import com.techelevator.farm.Blobert;
import com.techelevator.farm.Cat;
import com.techelevator.farm.Chicken;
import com.techelevator.farm.Cow;
import com.techelevator.farm.FarmAnimal;

public class OldMacDonald {
	public static void main(String[] args) {

		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Cat(true),
				new Blobert() };

		farmAnimals[1].sleep();
		// farmAnimals[1].kick(); This won't work, because we are not in the same
		// package...

		FarmAnimal weirdAnimal = new WeirdAnimal("Jellyfish", "bloop");
		// weirdAnimal.kick(); This won't work, because we are not in the same
		// package (even though the WeirdAnimal class is in the same package...

		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}
	}
}