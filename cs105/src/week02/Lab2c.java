/**
* File: Lab2c.java
* Description: This program will ask the user for a monthly deposit, an annual interest rate and then calculate the balance after 6 months.
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*     Double.parseDouble(input);
*     Scanner in = new Scanner(System.in);
*     String = in.nextLine();
*     system.out.Println.();
*     System.out.printf.();
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 22 January 2024
*/

package week02;

import java.util.Scanner;

public class Lab2c {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		String answer;
		double total, dep, ist;

		// Display program introduction
		System.out.println(
				"This program will ask the user for a monthly deposit, an annual interest rate and then calculate the balance after 6 months.\n");

		// Get monthly deposit from user
		System.out.println("Please enter the amount to be deposited each month:");
		answer = in.nextLine();
		dep = Double.parseDouble(answer);

		// Get annual interest rate from user
		System.out.println("Please enter the annual interest rate percent:");
		answer = in.nextLine();
		ist = Double.parseDouble(answer);

		// Convert interest rate to decimal and calculate monthly interest rate
		ist = (ist / 100); // Annual interest rate as a decimal
		ist = (ist / 12); // Monthly interest rate
		ist = (1 + ist);

		// Calculate ending balance for each of the 6 months
		total = dep * ist; // Month 1
		total = (total + dep) * ist; // Month 2
		total = (total + dep) * ist; // Month 3
		total = (total + dep) * ist; // Month 4
		total = (total + dep) * ist; // Month 5
		total = (total + dep) * ist; // Month 6

		// Display the ending balance after 6 months
		System.out.printf("\nThe ending balance after 6 months is: $%f", total);

	}

}
