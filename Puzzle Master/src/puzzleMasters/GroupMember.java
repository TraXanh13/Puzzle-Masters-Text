package puzzleMasters;

public class GroupMember {
	String name; // Store all the friends name

	/**
	 * Hold "friends" and what they will say.
	 * 
	 * @param scenario
	 *            where the user is.
	 * @return what "friends" reply as hints.
	 */
	public String getResponse(String scenario) {
		// Ace's hints
		if (name.equals("Ace")) {
			if (scenario.equals("hotelPuzzleOne")) {
				return "\n\"Im not sure, it look’s like math to me.\"\n -Ace\n";
			}
			// Diamond's hints
		} else if (name.equals("Diamond")) {
			if (scenario.equals("hotelPuzzleOne")) {
				return "\n\"Aha, who cares?\"\n -Diamond\n";
			}
			// Spade's hints
		} else if (name.equals("Spade")) {
			if (scenario.equals("hotelPuzzleOne")) {
				return "\n\"Maybe try BEDMAS or something.\"\n -Spade\n";
			}

			// TODO: Add Egberts mini game hints
			// Lewis's hints
		} else if (name.equals("Lewis")) {
			// Good at math
			if (scenario.equals("nerdsIntroGame")) {
				return "\n\"English isn't my strongest suit, but I think we need to read the question again\"\n -Lewis\n";
			} else if (scenario.equals("arcadeQuestionOne")) {
				return "\n\"This question has nothing to do with math. Maybe if you look from another angle we'll see it.\"\n -Lewis\n";
			} else if (scenario.equals("arcadeQuestionTwo")) {
				return "\n\"Floor 25 is really high... What is he? A super hero?\"\n -Lewis\n";
			} else if (scenario.equals("arcadeQuestionThree")) {
				return "\n\"I would think a box of matches, but it isn't black when you buy it.\"\n -Lewis\n";
			} else if (scenario.equals("arcadeQuestionFour")) {
				return "\n\"There is no mathematical pattern here. Maybe its describing something\"\n -Lewis\n";
			} else if (scenario.equals("arcadeQuestionFive")) {
				return "\n\"My ELA is bad... Why do you do this to me? I think I should READ the question again more carefully.\"\n -Lewis\n";
			} else if (scenario.equals("craneQuestionOne")) {
				return "\n\"What can we hear but can't see? Sound is something but we don't talk to it...\"\n -Lewis\n";
			} else if (scenario.equals("craneQuestionTwo")) {
				return "\n\"Maybe she can give one person a detention and if they come to the quiz pass it to another student?\"\n -Lewis\n";
			} else if (scenario.equals("craneQuestionThree")) {
				return "\n\"Perhaps he is saying thank you for the water?\"\n -Lewis\n";
			} else if (scenario.equals("egbertGameQ1")){
				return "\n\"Knowing Egbert, I'm pretty sure this is a logic riddle so it's probably something out of the ordinary.\nIf I had to guess, I think the first idea won't be the right idea.\n -Lewis\n";
			}
			// Egbert's hints
		} else if (name.equals("Egbert")) {
			// Good at science and logic
			if (scenario.equals("nerdsIntroGame")) {
				return "\n\"I feel like I'm missing something very obvious, maybe its a name already given.\"\n -Egbert\n";
			} else if (scenario.equals("arcadeQuestionOne")) {
				return "\n\"Maybe you shouldn't look at it normally... Look outside the box!\"\n -Egbert\n";
			} else if (scenario.equals("arcadeQuestionTwo")) {
				return "\n\"WHERE does he fall if he doesn't get hurt?\"\n -Egbert\n";
			} else if (scenario.equals("arcadeQuestionThree")) {
				return "\n\"I think it might be a mineral of some sort\"\n -Egbert\n";
			} else if (scenario.equals("arcadeQuestionFour")) {
				return "\n\"Maybe theres something we are missing.\"\n -Egbert\n";
			} else if (scenario.equals("arcadeQuestionFive")) {
				return "\n\"Maybe the question is trying to throw us off.\"\n -Egbert\n";
			} else if (scenario.equals("craneQuestionOne")) {
				return "\n\"Our voices are heard and not seen... Most sounds are heard but not seen as well.\"\n -Egbert\n";
			} else if (scenario.equals("craneQuestionTwo")) {
				return "\n\"Maybe she can create a list of students and follow it?\"\n -Egbert\n";
			} else if (scenario.equals("craneQuestionThree")) {
				return "\n\"Maybe there is something wrong with the man.\"\n -Egbert\n";
			}
			// Margaret's hints
		} else if (name.equals("Margaret")) {
			// Good at ELA
			if (scenario.equals("nerdsIntroGame")) {
				return "\n\"I think I'm onto something but I'm not too sure. I think it has something to do with the names given.\"\n -Margaret\n";
			} else if (scenario.equals("arcadeQuestionOne")) {
				return "\n\"Why would you ask me? I am terrible at math!\"\n -Margaret\n";
			} else if (scenario.equals("arcadeQuestionTwo")) {
				return "\n\"He is on floor 25 yet he doesn't get hurt... And nothing cushions his fall... hmm intersting\"\n -Margaret\n";
			} else if (scenario.equals("arcadeQuestionThree")) {
				return "\"I think it might be something you can burn.\"\n -Margaret\n";
			} else if (scenario.equals("arcadeQuestionFour")) {
				return "\"It just looks like numbers to me...\"\n -Margaret\n";
			} else if (scenario.equals("arcadeQuestionFive")) {
				return "\"The answer is given right away.\"\n -Margaret\n";
			} else if (scenario.equals("craneQuestionOne")) {
				return "\n\"Books are seen but now heard... Sound waves are heard but not seen... Hmm...\"\n -Margaret\n";
			} else if (scenario.equals("arcadeQuestionTwo")) {
				return "\n\"Maybe, she can get students to check in before the test and give a detention to anyone who doesn't show up.\"\n -Margaret\n";
			} else if (scenario.equals("arcadeQuestionThree")) {
				return "\"Matbe the man is sick?\"\n -Margaret\n";
			}
		}
		return "\"I have no idea... Sorry.\"\n";
	}
}