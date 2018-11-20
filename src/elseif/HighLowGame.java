//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt((100)+1);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int j = 0; j<10; j++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String guess = JOptionPane.showInputDialog("Guess a number between 1 and 100.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guessparsed = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (guessparsed == random) {
				for(int i = 0; i<100; i++) {
					System.out.println("You");
					System.out.println("    WIN!!");
				}
				JOptionPane.showMessageDialog(null, "YOU WIN!");
				System.exit(0);
			}else if (guessparsed > random) {
				System.out.println("Too high!");
				JOptionPane.showMessageDialog(null, "Too high!", "Too high!", JOptionPane.ERROR_MESSAGE);
			}else {
				System.out.println("Too low");
				JOptionPane.showMessageDialog(null, "Too low!", "Too low!", JOptionPane.ERROR_MESSAGE);
			}}
			System.out.println("Sorry, but you loose");
			JOptionPane.showMessageDialog(null, "You loose.", "Sorry", JOptionPane.ERROR_MESSAGE);
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


