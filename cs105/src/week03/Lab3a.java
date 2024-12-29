/**
* File: Lab3a.java
* Description: This program will determine a man's shirt size based on the measurement in inches of the customer's chest.
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*     if, else if, else
*     && operator
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 23 January 2024
*/

package week03;

import java.util.Scanner;

public class Lab3a {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		String input;
		int chestSize;

		// Display program introduction
		System.out.println(
				"In this program, we will determine a man's shirt size based on the measurement in inches of the customer's chest.");

		// Asking the customer's chest measurement in inches.
		System.out.println("Please enter the customer's chest measurement in inches: ");
		input = in.nextLine();
		chestSize = Integer.parseInt(input);

		// Start of 'if' Statement
		if (chestSize < 38) {
			System.out.printf("A customer with a chest measurement of %d inches needs to order a size S.", chestSize);
		} else if (chestSize >= 38 && chestSize < 40) {
			System.out.printf("A customer with a chest measurement of %d inches needs to order a size M.", chestSize);
		} else if (chestSize >= 40 && chestSize < 43) {
			System.out.printf("A customer with a chest measurement of %d inches needs to order a size L.", chestSize);
		} else if (chestSize >= 43 && chestSize < 46) {
			System.out.printf("A customer with a chest measurement of %d inches needs to order a size XL.", chestSize);
		} else {
			System.out.printf("A customer with a chest measurement of %d inches needs to order a size XXL.", chestSize);
		} // End of 'if' Statement

	}

}
