package puzzleMasters;

public class TheJourneyBegins {
	static String decision = ""; // Takes the user input
	public static Player p = new Player();
	static String miniGame1 = "";
	static String miniGame2 = "";
	static String miniGame3 = "";
	static String miniGame4 = "";
	static String miniGame5 = "";
	private static String currentScenario = "startMenu";
	private static int scorePoints;

	public static void main(String[] args) {
		System.out.println("Welcome to Puzzle Masters!");
		do {
			if (currentScenario.equals("startMenu")) {
				currentScenario = startMenu();
			} else if (currentScenario.equals("intro")) {
				currentScenario = intro();
			} else if (currentScenario.equals("chapterOneRebels")) {
				currentScenario = chapterOneRebels();
			} else if (currentScenario.equals("nerdsIntroGame")) {
				currentScenario = nerdsIntroGame();
			} else if (currentScenario.equals("nerdsStory")) {
				currentScenario = nerdsStory();
			} else if (currentScenario.equals("modernTransportation")) {
				currentScenario = modernTransportation();
			} else if (currentScenario.equals("arcadeQuestionOne")) {
				currentScenario = arcadeQuestionOne();
			} else if (currentScenario.equals("arcadeQuestionTwo")) {
				currentScenario = arcadeQuestionTwo();
			} else if (currentScenario.equals("arcadeQuestionThree")) {
				currentScenario = arcadeQuestionThree();
			} else if (currentScenario.equals("arcadeQuestionFour")) {
				currentScenario = arcadeQuestionFour();
			} else if (currentScenario.equals("arcadeQuestionFive")) {
				currentScenario = arcadeQuestionFive();
			} else if (currentScenario.equals("craneQuestionOne")) {
				currentScenario = craneQuestionOne();
			} else if (currentScenario.equals("craneQuestionTwo")) {
				currentScenario = craneQuestionTwo();
			} else if (currentScenario.equals("craneQuestionThree")) {
				currentScenario = craneQuestionThree();
			} else if (currentScenario.equals("egbertGameQ1")) {
				currentScenario = egbertGameQ1();
			} else if (currentScenario.equals("egbertGameQ2")) {
				currentScenario = egbertGameQ2();
			} else if (currentScenario.equals("egbertGameQ3")) {
				currentScenario = egbertGameQ3();
			} else if (currentScenario.equals("egbertGameQ4")) {
				currentScenario = egbertGameQ4();
			} else if (currentScenario.equals("egbertGameQ5")) {
				currentScenario = egbertGameQ5();
			} else if (currentScenario.equals("pocketMonsterEnterence")) {
				currentScenario = pocketMonsterEnterence();
			} else if (currentScenario.equals("reviseAnswers")) {
				currentScenario = reviseAnswers();
			}
		} while (!currentScenario.equals("goodEnd") && !currentScenario.equals("death")
				&& !currentScenario.equals("evilEnd") && !currentScenario.equals("weakEnd")
				&& !currentScenario.equals("heroEnd"));

		/**
		 * If the user completes the game or the user dies
		 */
		if (currentScenario.equals("goodEnd")) { // Game completed with good rep
			System.out.println(
					"\nCongratulations " + p.firstName + "! You have completed Puzzle masters with good morals!");
			breaker(20, ">//<");
			System.out.println("Your end result is: " + p.score + "\nYou have " + p.help + " hint(s) left.");
			if (p.goodEvil >= 75) {
				System.out.println("Your Good/Bad Metre is: Goodie Goodie, " + p.goodEvil);
			} else if (p.goodEvil > 50 && p.goodEvil < 75) {
				System.out.println("Your Good/Bad Metre is: Okay person, " + p.goodEvil);

			} else if (p.goodEvil == 50) {
				System.out.println("Your Good/Bad Metre is: Decent, " + p.goodEvil);
			} else if (p.goodEvil < 50 && p.goodEvil > 25) {
				System.out.println("Your Good/Bad Metre is: Delinquent, " + p.goodEvil);
			} else {
				System.out.println("Your Good/Bad Metre is: Devils Spawning, " + p.goodEvil);
			}
			breaker(20, ">//<");
			// if the user completes the game with a negative good/evil score
		} else if (currentScenario.equals("evilEnd")) {
			System.out.println(
					"\nCongratulations " + p.firstName + "! You have completed Puzzle masters with bad morals!");
			breaker(20, ">:) ");
			System.out.println("Your end result is: " + p.score + "\nYou have " + p.help + " hint(s) left.");
			if (p.goodEvil >= 75) {
				System.out.println("Your Good/Bad Metre is: Goodie Goodie, " + p.goodEvil);
			} else if (p.goodEvil > 50 && p.goodEvil < 75) {
				System.out.println("Your Good/Bad Metre is: Okay person, " + p.goodEvil);

			} else if (p.goodEvil == 50) {
				System.out.println("Your Good/Bad Metre is: Decent, " + p.goodEvil);
			} else if (p.goodEvil < 50 && p.goodEvil > 25) {
				System.out.println("Your Good/Bad Metre is: Delinquent, " + p.goodEvil);
			} else {
				System.out.println("Your Good/Bad Metre is: Devils Spawning, " + p.goodEvil);
			}
			breaker(20, ">:) ");
			// if the user dies
		} else if (currentScenario.equals("death")) {
			System.out.println("\n*Play your own pity music*");
			System.out.println("You have been defeated...");
			breaker(20, ">.< ");
			System.out.println("Your end result is: " + p.score + "\nYou have " + p.help + " hint(s) left.");
			if (p.goodEvil >= 75) {
				System.out.println("Your Good/Bad Metre is: Goodie Goodie, " + p.goodEvil);
			} else if (p.goodEvil > 50 && p.goodEvil < 75) {
				System.out.println("Your Good/Bad Metre is: Okay person, " + p.goodEvil);

			} else if (p.goodEvil == 50) {
				System.out.println("Your Good/Bad Metre is: Decent, " + p.goodEvil);
			} else if (p.goodEvil < 50 && p.goodEvil > 25) {
				System.out.println("Your Good/Bad Metre is: Delinquent, " + p.goodEvil);
			} else {
				System.out.println("Your Good/Bad Metre is: Devils Spawning, " + p.goodEvil);
			}
			breaker(20, ">.< ");
			// if the user is killed while being a hero
		} else if (currentScenario.equals("heroEnd")) {
			System.out.println("\nSadly " + p.firstName
					+ ", you have died... But, your sacrifice wasn't in vain, your name will forever be remembered");
			breaker(80, ".");
			System.out.println("Your end result is: " + p.score + "\nYou have " + p.help + " hint(s) left.");
			if (p.goodEvil >= 75) {
				System.out.println("Your Good/Bad Metre is: Goodie Goodie, " + p.goodEvil);
			} else if (p.goodEvil > 50 && p.goodEvil < 75) {
				System.out.println("Your Good/Bad Metre is: Okay person, " + p.goodEvil);

			} else if (p.goodEvil == 50) {
				System.out.println("Your Good/Bad Metre is: Decent, " + p.goodEvil);
			} else if (p.goodEvil < 50 && p.goodEvil > 25) {
				System.out.println("Your Good/Bad Metre is: Delinquent, " + p.goodEvil);
			} else {
				System.out.println("Your Good/Bad Metre is: Devils Spawning, " + p.goodEvil);
			}
			breaker(80, ".");
			// if the user completes the game as a coward
		} else {
			System.out.println(
					"\nCongratulations " + p.firstName + "! You have completed Puzzle masters by running in fear!");
			breaker(20, "+=+=");
			System.out.println("Your end result is: " + p.score + "\nYou have " + p.help + " hint(s) left.");
			if (p.goodEvil >= 75) {
				System.out.println("Your Good/Bad Metre is: Goodie Goodie, " + p.goodEvil);
			} else if (p.goodEvil > 50 && p.goodEvil < 75) {
				System.out.println("Your Good/Bad Metre is: Okay person, " + p.goodEvil);

			} else if (p.goodEvil == 50) {
				System.out.println("Your Good/Bad Metre is: Decent, " + p.goodEvil);
			} else if (p.goodEvil < 50 && p.goodEvil > 25) {
				System.out.println("Your Good/Bad Metre is: Delinquent, " + p.goodEvil);
			} else {
				System.out.println("Your Good/Bad Metre is: Devils Spawning, " + p.goodEvil);
			}
			breaker(20, "=+=+=");
		}
	}

