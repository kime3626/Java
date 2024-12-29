/**
* File: Lab5a.java
* Description: This program will ask the user for 3 integers and find out if the numbers between the first and second integers are divisible by the third integer and print out the divisible numbers.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   do-while loop
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*  	Input validation for integers
*	operator %
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 8 February 2024
*/

package Week05;

import java.util.Scanner;

public class Lab5a {

	public static void main(String[] args) {
		// using scanner for getting input from the user
		Scanner in = new Scanner(System.in);
		String answer = "";
		int num1 = 0, num2 = 0, num3 = 0, output, mode;
		boolean main, valid1, valid2, valid3, playagain;

		main = false;
			do {

				// Introduction to the program
				System.out.println(
						"In this program, we will display a series of numbers divisible by an integer specified by the user.");
				System.out.println(
						"You will ask the user for the starting number, the ending number and the integer to be considered.\n");

				// Asking the user for first integer
				valid1 = false;
					do {
						System.out.print("Enter the starting number: ");
						answer = in.nextLine();

						try {
							num1 = Integer.parseInt(answer);
							valid1 = true;

						} catch (Exception e) {
							System.out.println("Error: Please enter a whole number.\n");
							valid1 = false;
						} // end of try/catch

					} while (!valid1); // end of while loop (Valid1)

				// Asking the user for second integer
				valid2 = false;
					do {
						System.out.print("Enter the ending number: ");
						answer = in.nextLine();

						try {
							num2 = Integer.parseInt(answer);
							valid2 = true;

						} catch (Exception e) {
							System.out.println("Error: Please enter a whole number.\n");
							valid2 = false;
						} // end of try/catch

					} while (!valid2);// end of while loop (valid2)

				// Asking the user for thrid integer
				valid3 = false;
					do {
						System.out.print("Enter the test number: ");
						answer = in.nextLine();

						try {
							num3 = Integer.parseInt(answer);
							valid3 = true;

						} catch (Exception e) {
							System.out.println("Error: Please enter a whole number.\n");
							valid3 = false;
						} // end of try/catch

					} while (!valid3);// end of while(valid3)

				System.out.printf("Here are the numbers between %d and %d that are divisible by %d:\n", num1, num2,
						num3);

				for (output = num1; output <= num2; output++) {

					mode = output % num3;

					if (mode == 0) {

						System.out.println(output);

					} // end of if statement

				} // end of for loop

				playagain = false;
					do {

						System.out.print("Would you like to play again? ");
						answer = in.nextLine();

						// start of if statements
						if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y")) {
							playagain = true;
							System.out.println("");
							main = false;

						} else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
							playagain = true;
							main = true;

						} else {
							System.out.println("Error: Please answer with a 'Y' or 'N'.\n");
						} // End of if statment

					} while (!playagain); // end of while (!playagain)

			} while (!main); // end of main while loop

	} // end of main
} // end of class
