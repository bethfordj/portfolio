public class EarthToSunWeightConverter {

	/*
	 * String[] args contains arguments passed on the command like, for example, for 
	 * an application like git, if we typed git add -A, then git would be the program and 
	 * args would contain  args[0] = "add"  and args[1] = "-A".
	 * 
	 * This allows the user to give our program commands or feed it data from the terminal
	 * command line when they run it.
	 */
	public static void main(String[] args) {
		
		int sunGravity = 28;
		
		/*
		 * How could we display all the arguments passed into the args array?
		 */

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);

	
		}

		System.out.printf("\n%-15s  %-15s", "Earth (lbs)", "Sun (lbs)");
		System.out.println("\n___________________________\n");

		for (int i = 0; i < args.length; i++) {

		int weightOnEarth = Integer.parseInt(args[i]);
		int weightOnTheSun = weightOnEarth * sunGravity;
		
		System.out.printf("%-15s  %-15s", weightOnEarth, weightOnTheSun);
		System.out.println();
		}

		/*
		 * How could we use those arguments in our calculator program?
		 */


	}

}