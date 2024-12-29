/**
* File: Lab6e.java
* Description: This program will ask the user to enter something and then print out a reversed version of the user's input.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*	Method calling and return
*	charAt();
*   DECREMENTING for-loop
*   while-loop that is DECREMENTED in the body of the loop
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 19 February 2024
*/

package Week06;

import java.util.Scanner;

public class Lab6e {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		boolean primary = false, playagain = false;

		// Program introduction
					System.out.println(
							"This program will ask the user to enter something and then print out a reversed version of the user's input.\n");
					
		//start of primary loop
		do {
			
			System.out.print("Please enter something: ");
			answer = in.nextLine();

			// printing the output of reversewithForloop
			System.out.printf("Using the for loop: The reverse of %s is: %s\n", answer, reversewithForloop(answer));

			// printing the output of reversewithWhileloop
			System.out.printf("Using the while loop: The reverse of %s is: %s\n\n", answer, reversewithWhileloop(answer));

			// start of playagain
			do {
				System.out.print("Would you like to play again? (Y/N): ");
				answer = in.nextLine();

				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y")) {
					playagain = true;
					primary = false;
					System.out.println("");

				} else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
					playagain = true;
					primary = true;
				} else {
					System.out.println("Invalid response: Please answer with a 'Y' or 'N'.\n");
					playagain = false;
				} // end of if-statement

			} while (!playagain);// end of playagain loop

		} while (!primary);// end of primary loop

		in.close();// closing the scanner

	}// end of main

	public static String reversewithForloop(String input) {
		String reversedFor = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reversedFor += input.charAt(i);
		} // end of for loop

		return reversedFor;

	}// end if reversewithForloop

	public static String reversewithWhileloop(String input) {
		String reversedwhile = "";
		int i = input.length() - 1;

		while (i >= 0) {
			reversedwhile += input.charAt(i);
			i--;

		} // end of while-loop

		return reversedwhile;

	}// end of reversewithWhileloop

}// end of class