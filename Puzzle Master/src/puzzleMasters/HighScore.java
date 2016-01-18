package puzzleMasters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HighScore {

	public static void main(String[] args){ //throws FileNotFoundException, IOException
		File file = new File("highScore.txt"); //creating the file

		// Write to the file, name and score
		try {
			PrintWriter output = new PrintWriter(file);
			output.println(TheJourneyBegins.p.firstName);// Add the name to the file
			output.println(TheJourneyBegins.p.score);//Add the score to the file
			output.close();
		} catch (IOException ex) {
			System.out.printf("ERROR: %s\n", ex);
		}

		//Reads from the file
		try {
			Scanner input = new Scanner(file); //Get input from the file
			String name = input.nextLine();
			int points = input.nextInt();
			System.out.printf("High Score\nName: %s Score %d",name, points);
		} catch (FileNotFoundException ex){
			System.out.printf("ERROR: %s\n", ex);
		}
	}
}

/*
 * Serialize score FileOutputStream score = new FileOutputStream(file);
 * ObjectOutputStream output = new ObjectOutputStream(score);
 * output.writeObject(TheJourneyBegins.p.firstName);
 * output.writeObject(TheJourneyBegins.p.score); output.close(); score.close();
 * 
 * //deserialize the file FileInputStream player = new FileInputStream(file);
 * ObjectInputStream input = new ObjectInputStream(player);
 */

/*
 * static final String HIGHSCOREFILE = "PlayerScores.txt"; //Create the file
 * static HighScores[] highScore = new HighScores[3]; //Hold the top 3 scores
 * 
 * public static boolean submitHighScore(Player p) {
 * 
 * // Get the list of high scores // open the file PrintWriter outputStream =
 * null; try { // Create a new file outputStream = new PrintWriter(new
 * FileWriter(HIGHSCOREFILE));
 * outputStream.println(TheJourneyBegins.p.firstName);
 * outputStream.println(TheJourneyBegins.p.score); } catch (IOException ex) {
 * System.out.println(ex); } // Close the file if it is open if (outputStream !=
 * null) { outputStream.close(); } // read in the scores BufferedReader
 * inputStream = null; try { inputStream = new BufferedReader(new
 * FileReader(HIGHSCOREFILE)); System.out.println(inputStream.readLine()); }
 * catch (FileNotFoundException ex) { System.out.println(ex); } catch
 * (IOException ex) { System.out.println(ex); } // Close the file if it's open
 * if (inputStream != null) { try { inputStream.close(); } catch (IOException
 * ex) { System.out.println(ex); } } // Insert the submitted score if high
 * enough if (TheJourneyBegins.p.score > 0) { highScore[0].name =
 * TheJourneyBegins.p.firstName; highScore[0].score = TheJourneyBegins.p.score;
 * } return false; }
 * 
 * /** Read the high score data into the array
 */
/*
 * public void loadHighScores() {
 * 
 * }
 * 
 * class HighScores { String name; int score; }
 */