	// Break up parts of text depending on "x" using breaker(x value);
	public static void breaker(int x) {
		breaker(x, "=");
	}

	// Change the symbol if the symbol needs to be changed
	public static void breaker(int x, String symbol) {
		for (int i = 0; i <= x; i++) {
			System.out.print(symbol);
		}
		System.out.println("");
	}

	// Output the users scores, rep, and hints left
	public static void pointOutput() {
		breaker(20, "><");
		System.out.println("Your Current Score is: " + p.score);
		// Check to see where the users personality stands
		if (p.goodEvil >= 75) {
			System.out.println("Your Good/Bad Metre is: Goodie Goodie, " + p.goodEvil);
		} else if (p.goodEvil > 50 && p.goodEvil < 75) {
			System.out.println("Your Good/Bad Metre is: Okay person, " + p.goodEvil);

		} else if (p.goodEvil == 50) {
			System.out.println("Your Good/Bad Metre is: Decent, " + p.goodEvil);
		} else if (p.goodEvil < 50 && p.goodEvil > 25) {
			System.out.println("Your Good/Bad Metre is: Delinquent, " + p.goodEvil);
		} else {
			System.out.println("Your Good/Bad Metre is: Devils Spawning, " + p.goodEvil);
		}
		System.out.println("You currently have " + p.help + " point(s) left");
		breaker(20, "><");
	}

	// The bonus question given if the user meets a certain criteria
	private static void bonusQuestionOne() {
		System.out.println(
				"What English word retains the same pronunciation, even after you take away four of its five letters?");
		decision = Keyboard.keyb.nextLine();
		if (decision.equalsIgnoreCase("Queue")) {
			p.score += 5;
			p.help += 1;
			System.out.println("That is correct!");
			System.out.println("You now have " + p.score + " points, and " + p.help + " hint(s).");
		} else {
			System.out.println("That is incorrect, sorry.");
			System.out.println("Your score will remain the same.");
		}
	}

	// The starting screen
	public static String startMenu() {
		String play = "";
		String toMain = "";
		do {
			System.out.println("To begin your journey type \"play\", for information type \"help\"");
			play = Keyboard.keyb.nextLine();
		} while (!play.equalsIgnoreCase("play") && !play.equalsIgnoreCase("help"));
		// if the user decides to "get help"
		if (play.equalsIgnoreCase("help")) {
			do {
				breaker(125);
				System.out.println(
						"As you continue to go through Puzzle Master, you will be given paths to go down. Be wise to which path you will be going down. \nTaking certain paths will make the game harder for you while others will help make it easier. \nWith the paths you are given, some paths will decrease your Good and Evil scale while others will increase it. \nYou will be required to complete the puzzle in general. You will not be required to restart the game if you fail a level but \nyou will have to continue to attempt the puzzle over and over until you complete it. \nYou will have friends along your path to help you through out the puzzles.\nBe aware of your good metre, having a metre at 50 is nuetral and anything above is good. Anything below 50 is considered bad.");
				breaker(125);
				System.out.println("Type \"yes\" when you finished.");

				toMain = Keyboard.keyb.nextLine();
			} while (!toMain.equalsIgnoreCase("yes"));
			return "intro";
		} else { // if the user types "play"
			return "intro";
		}
	}

