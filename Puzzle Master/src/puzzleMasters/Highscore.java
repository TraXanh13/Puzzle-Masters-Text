package puzzleMasters;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;

public class Highscore {
	static final String ScoreFile = "PlayerScores.txt";
	static HighScores[] highScore = new HighScores[3];

	public static boolean submitHighScore(Player p) {

		// Get the list of high scores
		// open the file
		PrintWriter outputStream = null;
		try {
			// Create a new file
			outputStream = new PrintWriter(new FileWriter(ScoreFile));
			outputStream.println(TheJourneyBegins.p.firstName);
			outputStream.println(TheJourneyBegins.p.score);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		// Close the file if it is open
		if (outputStream != null) {
			outputStream.close();
		}
		// read in the scores
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(ScoreFile));
			System.out.println(inputStream.readLine());
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		// Close the file if it's open
		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException ex) {
				System.out.println(ex);
			}
		}
		// Insert the submitted score if high enough
		if (TheJourneyBegins.p.score > 0) {
			highScore[0].name = TheJourneyBegins.p.firstName;
			highScore[0].score = TheJourneyBegins.p.score;
		}
		return false;
	}

	/**
	 * Read the high score data into the array
	 */
	public void loadHighScores() {

	}
	
	class HighScores {
		String name;
		int score;
	}
}