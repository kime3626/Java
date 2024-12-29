/**
* File: Lab4b.java
* Description: This program asks the user to enter a whole number. Using input validation it ensures the user entered a valid whole number. It also performs simple math on numbers to ensure the input validation routine works as expected.
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*     boolean
*     do - while loop
*    if, else if, else
*    input.equalsIgnoreCase("")
*   	boolean
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 1 February 2024
*/

package Week04;

import java.util.Scanner;

public class Lab4b {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		String input;
		boolean valid = false;

		while (!valid) {

			// Declare variables
			do {

				System.out.print("Do you like to code in Java?: ");
				input = in.nextLine();

				// start of if statement
				if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("y")) {
					System.out.println("That's great! I do too!");
					valid = true;

				} else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("n")) {
					System.out.println("That's ok. There are many other wonderful things in life to learn.");
					valid = true;

				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.\n");

				} // end of if statement

			} while (!valid);

		} // end of do - while

		in.close();// closing the scanner

	}// end of main

}// end of class
