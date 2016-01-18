package puzzleMasters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore {
	public String name;
	public int score;
	public File file;
	
	HighScore() {
		this.file = new File("highScore.txt"); // creating the file
	}

	//Write into the file
	public void submitHighscores() {
		int highScore = TheJourneyBegins.p.score;
		
		if (highScore > score) {
	
			// Write to the file, name and score
			try {
				PrintWriter output = new PrintWriter(file);
				output.println(TheJourneyBegins.p.firstName);// Add the name to the
																// file
				output.println(TheJourneyBegins.p.score);// Add the score to the
															// file
				output.close();
			} catch (IOException ex) {
				System.out.printf("ERROR: %s\n", ex);
			}
		}
	}

	//Read the high scores
	public void loadHighscores() throws FileNotFoundException {{

		Scanner input = new Scanner(file); // Get input from the file
		name = input.nextLine();
		score = Integer.parseInt(input.nextLine());
		System.out.printf("Highest Score\nName: %s Score: %d\n", name, score);}
	}
}