package puzzleMasters;

public class FriendGroup {
	String name = "";
	GroupMember[] members = new GroupMember[3];
	
	//Create the friends
	FriendGroup(String name) {
		for (int i = 0; i < 3; i++){
			members[i] = new GroupMember();
		}
		this.name = name.toUpperCase();
		if (name.equalsIgnoreCase("REBELS")) {
			// setup rebel members
			members[0].name = "Ace"; // Creates friend: Ace
			members[1].name = "Spade"; // Creates friend: Spade
			members[2].name = "Diamond"; // Creates friend: Diamond
		} else {
			// setup nerd members
			members[0].name = "Lewis"; // Creates friend: Lewis
			members[1].name = "Egbert"; // Creates friend: Egbert
			members[2].name = "Margaret"; // Creates friend: Margaret
		}
	}
}