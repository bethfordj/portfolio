package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		
		System.out.println(remainingNumberOfBirds);

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int raccoonsInWoods = 3;
		int raccoonsThatWentHome = 2;
		int raccoonsLeftInWoods = raccoonsInWoods - raccoonsThatWentHome;
		

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfBees = 3;
		int numberOfFlowers = 5;
		int flowerBeeDifference = numberOfFlowers - numberOfBees;

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int firstPigeon = 1;
		int latePigeon = 1;
		int pigeonsEatingBreadcrumbs = firstPigeon + latePigeon;

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int originalOwls = 3;
		int additionalOwls = 2;
		int totalOwlsOnFence = originalOwls + additionalOwls;

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorkingOnHome = 2;
		int beaversSwimming = 1;
		int beaversStillWorking = beaversWorkingOnHome - beaversSwimming;

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int originalToucans = 2;
		int newToucans = 1;
		int totalToucansSitting = originalToucans + newToucans;
		

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int numberOfNuts = 2;
		int differenceBetweenSquirrelNuts = squirrelsInTree - numberOfNuts;
		System.out.println(differenceBetweenSquirrelNuts);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quartersFound = 25;
		int dimesFound = 10;
		int nickelsFound = 10;
		int centsFound = quartersFound + dimesFound + nickelsFound;
		
		System.out.println(centsFound);

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int muffinsFromMrsBriersClass = 18;
		int muffinsFromMrsMacAdamsClass = 20;
		int muffinsFromMrsFlannerysClass = 17;
		int muffinsBakedByFirstGrade = muffinsFromMrsBriersClass + muffinsFromMrsFlannerysClass + muffinsFromMrsMacAdamsClass;
		
		System.out.println(muffinsBakedByFirstGrade);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyoCost = 24;
		int whistleCost = 14;
		int whistleYoyoTotalCost = yoyoCost + whistleCost;

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int smallMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + smallMarshmallows;
	

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		
		int mrsHiltsSnow = 29;
		int elementarySchoolSnow = 17;
		int totalSnowInches = mrsHiltsSnow + elementarySchoolSnow;

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		
		int originalHiltCents = 1000;
		int costOfToyTruck = 300;
		int costOfPencilCase = 200;
		int remainingHiltCents = originalHiltCents - costOfToyTruck - costOfPencilCase;

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int originalMarbleCollection = 16;
		int lostMarbles = 7;
		int newMarbleCollection = originalMarbleCollection - lostMarbles;

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int goalSeashells = 25;
		int startingSeashells = 19;
		int neededSeashells = goalSeashells - startingSeashells;

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBradBalloons = 17;
		int redBradBalloons = 8;
		int greenBradBalloons = totalBradBalloons - redBradBalloons;

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int originalNumberOfBooksOnShelf = 38;
		int booksMartaAdded = 10;
		int newNumberOfBooksOnShelf = originalNumberOfBooksOnShelf + booksMartaAdded;

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int oneBeesLegs = 6;
		int numberOfBeeLegs = 8;
		int eightBeesLegs = oneBeesLegs * numberOfBeeLegs;

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		int oneIceCreamConeCost = 99;
		int twoIceCreamConesCost = 2 * oneIceCreamConeCost;

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		
		int totalRocksNeededForBorder = 125;
		int currentNumberOfRocks = 64;
		int rocksNeededForBorder = totalRocksNeededForBorder - currentNumberOfRocks;

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int marblesMrsHiltHad = 38;
		int marblesMrsHiltLost = 15;
		int marblesMrsHiltHas = marblesMrsHiltHad - marblesMrsHiltLost;

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int concertTripDistance = 78;
		int distanceTraveledBeforeGas = 32;
		int distanceLeftToTravelToConcert = concertTripDistance - distanceTraveledBeforeGas;

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int saturdayMorningSnowShoveling = 90;
		int saturdayAfternoonSnowShoveling = 45;
		int saturdaySnowShovelingTotal = saturdayMorningSnowShoveling + saturdayAfternoonSnowShoveling;

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotDogsHiltBought = 6;
		int centsForOneHotDog = 50;
		int centsPaidForHotDogs = hotDogsHiltBought*centsForOneHotDog;

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int pencilBudgetOfHilt = 50;
		int pencilCostInCents = 7;
		int totalPencilsHiltCanBuy = 50/7;
	

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesHiltSaw = 33;
		int orangeButterfliesHiltSaw = 20;
		int redButterfliesHiltSaw = butterfliesHiltSaw - orangeButterfliesHiltSaw;

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int centsKateGave = 100;
		int costOfKatesCandy = 54;
		int centsKateShouldGetBack = centsKateGave - costOfKatesCandy;

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int existingTrees = 13;
		int treesMarkPlants = 12;
		int treesMarkHas = existingTrees + treesMarkPlants;

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		
		int daysTilJoySeesGrandma = 2;
		int hoursInADay = 24;
		int hoursTilJoySeesGrandma = daysTilJoySeesGrandma * hoursInADay;

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int howManyCousinsKimHas = 4;
		int piecesOfGumToGiveEach = 5;
		int piecesOfGumNeeded = howManyCousinsKimHas * piecesOfGumToGiveEach;

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int dollarsDanHadToStart = 3;
		int dollarsDanSpent = 1;
		int dollarsDanHasLeft = dollarsDanHadToStart - dollarsDanSpent;

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnTheLake = 5;
		int peopleInEachBoat = 3;
		int peopleOnBoatsOnTheLake = boatsOnTheLake * peopleInEachBoat;

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legosEllenHad = 380;
		int legosEllenLost = 57;
		int legosEllenHasLeft = legosEllenHad - legosEllenLost;

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		
		int goalNumberOfMuffinsToBake = 83;
		int currentNumberOfMuffinsBaked = 35;
		int muffinsLeftToBake = goalNumberOfMuffinsToBake - currentNumberOfMuffinsBaked;

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		
		int crayonsWillyHas = 1400;
		int crayonsLucyHas = 290;
		int differenceBetweenCrayonTotals = crayonsWillyHas - crayonsLucyHas;

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersPerPage = 10;
		int pagesOfStickers = 22;
		int stickerTotal = stickersPerPage * pagesOfStickers;

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalCupcakesToShare = 96;
		int childrenToShareCupcakes = 8;
		int cupcakesPerChild = totalCupcakesToShare / childrenToShareCupcakes;
		
		System.out.println(cupcakesPerChild);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int cookiesPerJar = 6;
		int cookiesNotInJars = 47 % 6;
		
		System.out.println(cookiesNotInJars);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissantsMarianPrepared = 59;
		int neighborsToShareWith = 8;
		int croissantsNotShared = 59 % 8;
		
		System.out.println(croissantsNotShared);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealCookiesBakedAtATime = 276;
		int oatmealCookiesPerTray = 12;
		int cookieTraysMarianNeeds = 276 / 12;

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzelsMarianPrepared = 480;
		int pretzelsInOneServing = 12;
		int servingsMarianPrepared = pretzelsMarianPrepared / pretzelsInOneServing;

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakesMarianBaked = 53;
		int lemonCupcakesLeftAtHome = 2;
		int lemonCupcakesPerBox = 3;
		int boxesOfLemonCupcakesGivenAway = (lemonCupcakesMarianBaked - lemonCupcakesLeftAtHome)/lemonCupcakesPerBox;
		
		System.out.println(boxesOfLemonCupcakesGivenAway);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int preppedCarrotSticks = 74;
		int peopleEatingCarrots = 12;
		int carrotsLeftUneaten = preppedCarrotSticks % peopleEatingCarrots;
		
		System.out.println(carrotsLeftUneaten);

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		
		int siblingTotalTeddyBears = 98;
		int shelfTeddyBearCapacity = 12;
		int shelvesFilledWithBears = siblingTotalTeddyBears / shelfTeddyBearCapacity;
		

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		
		int photosPerAlbum = 20;
		int familyPhotoTotal = 480;
		int photoAlbumsNeeded = familyPhotoTotal / photosPerAlbum;

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int joesTradingCards = 94;
		int cardsPerBox = 8;
		int filledBoxes = joesTradingCards / cardsPerBox;
		int boxlessCards = joesTradingCards % filledBoxes;

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int fathersBooks = 210;
		int repairedShelves = 10;
		int booksOnEachRepairedShelf = fathersBooks / repairedShelves;

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		
		float croissantsByCristina = 17f;
		int guestsOfCristina = 7;
		float bitOfCroissantPerGuest = croissantsByCristina / guestsOfCristina;
		
		System.out.println(bitOfCroissantPerGuest);

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		int oneRoom = 12*14;
		double billPaintingRate = oneRoom/2.15;
		double jillPaintingRate = oneRoom/1.90;
		int squareFeetToPaintFive = 5*oneRoom;
		double teamPaintingRate = billPaintingRate+jillPaintingRate;
		double timeToPaintFive = squareFeetToPaintFive / teamPaintingRate;
		long squareFeetToPaint623 = 623*oneRoom;
		double hoursToPaint623 = squareFeetToPaint623 / teamPaintingRate;
		double daysToPaint623 = hoursToPaint623 / 8;
		
		
		System.out.println(daysToPaint623);

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		
		String firstName = "Elizabeth";
		String lastName = "Ford, ";
		String middleInitial = " A.";
		String fullName = lastName + firstName + middleInitial;
		
		System.out.println(fullName);

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		
		float distanceBetweenNewYorkAndChicago = 800f;
		float distanceAlreadyTraveled = 537f;
		float percentageDecimalTraveled = (distanceAlreadyTraveled / distanceBetweenNewYorkAndChicago) * 100;
		int percentageTraveled = (int)percentageDecimalTraveled;

		
		System.out.println(percentageTraveled); 


	}

}
