/**
* File: Lab6a.java
* Description: This program will ask the user for three numbers and determine which of the three is the largest.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   do-while loop
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*  	Input validation for integers
*	Method calling and return
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 15 February 2024
*/

package Week06;

import java.util.Scanner;

public class Lab6a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		int num1 = 0, num2 = 0, num3 = 0;
		boolean primary = false, playagain = false, int1 = false, int2 = false, int3 = false;

		// introduction to the program
		System.out.println(
				"This program will ask the user for three numbers and determine which of the three is the largest.\n");

		// start of primary loop
		do {

			// asking the user for the first whole number
			do {
				System.out.print("Enter the first number: ");
				answer = in.nextLine();

				try {
					num1 = Integer.parseInt(answer);
					int1 = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.\n");
					int1 = false;
				} // end of try/catch

			} while (!int1);// end of do-while for int1

			// asking the user for the second whole number
			do {
				System.out.print("Enter the second number: ");
				answer = in.nextLine();

				try {
					num2 = Integer.parseInt(answer);
					int2 = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.\n");
					int2 = false;
				} // end of try/catch

			} while (!int2);// end of do-while int2

			// asking the user for the thrid whole number
			do {
				System.out.print("Please enter the third number: ");
				answer = in.nextLine();

				try {
					num3 = Integer.parseInt(answer);
					int3 = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.\n");
					int3 = false;
				} // end of try/catch

			} while (!int3);// end of do-while int3

			System.out.printf("\nThe largest of the three numbers is: %d\n", +largestNumber(num1, num2, num3));

			// Asking the user if they want to play again
			do {

				System.out.print("\nWould you like to play again? (Y/N): ");
				answer = in.nextLine();

				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y")) {
					playagain = true;
					primary = false;
					System.out.println("");

				} else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
					playagain = true;
					primary = true;

				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.\n");
					playagain = false;

				} // end of if statement

			} while (!playagain); // end of do-while playagain

		} while (!primary); // end of primary do loop

		in.close();// closing the scanner

	}// End of main

	public static int largestNumber(int num1, int num2, int num3) {

		int largest = num1;

		if (num2 > largest) {
			largest = num2;

		}
		if (num3 > largest) {
			largest = num3;
		} // end of nested if statements

		return largest;

	}// end of largestNumber

}// end of class
