/**
* File: Lab11b.java
* Description: This program will show the name of an apostle based on the order they were called with President Nelson as #1
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*  	Exception handling using try-catch blocks for parsing integer input
*   Use the Scanner to read data from a file
*   Switch Statement
*  
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 21 March 2024
*/

package Week11;

import java.util.Scanner;

public class Lab11b {

	public static void main(String[] args) {
		String answer = "";
		boolean playagain = true;
		Scanner in = new Scanner(System.in);

		do {

			System.out.println(
					"This program will show the name of an apostle based on the order they were called with President Nelson as #1");
			System.out.print(
					"Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit): ");
			answer = in.nextLine();

			switch (answer) {
			case "":
				playagain = false;
				break;

			case "1":
				System.out.println("\nNumber 1 is: Russell M Nelson\n");
				break;

			case "2":
				System.out.println("\nNumber 2 is: Dallin H. Oaks\n");
				break;

			case "3":
				System.out.println("\nNumber 3 is: Henry B. Eyring\n");
				break;

			case "4":
				System.out.println("\nNumber 4 is: Dieter F. Uchtdorf\n");
				break;

			case "5":
				System.out.println("\nNumber 5 is: David A. Bednar\n");
				break;

			case "6":
				System.out.println("\nNumber 6 is: Quentin L. Cook\n");
				break;

			case "7":
				System.out.println("\nNumber 7 is: D. Todd Christofferson\n");
				break;

			case "8":
				System.out.println("\nNumber 8 is: Neil L. Andersen\n");
				break;

			case "9":
				System.out.println("\nNumber 9 is: Ronald A. Rasband\n");
				break;

			case "10":
				System.out.println("\nNumber 10 is: Gary E. Stevenson\n");
				break;

			case "11":
				System.out.println("\nNumber 11 is: Dale G. Renlund\n");
				break;

			case "12":
				System.out.println("\nNumber 12 is: Gerrit W. Gong\n");
				break;

			case "13":
				System.out.println("\nNumber 13 is: Ulisses Soares\n");
				break;

			case "14":
				System.out.println("\nNumber 14 is: Patrick Kearon\n");
				break;

			default:
				System.out.println("\nThat's not a valid choice. Try again.\n");
				break;
			}// end of switch

		} while (playagain);

		in.close();// closing the scanner

	}// end of main

}// end of class
