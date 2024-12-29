/**
* File: Lab5b.java
* Description: This program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving.
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
* @since: 12 February 2024
*/

package Week05;

import java.util.Scanner;

public class Lab5b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		double total = 0, dep = 0, ist = 0;
		int mnts = 0, nummnts = 0;
		boolean main, deposit, interest, months, playagain;

		// Display program introduction
		System.out.println(
				"This program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving.");
		System.out.println("It will then show the monthly balance over the period of planned savings.\n");

		main = false;
		do {

			// Asking the user for deposit
			deposit = false;
			do {
				// Get monthly deposit from user
				System.out.print("Please enter the amount to be deposited each month: ");
				answer = in.nextLine();

				// start of try/catch
				try {
					dep = Double.parseDouble(answer);
					deposit = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.\n");
				} // end of try/catch

			} while (!deposit); // end of do-while loop

			// Asking the user for annual interest rate
			interest = false;
			do {
				System.out.print("Please enter the annual interest rate: ");
				answer = in.nextLine();

				// start of try/catch
				try {
					ist = Double.parseDouble(answer);
					interest = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.\n");
				} // end of try/catch
			} while (!interest); // end of do while loop

			// Asking the user for number of months
			months = false;
			do {
				System.out.print("Please enter the number of months you plan to save: ");
				answer = in.nextLine();

				// start of try/catch
				try {
					nummnts = Integer.parseInt(answer);
					months = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.\n");
				} // end of try/catch

			} while (!months);// end of do-while loop

			// Convert interest rate to decimal and calculate monthly interest rate
			ist = (ist / 100); // Annual interest rate as a decimal
			ist = (ist / 12); // Monthly interest rate
			ist = (1 + ist);

			System.out.println(
					"\nThe following table shows the balance of the account for each month of the designated savings period.");
			System.out.println("Month		Balance");

			// calculating interest for the number of months the user needs
			for (mnts = 1; mnts <= nummnts; mnts++) {

				total = (total + dep) * ist;

				System.out.printf("Month %d:	$%,.2f\n", mnts, total);

			} // end of for loop

			total = 0;// To reset the value of total

			playagain = false;
			do {
				System.out.print("Would you like to make another calculation? (Y/N): ");
				answer = in.nextLine();

				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y")) {
					playagain = true;
					main = false;
					System.out.println("");

				} else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
					playagain = true;
					main = true;

				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.\n");
				} // end of if statements

			} while (!playagain);// end of do-while statement

		} while (!main);// end of main do-while

		in.close();// closing the scanner

	}// end of main

}// end of class
