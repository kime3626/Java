/**
* File: Lab3c.java
* Description: This program will ask a member's age and gender and determine which class they should attend on Sunday.
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*     if, else if, else, nested if
*     equalsIgnoreCase()
*   
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 28 January 2024
*/

package week03;

import java.util.Scanner;

public class Lab3c {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		String input, gender;
		int age;

		// Display program introduction
		System.out.println(
				"This program will ask a member's age and gender and determine which class they should attend on Sunday.\n");

		// Asking the customer's chest measurement in inches.
		System.out.println("Please enter the member's age: ");
		input = in.nextLine();
		age = Integer.parseInt(input);

		// Start of 'if' Statement
		if (age < 1) {
			System.out.println("The member is a Babe in Arms.");
		} else {
			// Check age for Nursery and Primary
			if (age >= 1 && age < 3) {
				System.out.println("The member should be in Nursery.");
			} else if (age >= 3 && age < 12) {
				System.out.println("The member should attend Primary.");
			} else {
				// Check age and gender for Young Men's/Women's and Priesthood /Relief Society
				if (age >= 12) {
					System.out.println("Please enter the member's gender :");
					gender = in.nextLine();

					if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("m")) {
						if (age >= 18) {
							System.out.println("The member should attend Priesthood.");
						} else {
							System.out.println("The member should attend Young Men's.");
						}
					} else if (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("f")) {
						if (age >= 18) {
							System.out.println("The member should attend Relief Society.");
						} else {
							System.out.println("The member should attend Young Women's.");
						}

					} // end of inner if-else block (gender check)
				} // end of outer if block (age >= 12)
			} // end of else block (age >= 3 && age < 12)
		} // end of outer else block (age < 1)

	}
}
