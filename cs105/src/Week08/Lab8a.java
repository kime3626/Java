/**
* File: Lab8a.java
* Description: This program will ask the user to enter a series of numbers, then display the array of numbers and the sum total of those numbers.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*	Method calling and return
*   Arraylist
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 27 February 2024
*/

package Week08;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab8a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		int num = 0;
		boolean validnum = false, primary = false, playagain = false;

		// start of do-while primary
		do {

			// Introduction of the program
			System.out.println("This program will ask the user to enter a series of numbers.");
			System.out.println(
					"The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.");
			System.out.println(
					"The program will then display the array of numbers and the sum total of those numbers.\n");

			// creating an empty list for the user
			ArrayList<Integer> usernums = new ArrayList<Integer>();

			// Start of do-while Validnum
			do {
				System.out.print("Please enter a number (or just hit enter to finish): ");
				input = in.nextLine();

				if (input.equals("")) {
					break;
				} // end of if-statement

				try {
					num = Integer.parseInt(input);
					usernums.add(num);

				} catch (Exception e) {
					System.out.println("Invalid response. Please enter a valid whole number.\n");

				} // end of try/catch

			} while (!validnum);// End of do-while Validnum

			// printing out the result
			System.out.println("Array Index      Item");

			for (int i = 0; i < usernums.size(); i++) {

				System.out.printf("     %d            %s\n", i, usernums.get(i));

			} // end of for loop

			// printing the rest of the results
			System.out.printf("There are %d items in the ArrayList.\n", usernums.size());
			System.out.printf("The sum total of numbers in the ArrayList is %d.", sumValues(usernums));

			// Asking the user if they want to playagain
			do {
				System.out.print("\nWould you like to play again? (Y/N): ");
				input = in.nextLine();

				if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("y")) {
					playagain = true;
					primary = false;
					System.out.println("");

				} else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("n")) {
					playagain = true;
					primary = true;

				} else {
					System.out.println("Invalid response: Please answer with a 'Y' or 'N'.");
					playagain = false;

				} // end of if statements

			} while (!playagain);// end of do-while playagain

		} while (!primary);// end of do-while primary

		in.close();// closing the scanner

	}// end of main

	public static int sumValues(ArrayList<Integer> usernums) {
		int total = 0;

		for (int i = 0; i <= usernums.size() - 1; i++) {

			total += usernums.get(i);

		} // end of for loop

		return total;
	}// end of sumValues

}// end of class
