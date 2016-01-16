package puzzleMasters;

public class EndSelection {
	public static Player p = new Player();
	String end;

	public String whereToEnd(String scenario) {
		if (end.equals("goodEnd")) {		//If the user ends the game with high good/bad score
			if (scenario.equals("craneQuestionThree")) {
				return "\nCongratulations " + p.firstName + "! You have completed Puzzle masters! And you have also saved the life a man!";
			}
		}else if (end.equals("evilEnd")){	//If the user ends with low good/bad score
			if (scenario.equals("craneQuestion3")){
				return "\nCongratulations " + p.firstName + ", you have finished the game doing bad things. Although you saved a man, you couldn't balance your morals...";
			}
		}else if(end.equals("death")){		//If the user dies
			if (scenario.equals(scenario)){
				return "\nPlay your own pity music\nYou have been defeated...";
			}
		}else if(end.equals("heroEnd")){	//If the user dies trying to help/save someone/thing
			if (scenario.equals("modernTransportation()")){
				return "Your prays have not been answered\n\n And your soul was the price\n\nSadly " + p.firstName
					+ ", you have died... But, your sacrifice wasn't in vain, your name will forever be remembered.";
			}
		}else{								//if the user runs away
			if (scenario.equals(scenario)){
				return "\nCongratulations " + p.firstName + "! You have completed Puzzle masters by running in fear!";
			}
		}
		return "ITS OVER!";
	}
}
// System.out.println(p.endingChoice.whatEnding[0].whereToEnd("nerdsIntroGame"));
// Use the death as so^^
