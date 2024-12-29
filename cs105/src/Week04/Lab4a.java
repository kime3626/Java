/**
* File: Lab4a.java
* Description: This program asks the user to enter a whole number. Using input validation it ensures the user entered a valid whole number. It also performs simple math on numbers to ensure the input validation routine works as expected.
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*     boolean
*     do - while loop
*     try - catch
*   
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 1 February 2024
*/

package Week04;

import java.util.Scanner;

public class Lab4a {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		String input;
		int num1 = 0, num2, num3;
		boolean valid = false;

		while (!valid) {

			// Declare variables
			do {

				System.out.print("Please enter a number: ");
				input = in.nextLine();

				try {
					num1 = Integer.parseInt(input);
					valid = true;
				} catch (Exception e) {
					System.out.println("Error: Please enter a whole number.\n");

				} // end of try/catch

			} while (!valid);

		} // end of while

		num2 = num1 + 1000;
		num3 = num1 * 2;

		System.out.printf("num1 = %d.\n", num1);
		System.out.printf("num2 = %d.\n", num2);
		System.out.printf("num3 = %d.\n", num3);

		in.close();// closing the scanner

	}// end of main

}// end of class
