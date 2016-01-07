package puzzleMasters;

public class WhichEnd {
	String end = "";
	EndSelection[] whatEnding = new EndSelection[5];
	
	//Select the endings
	WhichEnd(String end) {
		for (int i = 0; i < 5; i++){
			whatEnding[i] = new EndSelection();
		}
		this.end = end.toUpperCase();
		if (end.equalsIgnoreCase("NERDS")){	//Creates an list for nerd option
			whatEnding[0].end = "goodEnd"; 	//creates a good ending
			whatEnding[1].end = "evilEnd";	//If the user has low good/bad
			whatEnding[2].end = "death";	//If the user dies
			whatEnding[3].end = "heroEnd";	//If the user dies while trying to save something
			whatEnding[4].end = "weakEnd";	//If the user runs
		}else{ 
			whatEnding[0].end = "goodEnd"; 	//creates a good ending
			whatEnding[1].end = "evilEnd";	//If the user has low good/bad
			whatEnding[2].end = "death";	//If the user dies
			whatEnding[3].end = "heroEnd";	//If the user dies while trying to save something
			whatEnding[4].end = "weakEnd";	//If the user runs
		}
	}
}