	// The start of the game
	public static String intro() {
		System.out.println("Your jounrney begins now, enjoy your time!");
		breaker(50);
		System.out.println("PROLOGUE");
		breaker(50);
		System.out.println("*buzz*\n*buzz*\n*buzz*\n*click*");
		System.out.println(
				"\n\"Look at the time, I need to get up and fill my field trip form to go to Osaka Japan.\" \n -you");
		System.out.println("\n*You take out form and place it on the table*");
		System.out.println("\n\"First I need to fill in my first name.\" \n -you");
		p.firstName = Keyboard.keyb.nextLine();
		do {
			// Have the user pick a time
			System.out.println("\n*You turn over to check the time, it is...*");
			System.out.println(" A. 6:30am");
			System.out.println(" B. 9:00am");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
		// Check to see what time the user chose
		if (decision.equalsIgnoreCase("a")) {
			System.out.println("\n\"I still have lots of time before school starts.\"\n -you");
			System.out.println("\n*You go downstairs and eat breakfast*");
			System.out.println("*You finish your breakfast, grab your things and head for the door*");
			System.out.println("\n\"Bye mom!\" \n -you");
			System.out.println("\nBye " + p.firstName + "! \n -mom\n");
		} else {
			System.out.println("\n\"SHOOT! I'm going to be late for school!\"\n -you");
			System.out.println("\n*You grab your things and run down stairs*");
			System.out.println("\n\"Bye mom!\"\n -you");
			System.out.println("\n*Grab toast and run for the door*");
			System.out.println("\n\"Dammit " + p.firstName + ", you're always like this!\"\n -mom\n");
		}

		// Have the user decide the type of people they would like to hang out
		// with
		do {
			System.out.println("*You arrive at school to see your group of friends...*\n A. The nerds\n B. The rebels");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));

		if (decision.equalsIgnoreCase("a")) { // If the user chose nerds
			System.out.println("\"Hey " + p.firstName + ".\"\n -Lewis (The mathematician)");
			p.goodEvil += 10;
			p.group = new FriendGroup("nerds");
			do {
				System.out.println(
						"\n\"We were just trying to solve this riddle, would you like to help?\"\n -Margaret (Great at English)\n A. Yeah! \n B. Nah, I'll pass.");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// if the user would like to solve the puzzle
			if (decision.equalsIgnoreCase("a")) {
				return "nerdsIntroGame";
				// if the user doesn't want to solve the puzzle
			} else {
				System.out.println("\"Okay, we'll see you at the assembly\"\n -Egbert (Good at logic and science)\n");
				System.out.println("*You head to your class room first and enjoy a good reading*");
				System.out.println("*The bell rings*");
				System.out.println("*You head to the Gym and meet up with your friends once again*");
				System.out.println(
						"*The bell goes and you and your friends hurry to class*\n*After a brief announcement, you and your grade bus to the train station to head to Osaka Japan*");
				pointOutput();
				return "nerdsStory";
			}

		} else { // If the user chose rebels
			p.goodEvil -= 10;
			p.group = new FriendGroup("rebels");
			System.out.println("\"Sup " + p.firstName + ".\"\n -Ace (Top dog of your gang)");
			System.out.println("\n\"Hey guys, what are you doing? \n -you");
			do { // Ask user to make a decision
				System.out.println(
						"\n\"We were about to start spray painting the back of the school, would you like to join?\"\n -Ace");
				System.out.println(" A. Yeah, why not?\n B. I don't think we should, its vandalism.");
				// Listen to user input
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to join the gang and spray paint
			if (decision.equalsIgnoreCase("a")) {
				p.goodEvil -= 20;
				System.out.println(
						"\n*You and your friends head to the back of the school and spray paint your sign all over the wall*");
				System.out.println(
						"*The bell goes and you and your friends hurry to class*\n*After a brief announcement, you and your grade bus to the train station to head to Osaka Japan*");
			} else {
				// if the user decides not to
				p.goodEvil += 25;
				System.out.println("\n\"Don't be a party killer " + p.firstName
						+ ".\"\n -Spade\"\n\n\"But we really shouldn't, we could get in trouble.\"\n -you\n\n\"All we want is just to have a little fun before we leave.\"\n -Diamond\n\n*The bell goes*\n\n\"Thanks "
						+ p.firstName + ", now we can't have our fun.\"\n -Spade and Diamond\n");
				System.out.println(
						"*After a brief announcement, you and your grade bus to the train station to head to Osaka Japan*\n");
			}
			pointOutput();
			return "chapterOneRebels";
			// if the user chose an average group of people
		}
	}

	// Nerds Story mode

	/**
	 * Nerds first game. Short response question.
	 * 
	 * @return a method depending on the user. If user skips question or gets
	 *         the question correct, return next method(advance in story). Gets
	 *         question incorrect, return the same method again.
	 */
	private static String nerdsIntroGame() {
		breaker(65);
		System.out.println(
				"\"So the riddle is, Mary’s father has 5 daughters – Nana, Nene, Nini, Nono. What is the fifth daughters name?\"\n -Egbert\n");
		// check to see if the user has any help left
		if (p.help > 0) {
			do {
				// See if the user would like get help from his friend
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("nerdsIntroGame"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("nerdsIntroGame"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("nerdsIntroGame"));
				}
			}
			System.out.println(
					"Mary’s father has 5 daughters – Nana, Nene, Nini, Nono. What is the fifth daughters name?");
		}
		decision = Keyboard.keyb.nextLine(); // listen to user input
		if (decision.equalsIgnoreCase("Mary")) { // Check to see if its
													// right
			p.score += 5;
			System.out.println("\n\"Here, let's try it out\"\n -Margaret");
			System.out.println("\n\"Hey! You got it " + p.firstName + "! Nice work\"\n -Lewis\n");
		} else {
			p.score -= 5;
			System.out.println("\"Here, let's try it out\"\n -Margaret\n");
			System.out.println("\"Sorry " + p.firstName + ", that is incorrect.\"\n -Lewis\n");
		}
		System.out.println("*RING*");
		System.out.println("\n\"There goes the bell, let's get going\"\n -Lewis");
		System.out.println(
				"\n*After a brief announcement, you and your grade bus to the train station to head to Osaka Japan*");
		pointOutput();
		return "nerdsStory"; // head to next part of the story
	}

	/**
	 * First part with nerds.
	 * 
	 * @return which story line the user wants.
	 */
	private static String nerdsStory() {
		// Change the value of the page breaker
		breaker(15);
		System.out.println("Nerds Story");
		breaker(15);
		System.out.println("*The train stops and everyone gets off the train*");
		System.out.println("*You meet up with you friends*");
		do {
			System.out.println(
					"\n\"What do you want to do first?\"\n -Lewis\n A. The Modern Transportation Museum.\n B. Vist the Pockét Monster PockétCenter");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
		// If the user would like to go to the Transport Musuem
		if (decision.equalsIgnoreCase("a")) {
			System.out.println(
					"\"I would like to vist the Modern Transportation Museum\"\n -you\n\n\"Okay, sounds good to me. How do we get in?\"\n -Lewis\n\n\"I heard arcade mania hands out prizes for the completion of their puzzles, Lets go test our chances.\"\n -Egbert\n\n*You and your friends head to the arcade*\n*Upon arrival at the arcade*\n\n\"Welcome to Play Mania! If you are able to complete my puzzle I will offer you a prize. Todays prize is tickets to the \nModern Transportation Museum! If you get a question wrong, you'll need to restart fromt he start.\"\n -Arcade worker\n");
			do {
				System.out.println("Would you like to participate?(yes/no)");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no"));
			if (decision.equalsIgnoreCase("yes")) {
				return "arcadeQuestionOne";
			} else {
				return "nerdsStory";
			}
		} else {
			System.out.println(
					"\"I would love to see the PockétCenter here!\"\n -you\n\n\"That sounds fine to me\"\n -Lewis\n\n\"Yeah, I've been looking to expand my Pocket Monster trading card collection.\"\n -Egbert\n\n\"Yeah! I love Pocket Monster!\"\n -Margaret\n");
			System.out.println("*You and your friends make your way to the PockétCenter*");
			do {
				System.out.println(
						"\n\"Hey, do you want to play a game? We still have time to kill.\" (yes/no)\n -Egbert");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no"));
			if (decision.equalsIgnoreCase("yes")) {
				System.out.println(
						"\"Sure, I'll play. What game do you have in mind?\"\n -you\n\n\"I already have questions pre-made. I will run to the park near the PockétCenter but I'll leave questions around for you to solve.\nYou need to get all the questions and answer them correctly. If you get them all right, I'll buy you all something at the center\nOtherwise, you will have to buy something for me.\"");
				System.out.println("\n*Egbert runs off*");
				System.out.println("\n*The three of you wait for 5 minutes*");
				System.out.println("\"Okay I think it's time to go.\"\n -Lewis\n");
				return egbertGameQ1();
			}
		}
		return nerdsStory();
	}

	// Egbert's mini game Q1
	public static String egbertGameQ1() {
		breaker(131);
		System.out.println("*You and your friend notices a piece of paper taped to a convience st" + "ore building*");
		System.out.println(
				"The paper reads, if a blue house is made out of blue bricks, a yellow house is made out of yellow bricks\nand a pink house is made out of pink bricks, what is a green house made of? (Just state the answer eg. Yellow Bricks)");
		if (p.help > 0) {
			do {
				System.out.println("\nWould you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("egbertGameQ1"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("egbertGameQ1"));
				}
				System.out.println(
						"If a blue house is made out of blue bricks, a yellow house is made out of yellow bricks\nand a pink house is made out of pink bricks, what is a green house made of? (Just state the answer eg. Yellow Bricks)");
			}
		}
		// The users answer will be placed here
		System.out.println("\nWhat do you think?");
		miniGame1 = Keyboard.keyb.nextLine();
		System.out.println("\n*You and your friends write " + miniGame1 + " on the sheet of paper and move on*");
		return egbertGameQ2();
	}

	// Egbert's mini game Q2
	public static String egbertGameQ2() {
		breaker(131);
		System.out.println("*The next sheet of paper you guys find is taped on a tree a block away*");
		System.out.println(
				"*Margaret reads the riddles out loud* \n\n\"There are two sisters: one gives birth to the other and she, in turn, gives birth to the first. \nWho are the two sisters? A, a hen and her egg or B, night and day.\"\n -Margaret\n");
		if (p.help > 0) {
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("egbertGameQ2"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("egbertGameQ2"));
				}
				System.out.println(
						"There are two sisters: one gives birth to the other and she, in turn, gives birth to the first. \nWho are the two sisters?\n A.Hen and egg\n B.Night and Day");
			}
		}
		do {
			System.out.println("\n A.Hen and egg or B.Night and day.");
			// The users answer will be placed here
			miniGame2 = Keyboard.keyb.nextLine();
		} while (!miniGame2.equalsIgnoreCase("a") && !miniGame2.equalsIgnoreCase("b"));
		System.out.println(
				"\n*You check " + miniGame2 + " on the sheet of paper start heading closer to the PockétCenter*");
		return egbertGameQ3();
	}

	// Egbert's mini game Q3
	public static String egbertGameQ3() {
		breaker(131);
		System.out.println(
				"*The next paper you find is a neon pink paper on a chess board using the rook as a paper weight*");
		System.out.println(
				"The paper reads, in a one-storey house, there was a pink person, a pink cat, a pink fish, a pink computer, \na pink phone, a pink table and a pink chair! Everything was pink! \nWhat colour were the stairs?\n A.Pink.\n B.There are no stairs.\n C.Brown from the wood.");
		if (p.help > 0) {
			do {
				System.out.println("\nWould you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("egbertGameQ3"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("egbertGameQ3"));
				}
				System.out.println(
						"The paper reads,\nIn a one-storey house, there was a pink person, a pink cat, a pink fish, a pink computer, \na pink phone, a pink table and a pink chair! Everything was pink! \nWhat colour were the stairs?\n A.Pink.\n B.There are no stairs.\n C.Brown from the wood.");
			}
		}
		do {
			System.out.println("Is it A.Pink B.There are no stairs C.Brown from the wood");
			// The users answer will be placed here
			miniGame3 = Keyboard.keyb.nextLine();
		} while (!miniGame3.equalsIgnoreCase("a") && !miniGame3.equalsIgnoreCase("b")
				&& !miniGame3.equalsIgnoreCase("c"));
		System.out.println("*You guys tick " + miniGame3 + " off and quickly run off to find the next sheet*");
		return egbertGameQ4();
	}

	// Egbert's mini game Q4
	public static String egbertGameQ4() {
		breaker(131);
		// TODO: add the questions for Egbert's Game
		return egbertGameQ5();
	}

	// Egbert's mini game Q5
	public static String egbertGameQ5() {
		breaker(131);
		// TODO: add the questions for Egbert's Game
		System.out.println("*You see Egbert sitting in the shade under a tree waiting*");
		do {
			System.out.println("\nWould you like to check over your answers? \n A.Yes\n B.No");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
		if (decision.equalsIgnoreCase("b")) {
			return pocketMonsterEnterence();
		} else {
			return reviseAnswers();
		}
	}

	// Allow the user to change their answers for Egbert's game
	/**
	 * 
	 * @return pocketMonsterEnterence
	 */
	public static String reviseAnswers() {
		do {
			System.out.println(
					"Which question do you want to check?\n A.if a blue house is made out of blue bricks, a yellow house is made out of yellow bricks\nand a pink house is made out of pink bricks, what is a green house made of?\n Your answer was: "
							+ miniGame1);
			System.out.println(
					"\n B.There are two sisters: one gives birth to the other and she, in turn, gives birth to the first. \nWho are the two sisters? A.Hen and egg\tB.Night and day\nYour answer was: "
							+ miniGame2);
			System.out.println(
					"\n C.in a one-storey house, there was a pink person, a pink cat, a pink fish, a pink computer, \na pink phone, a pink table and a pink chair! Everything was pink! \nWhat colour were the stairs? A.Pink\t B.There are no stairs.\t C.Brown from the wood.\n\nYour answer was: "
							+ miniGame3);
			System.out.println("\n D.");
			System.out.println("\n E.");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b") && !decision.equalsIgnoreCase("c")
				&& !decision.equalsIgnoreCase("d") && !decision.equalsIgnoreCase("e"));
		if (decision.equalsIgnoreCase("a")) {
			System.out.println(
					"if a blue house is made out of blue bricks, a yellow house is made out of yellow bricks\nand a pink house is made out of pink bricks, what is a green house made of?\n Your answer was: "
							+ miniGame1);
			System.out.println("What do you want to change your answer to?");
			miniGame1 = Keyboard.keyb.nextLine();
			do {
				System.out.println("Is that all? (yes/no)");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no"));
			if (decision.equalsIgnoreCase("yes")) {
				return pocketMonsterEnterence();
			} else {
				return reviseAnswers();
			}
		} else if (decision.equalsIgnoreCase("b")) {
			System.out.println(
					"There are two sisters: one gives birth to the other and she, in turn, gives birth to the first. \nWho are the two sisters? A.Hen and egg\tB.Night and day\nYour answer was: "
							+ miniGame2);
			System.out.println("What do you want to change your answer to?");
			miniGame2 = Keyboard.keyb.nextLine();
			do {
				System.out.println("Is that all? (yes/no)");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no"));
			if (decision.equalsIgnoreCase("yes")) {
				return pocketMonsterEnterence();
			} else {
				return reviseAnswers();
			}
		} else if (decision.equalsIgnoreCase("c")) {
			System.out.println(
					"in a one-storey house, there was a pink person, a pink cat, a pink fish, a pink computer, \na pink phone, a pink table and a pink chair! Everything was pink! \nWhat colour were the stairs? A.Pink\t B.There are no stairs.\t C.Brown from the wood.\n\nYour answer was: "
							+ miniGame3);
			System.out.println("What do you want to change your answer to?");
			miniGame3 = Keyboard.keyb.nextLine();
			do {
				System.out.println("Is that all? (yes/no)");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no"));
			if (decision.equalsIgnoreCase("yes")) {
				return pocketMonsterEnterence();
			} else {
				return reviseAnswers();
			}
		} else if (decision.equalsIgnoreCase("d")) {
			// TODO: Add the question and their answer to this
			System.out.println("What do you want to change your answer to?");
			miniGame4 = Keyboard.keyb.nextLine();
			do {
				System.out.println("Is that all? (yes/no)");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no"));
			if (decision.equalsIgnoreCase("yes")) {
				return pocketMonsterEnterence();
			} else {
				return reviseAnswers();
			}
		} else {
			// TODO: Add the question and their answer to this
			System.out.println("What do you want to change your answer to?");
			miniGame5 = Keyboard.keyb.nextLine();
			do {
				System.out.println("Is that all? (yes/no)");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no"));
			if (decision.equalsIgnoreCase("yes")) {
				return pocketMonsterEnterence();
			} else {
				return reviseAnswers();
			}
		}

	}

	public static String pocketMonsterEnterence() {
		scorePoints = 0;
		System.out.println(
				"\n*You and your friends take the papers and walk over to Egbert*\n*Egbert takes the sheets and checks them over*");
		// Check the answer for question 1
		if (miniGame1.equalsIgnoreCase("glass")) {
			p.score += 5;
			scorePoints += 1;
			System.out.println(""
					+ "\n\"Question one, If a blue house is made out of blue bricks, a yellow house is made out of yellow bricks\nand a pink house is made out of pink bricks, what is a green house made of?\nGood, you have this one correct\"\n -Egbert");
		} else {
			p.score -= 2;
			System.out.println(
					"\n\"Question one, If a blue house is made out of blue bricks, a yellow house is made out of yellow bricks\nand a pink house is made out of pink bricks, what is a green house made of? Oh... This one is wrong\n -Egbert");
			// Check question 2
		}
		if (miniGame2.equalsIgnoreCase("b")) {
			p.score += 5;
			scorePoints++;
			System.out.println(
					"\n\"Question two, There are two sisters: one gives birth to the other and she, in turn, gives birth to the first. \nWho are the two sisters?\nCongrats, you got this one right!\"\n -Egbert");
		} else {
			p.score -= 2;
			System.out.println(
					"\n\"Question two, There are two sisters: one gives birth to the other and she, in turn, gives birth to the first. \nWho are the two sisters? Damn, you got that one wrong.\"\n -Egbert");
		}
		if (miniGame3.equalsIgnoreCase("b")) {
			p.score += 5;
			scorePoints++;
			System.out.println(
					"\n\"in a one-storey house, there was a pink person, a pink cat, a pink fish, a pink computer, \na pink phone, a pink table and a pink chair! Everything was pink! \nWhat colour were the stairs? This one seems correct.\"\n -Egbert");
		} else {
			p.score -= 2;
			System.out.println(
					"\n\"in a one-storey house, there was a pink person, a pink cat, a pink fish, a pink computer, \na pink phone, a pink table and a pink chair! Everything was pink! \nWhat colour were the stairs? This one seems incorrect.\"\n -Egbert");
		}
		if (miniGame4.equalsIgnoreCase("")) {

		} else {

		}
		if (miniGame5.equalsIgnoreCase("")) {

		} else {

		}
		System.out.println("You got " + scorePoints + " out of 5 correct.");
		pointOutput();
		if (scorePoints == 5) {
			System.out.println(
					"\n\"Damn, I didn't expect you guys to get them all right.\"\n -Egbert\n\n\"Yeah, now you owe all of us something!\"\n -Margaret\n\n\"yeah yeah, what do you want?\"\n-Egbert\n\n\"I want a plushie.\"\n -Margaret\n\n\"I'll just get a T-shirt\"\n -Lewis");
			do {
				System.out.println(
						"What do you want?\n A.Nothing its fine.\n B.Trade monsters with me!\n C.I want a plushie too!");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b")
					&& !decision.equalsIgnoreCase("c"));

		} else {
			System.out.println("\n\"Aha! I won! I want you all to get me a card pack.\"\n -Egbert\n");
		}
		// TODO: make good
		System.out.println("*The 5 of you enter the PockétCenter and knock over a man try*");
		do {
			// TODO: have the user decide to fight or run
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b") && !decision.equalsIgnoreCase("c"));
		return intro();
	}

	/**
	 * Decides to go the to transportation museum.
	 * 
	 * @return String Name of the next scenario to run
	 */
	public static String modernTransportation() {
		breaker(28);
		System.out.println("Modern Transportation Museum");
		breaker(28);
		do {
			System.out.println(
					"*You and your friends arrive at the Mordern Transportation Museum*\n\"What do you want to do?\"\n -Margaret\n A. Join a tour group.\n B. Go around with just your friends.");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
		if (decision.equalsIgnoreCase("a")) {
			System.out.println("\n\"I think we should join a tour group and have someone guide us.\"\n -you");
			System.out.println("\n\"Sounds fine to me.\"\n -Egbert\n");
			System.out.println("\"Same.\"\n -Lewis");
			System.out.println(
					"\n*Lewis takes all the tickets and trades them in for an admission pass then distribute them to the rest of your friends*");
			System.out.println(
					"\"The lady at the front desk told us to wait here for a bit and a tour guide will come to get us in a bit.\"\n -Lewis\n");
			breaker(14);
			System.out.println("Sometime later");
			breaker(14);
			System.out.println(
					"\"Welcome to Osakas Modern Transportation Museum! I am, Naoto Takayama your tour guide for today.\"\n -Takayama\n");
			System.out.println(
					"*You and your friends follow the group of people listening to Takayama and learning new things*");
			System.out.println("*Something strikes your interest, the puzzle train*");
			System.out.println(
					"\n\"This is the puzzle train, it ran from 2002 to 2003. It was taken off its tracks due to the complaints recieved.\nThis train had many complaints due to the fact that all doors were only operatorable through puzzles, unless the \nemergancy button was pressed from the head of the train was activated.\"\n -Takayama\n");
			System.out.println("*You take interest in the train and decide to stay behind*\n");
			System.out.println(
					"\"Hey guys, I think I'm going to stay here and keep looking at this train.\"\n -you\n\n\"Okay, we will meet back at the enterence at 7:30. Try not to be too long, we need to be back by 8.\"\n -Lewis\n");
			System.out.println("*You stay back and walk around the train looking at all the cool features*");
			System.out.println("*You hear an alarm go off*");
			System.out.println(
					"\n\"Everyone please evacuate from the premises, an armed robber has stolen the priceless train whistle\"\n -Intercom");
			do {
				System.out.println(
						"*You see a man dressed in all black run by*\n A. Do you want to chase him? \n B. Do you want to evacuate the premises?");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			if (decision.equalsIgnoreCase("b")) {
				p.goodEvil -= 10;
				System.out.println(
						"\n*You meet up with your friends and head back to the train station and wait for the field trip to officially end*");
				System.out.println(
						"\n\"And that my friends is how my school field trip ended... I ran away from a robber...\"\n -you");
				return "weakEnd";
				// if the user chases the villain
			} else {
				p.goodEvil += 25;
				System.out.println("*You start the chase the man*");
				System.out.println("\n\"STOP! DROP THE WHISTLE!\"\n -you");
				do {
					System.out.println(
							"\n*The man turns aiming his gun*\n A. Keep running after him in hopes he miss\n B. Jump behind an object.\n C. Run away.");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b")
						&& !decision.equalsIgnoreCase("c"));
				if (decision.equalsIgnoreCase("a")) {
					p.score -= 5;
					System.out.println("Your prays have not been answered... You have been shot and killed.");
					System.out.println("\nYou had underestimated the criminal and your soul was the price.");
					return "heroEnd";
				} else if (decision.equalsIgnoreCase("c")) {
					System.out.println("*You see the gun and cower away*");
					System.out.println("*At least you tried*");
					System.out.println(
							"\n*You meet up with your friends and head back to the train station and wait for the field trip to officially end*");
					System.out.println(
							"\n\"And that my friends is how my school field trip ended... I ran away from a robber...\"\n -you");
					return "weakEnd";
				} else {
					/**
					 * TODO Write what happens when the user decides to hide.
					 * Add a timer so the user will have a limited amount of
					 * time Create last series of puzzles
					 */
					System.out.println(
							"*You jump under the closest train and take cover*\n*Once he gains distance, you get back up and procede*\n*He enters the Puzzle Train*");
					do {
						System.out.println("Do you follow? (Yes/No)");
						decision = Keyboard.keyb.nextLine();
					} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no"));
					if (decision.equalsIgnoreCase("no")) {
						System.out.println("*You decide to leave*");
						return "weakEnd";
					}
				}
			}
		} else {
			System.out.println("\n\"Let's just go around as a group\"\n -you");
			System.out.println("\n\"Sounds fine to me.\"\n -Egbert\n");
			System.out.println("\"Same.\"\n -Lewis");
			System.out.println(
					"\n*You and your friends roam around the museum exploring the different trains and expanding your knowledge*");
			System.out.println("\nCRASH!!");
			System.out.println("\nAHHHH!!");
			System.out.println("\n\"What was that?\"\n -Egbert");
			do {
				System.out.println(
						" A. I don't know but I'm not willing to find out, lets get outta here!\n B. I'm not sure, lets check it out.");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			if (decision.equalsIgnoreCase("a")) {
				p.goodEvil -= 5;
				p.score -= 5;
				System.out.println(
						"\n*You and your friends leave the building and start heading back to the randevu and await the reast of your school*");
				System.out.println("*That is how my field trip went*");
				return "weakEnd";
			} else {
				p.score += 5;
				p.goodEvil += 15;
				System.out.println(
						"*You and your friends quickly run to the site to see a deattach part of a train crushing an employee*");
				System.out.println("*You quickly run to the man*");
				System.out.println("\n\"How can I help you?!\"\n -you");
				System.out.println(
						"\n*He points at a small crane in the corner of the room*\n*Your crew quickly runs to bring the crane over as you sit next to the man to ensure he stays calm*\n*Your friends get the crane near the part*\n*Your jump in and start up the crane*\n*The machine reads, \"To move crane, solve problem one. To lower crane, solve problem two. To lift crane, solve problem three.*");
				System.out.println("*In panick you click \"ok\" very quickly*");
				return "craneQuestionOne";
			}
		}
		return "badEnd";
	}

	// Arcade question 1
	private static String arcadeQuestionOne() {
		breaker(131);
		System.out.println("\"The number sequence is, 16, 06, 68, 88, x, 98... What is x?\n -Arcade worker\n");
		if (p.help > 0) {
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("arcadeQuestionOne"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("arcadeQuestionOne"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("arcadeQuestionOne"));
				}
			}
		}
		do {
			System.out.println(
					"Question One: The number sequence is, 16, 06, 68, 88, x, 98... What is x?\n A. L8\n B. 78 \n C. S8\n D. 92");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b") && !decision.equalsIgnoreCase("c")
				&& !decision.equalsIgnoreCase("d"));
		if (decision.equalsIgnoreCase("a")) {
			p.score += 5;
			System.out.println(
					"\"Congratulations! You have gotten question 1 of 5 correct. If you look at all\nnumbers upside down, \"16, 06, 68, 88, x\" make 91, 90, 89, 88 then x\"\n -Arcade worker\n");
			System.out.println("\"Now for question two.\"\n -Arcade worker\n");
		} else {
			p.score -= 5;
			System.out.println("\"Awh... That is incorrect. Please try again!\"\n -Arcade worker\n");
			return "arcadeQuestionOne";
		}
		return "arcadeQuestionTwo";
	}

	// Arcade question 2
	private static String arcadeQuestionTwo() {
		breaker(131);
		if (p.help > 0) {
			System.out.println(
					"\"Question Two: A window cleaner is cleaning a window on the 25th floor of a skyscraper when, suddenly, he slips and falls. \nHe has no safety equipment and nothing to soften his fall, and yet he is not hurt. How can this be?\"\n -Arcade worker\n");
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("arcadeQuestionTwo"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("arcadeQuestionTwo"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("arcadeQuestionTwo"));
				}
			}
		}
		do {
			System.out.println(
					"Question Two: A window cleaner is cleaning a window on the 25th floor of a skyscraper when, suddenly, he slips and falls. \nHe has no safety equipment and nothing to soften his fall, and yet he is not hurt. How can this be?\n A. He was cleaning a building for small people.\n B. He caught the edge. \n C. He was inside.\n D. It's Peter Parker.");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b") && !decision.equalsIgnoreCase("c")
				&& !decision.equalsIgnoreCase("d"));
		if (decision.equalsIgnoreCase("c")) {
			p.score += 5;
			System.out.println(
					"\"Congratulations! You have gotton question 2 of 5 correct. \nHe was inside cleaning the windows so falling wouldn't harm him.\"\n -Arcade worker\n");
			System.out.println("\"Now for question three.\"\n -Arcade worker\n");
		} else if (decision.equalsIgnoreCase("d")) {
			p.score += 2;
			p.goodEvil += 10;
			System.out.println("\"Kekekekeke. Very funny, I'll let that one slide.\"\n -Arcade worker\n");
			System.out.println("\"Now for question three.\"\n -Arcade worker\n");
		} else {
			p.score -= 5;
			System.out.println("\"Awh... That is incorrect. Please try again!\"\n -Arcade worker\n");
			return "arcadeQuestionOne";
		}
		return "arcadeQuestionThree";
	}

	// Arcade Question 3
	private static String arcadeQuestionThree() {
		breaker(131);
		if (p.help > 0) {
			System.out.println(
					"\"What is black when you buy it, red when you use it, and grey when you throw it away?\"\n -Arcade worker\n");
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("arcadeQuestionThree"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("arcadeQuestionThree"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("arcadeQuestionThree"));
				}
			}
		}
		do {
			System.out.println(
					"Question Three: What is black when you buy it, red when you use it, and grey when you throw it away?\n A. Match stick.\n B. Open flame. \n C. Your hair and hair dye.\n D. Coal.");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b") && !decision.equalsIgnoreCase("c")
				&& !decision.equalsIgnoreCase("d"));
		if (decision.equalsIgnoreCase("d")) {
			p.score += 5;
			System.out.println(
					"\"Congratulations! You have gotton question 3 of 5 correct. \nA coal would be black when bought, red when heated, and grey when thrown away.\"\n -Arcade worker\n");
			System.out.println("\"Now for question four.\"\n -Arcade worker\n");
		} else {
			p.score -= 5;
			System.out.println("\"Awh... That is incorrect. Please try again!\"\n -Arcade worker\n");
			return "arcadeQuestionOne";
		}
		return "arcadeQuestionFour";
	}

	// Arcade Question 4
	public static String arcadeQuestionFour() {
		breaker(131);
		if (p.help > 0) {
			System.out.println("1\n11\n21\n1211\n111221\n312211\n\"what is the next number?\"\n -Arcade worker\n");
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("arcadeQuestionThree"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("arcadeQuestionThree"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("arcadeQuestionThree"));
				}
			}
		}
		do {
			System.out.println(
					"Question Four:\n1\n11\n21\n1211\n111221\n312211\nwhat is the next number?\n A. 3112312.\n B. 13112221. \n C. 31221211.\n D. 2133132.");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b") && !decision.equalsIgnoreCase("c")
				&& !decision.equalsIgnoreCase("d"));
		if (decision.equalsIgnoreCase("b")) {
			p.score += 10;
			System.out.println(
					"\"Congratulations! You have gotten question 4 of 5 correct. \nThe pattern is a desription of the previous number for example, 1211 is one one, one two, two one.\"\n -Arcade worker\n");
			System.out.println("\"Now for question five.\"\n -Arcade worker\n");
		} else {
			p.score -= 5;
			System.out.println("\"Awh... That is incorrect. Please try again!\"\n -Arcade worker\n");
			return "arcadeQuestionOne";
		}
		return "arcadeQuestionFive";
	}

	// Arcade Question 5
	public static String arcadeQuestionFive() {
		breaker(131);
		if (p.help > 0) {
			System.out.println(
					"\n\"You are a bus driver, on your first stop you pick up 15 people. On your second stop, 8 get off and 20 people get on.\nOn your third stop no one gets off and 4 more people get on the bus. On your fourth stop, \n15 people get off and 2 people get on. On your last stop, everyone else gets off. \nWhat is the bus drivers name?\"\n -Arcade worker\n");
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("arcadeQuestionFive"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("arcadeQuestionFive"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("arcadeQuestionFive"));
				}
			}
		}
		System.out.println(
				"Question Four: You are a bus driver, on your first stop you pick up 15 people. On your second stop, 8 get off and 20 people get on.\nOn your third stop no one gets off and 4 more people get on the bus. On your fourth stop, \n15 people get off and 2 people get on. On your last stop, everyone else gets off. \nWhat is the bus drivers name?");
		decision = Keyboard.keyb.nextLine();

		if (decision.equalsIgnoreCase(p.firstName)) {
			p.score += 10;
			System.out.println(
					"\"Congratulations! You have completed all of my puzzles! Enjoy your tickets.\"\n -Arcade worker\n");
		} else {
			p.score -= 5;
			System.out.println("\"Awh... That is incorrect. Please try again!\"\n -Arcade worker\n");
			return "arcadeQuestionOne";
		}
		System.out
				.println("*You and your friends take your tickets and head towards the Modern Transportation Museum*");
		pointOutput();
		if (p.score >= 25) {
			breaker(140, "*");
			System.out.println("You are qualified for a bonus question!");
			do {
				System.out.println(
						"Would you like to play a bonus round?\n(There will be no hints given and you will only have one chance to solve it. Solving it correctly will give you another hint and points.)\n A.Yes\n B.No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			if (decision.equalsIgnoreCase("a")) {
				bonusQuestionOne();
				breaker(140, "*");
			} else {
				breaker(140, "*");
			}
		}
		return "modernTransportation";
	}

	// Crane Question 1
	public static String craneQuestionOne() {
		breaker(131);
		System.out.println(
				"Many have heard me, but nobody has seen me, and I will not speak back until spoken to. What am I?");
		if (p.help > 0) {
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("craneQuestionOne"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("craneQuestionOne"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("craneQuestionOne"));
				}
			}
		}
		System.out.println(
				"Many have heard me, but nobody has seen me, and I will not speak back until spoken to. What am I?");
		decision = Keyboard.keyb.nextLine();
		if (decision.equalsIgnoreCase("echo")) {
			p.score += 15;
			System.out.println("That is correct.");
			System.out.println("*You move the crane over the object and press \"ok\"*");
		} else {
			p.score -= 5;
			System.out.println("That is incorrect.");
			return "craneQuestionOne";
		}
		return "craneQuestionTwo";
	}

	// Crane Question 2
	public static String craneQuestionTwo() {
		breaker(131);
		System.out.println(
				"A teacher decides to give a pop quiz one day but all of her students refuse to take the quiz thinking\nthat the teacher will call off the quiz. She can give only one of these students a detention for skipping \nthe quiz. All of the students know each other’s names and if a student knows he/she is getting a \ndetention they take the quiz. How can she threaten her students with the single detention so they all take the quiz?");
		if (p.help > 0) {
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("craneQuestionTwo"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("craneQuestionTwo"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("craneQuestionTwo"));
				}
			}
		}
		do {
			System.out.println(
					"A teacher decides to give a pop quiz one day but all of her students refuse to take the quiz thinking\nthat the teacher will call off the quiz. She can give only one of these students a detention for skipping \nthe quiz. All of the students know each other’s names and if a student knows he/she is getting a \ndetention they take the quiz. How can she threaten her students with the single detention so they all take the quiz?");
			System.out.println(
					" A. Hand out detentions in alphabetical order\n B. Threaten to call home. \n C. Give the class a detention and call it a single detention.");
			decision = Keyboard.keyb.nextLine();
		} while (decision.equalsIgnoreCase("a") && decision.equalsIgnoreCase("b") && decision.equalsIgnoreCase("c"));
		if (decision.equalsIgnoreCase("a")) {
			p.score += 15;
			System.out.println("That is correct.");
			System.out.println("*You lower the crane and attach it onto the object then press \"ok\"*");
		} else {
			p.score -= 5;
			System.out.println("That is incorrect.");
			return "craneQuestionTwo";
		}
		return "craneQuestionThree";
	}

	// Crane Question 3
	public static String craneQuestionThree() {
		breaker(131);
		System.out.println(
				"A man walks into a bar and asks for a glass of water. \nThe bartender pulls out a shotgun and points it at him. The man says, thank you and leaves.");
		// Ask the user if they would like help from a friend
		if (p.help > 0) {
			do {
				System.out.println("Would you like help from a friend?\n A. Yes\n B. No");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			// If the user wants to get a hint from a friend
			if (decision.equalsIgnoreCase("a")) {
				p.help -= 1;
				do {
					// See which friend a user would like a hint from
					System.out.println("From who?(Enter a friend’s name, Friends are: Lewis, Egbert, and Margaret)");
					decision = Keyboard.keyb.nextLine();
				} while (!decision.equalsIgnoreCase("Lewis") && !decision.equalsIgnoreCase("Egbert")
						&& !decision.equalsIgnoreCase("Margaret"));
				// if the user would like help from Lewis
				if (decision.equalsIgnoreCase("Lewis")) {
					System.out.println(p.group.members[0].getResponse("craneQuestionTwo"));
					// if the user would like help from Egbert
				} else if (decision.equalsIgnoreCase("Egbert")) {
					System.out.println(p.group.members[1].getResponse("craneQuestionTwo"));
					// if the user would like help from Margaret
				} else {
					System.out.println(p.group.members[2].getResponse("craneQuestionTwo"));
				}
			}
		}
		do {
			System.out.println(
					"A man walks into a bar and asks for a glass of water. \nThe bartender pulls out a shotgun and points it at him. The man says, thank you and leaves.");
			System.out.println(
					" A. He wanted a good scare.\n B. He says thanks for the water only.\n C. He had the hiccups.");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b") && !decision.equalsIgnoreCase("c"));
		if (decision.equalsIgnoreCase("c")) {
			p.score += 15;
			System.out.println("That is correct.");
			System.out.println("*You lift the object and help the man up*");
			breaker(131);
			System.out.println("\n\"Thank you so much, I thought I was a goner\"\n -Random employee");
			System.out.println("\n\"Is there any way I can repay you?\"\n -Random employee");
			do {
				System.out.println(" A. Yeah, I'll take money.\n B. No it's fine.");
				decision = Keyboard.keyb.nextLine();
			} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b"));
			if (decision.equalsIgnoreCase("a")) {
				p.goodEvil -= 35;
				System.out.println(
						"*You obtain your money from the man and take your leave with your friends back to the train station to meet with your class*");
			} else {
				p.goodEvil += 10;
				System.out.println(
						"*You say farewell to the man as you and your friends leave to the train station to meet with your class*");
			}
		} else {
			p.score -= 5;
			System.out.println("That is incorrect.");
			return "craneQuestionThree";
		}
		if (p.goodEvil >= 50) {
			return "goodEnd";
		} else {
			return "evilEnd";
		}
	}

	// Rebel story mode
	// First chapter for the rebels
	private static String chapterOneRebels() {
		// TODO create the rebel story line
		breaker(15); // Change the value of the page breaker
		System.out.println("Rebels Story");
		breaker(15);
		System.out.println("*The train stops and everyone gets off the train*");
		System.out.println("*You meet up with you friends*");
		do {
			System.out.println(
					"\n\"What do you want to do first?\"\n -Ace\n A. Go to the mall.\n B. Go shoplifting.\n C. Mess around with people.");
			decision = Keyboard.keyb.nextLine();
		} while (!decision.equalsIgnoreCase("a") && !decision.equalsIgnoreCase("b") && !decision.equalsIgnoreCase("c"));
		// If the user would like to go to the mall
		if (decision.equalsIgnoreCase("a")) {
			// TODO write mall story line
			System.out.println("\"I want to chill at the mall.\"\n -you\n");
			System.out.println("\"Cool, sounds good to me\"\n -Ace\n");
			System.out.println("\"Yeah, I want to buy a new outfit\"\n -Diamond\n");
			System.out.println(
					"\"And there is a promotion! Free food if you are able to complete a series of questions\"\n -Spade\n");
		} else if (decision.equalsIgnoreCase("b")) {
			// TODO write stealing story line (rebels)
			p.goodEvil -= 15;
			if (p.goodEvil > 40) {
				System.out.println("\"That doesn't sound like you but I'm down\"\n -Ace\n");
				System.out.println("\"Where are you thinking " + p.firstName + "\"\n -Diamond\n");
				System.out.println("\"I was thinking the mall.\"\n -you\n");
				System.out.println("\"Nice! I'm down, I can get something for myself.\"\n -Diamond\n");
			} else {
				System.out.println("\"Nice! I wonder what we can get in this city.\"\n -Spade\n");
			}
		} else {
			// TODO write messing with people story line
		}
		return "end";
	}
}