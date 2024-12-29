/**
* File: Lab4b.java
* Description: This program is a guessing game.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   do-while loop
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 5 February 2024
*/

package Week04;

import java.util.Scanner;

public class Lab4c {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		String answer = "";
		int guessCount = 0, input = 0;

		// Start of Primary program do-while loop
		boolean primary = false;
		do {

			// Describing the game
			System.out.println("This program is a guessing game.");
			System.out.println(
					"The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
			System.out.println("Let's get started!\n");

			// Random number generator
			// Define the range
			int max = 100;
			int min = 1;
			int range = max - min + 1;

			// Generate a random number between min and max
			int randNum = (int) (Math.random() * range) + min;
			int random = randNum;

			////////////////////////////
			// Start of Game do-while loop
			boolean secondary = false;
			do {

				//////////////////////////
				// Start of (Insecondary)Numeric Input Validation do-while loop
				boolean Insecondary = false;
				do {

					System.out.println("I'm thinking of a number between 1 and 100.");
					System.out.print("What is your guess? ");
					answer = in.nextLine();

					try {
						input = Integer.parseInt(answer);
						Insecondary = true;

					} catch (Exception e) {
						System.out.println("Error: Please enter a whole number.\n");

					} // End of try/catch

				} while (!Insecondary); // end of numeric(tertiary) input do

				//////////////////////////////

				// increment of guess count
				guessCount = guessCount + 1;

				// provide hint
				if (random == input) {
					System.out.printf("CORRECT! You guessed it in %d tries!!\n", guessCount);
					secondary = true;

				} else if (random < input) {
					System.out.println("Your guess is too high. Try again.\n");
					Insecondary = false;

				} else {
					System.out.println("Your guess is too low. Try again.\n");
					Insecondary = false;
				} // end of else statement

			} while (!secondary); // End of Game(secondary) do loop
			///////////////////////////////////////////////////

			//////////////////////////////////////////////////
			// Start of (Tertiary)Non-Numeric Input Validation do-while loop
			boolean tertiary = false;
			// Declare variables
			do {
				System.out.print("\nWould you like to play again? ");
				answer = in.nextLine();

				///////////////////////
				// start of if statement
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Y")) {
					System.out.println("");
					guessCount = 0;
					primary = false;
					tertiary = true; // Exit tertiary loop to restart the game

				} else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
					primary = true;
					tertiary = true; // Exit tertiary loop to end the program

				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.\n");
				} // end of if statement
					/////////////////////////

			} while (!tertiary); // end of the Non-Numeric Input Validation (tertiary) do-while loop

			// End of (Tertiary)Non-Numeric Input Validation do-while loop
			//////////////////////////////////////////////////

		} while (!primary); // end of the primary program main do

		in.close();

	} // end of main

} // end of class
