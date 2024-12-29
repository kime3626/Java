/**
* File: Lab6c.java
* Description: This program will ask the user for 3 numbers and determine if the second number lies between the first and the third.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*	Method calling and return
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 19 February 2024
*/

package Week06;

import java.util.Scanner;

public class Lab6c {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		int num1 = 0, num2 = 0, num3 = 0;
		boolean primary = false, playagain = false, int1 = false, int2 = false, int3 = false;

		// Program introduction
		System.out.println(
				"This program will ask the user for 3 numbers and determine if the second number lies between the first and the third. \n");

		// start of primary loop
		do {

			// asking the user for the first whole number
			do {

				System.out.print("Please enter the low number: ");
				answer = in.nextLine();

				// Start of try/catch
				try {
					num1 = Integer.parseInt(answer);
					int1 = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.\n");
					int1 = false;

				} // end of try/catch

			} while (!int1);// end of do-while int1

			// asking the user for second whole number
			do {
				System.out.print("Please enter the number to be tested (the between number): ");
				answer = in.nextLine();

				// Start of try/catch
				try {
					num2 = Integer.parseInt(answer);
					int2 = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.\n");
					int2 = false;

				} // end of try/catch

			} while (!int2);// end of do-while int2

			// Asking the user for third whole number
			do {
				System.out.print("Please enter the high number: ");
				answer = in.nextLine();

				// start of try/catch
				try {
					num3 = Integer.parseInt(answer);
					int3 = true;

				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.\n");
					int3 = false;

				} // end of try/catch

			} while (!int3);// end of do-while int3
			
			//Start of if Statement
			if (isBetween(num1, num2, num3)) {
				System.out.printf("\n%d lies between the numbers %d and %d. \n", num2, num1, num3);

			} else if (!isBetween(num1, num2, num3)) {
				System.out.printf("\n%d DOES NOT lie between the numbers %d and %d. \n", num2, num1, num3);
				
			}//end of if statement
			
			//start of playagain
			do {
				System.out.print("\nWould you like to play again? (Y/N): ");
				answer = in.nextLine();
				
				//start of if statment
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y")) {
					playagain = true;
					primary = false;
					System.out.println("");
					
				}else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
					playagain = true;
					primary = true;
					
				}else {
					System.out.println("Invalid response: Please answer with a 'Y' or 'N'.\n");
					playagain = false;
					
				}//end of if statement
				
			} while (!playagain);//end of playagain loop

		} while (!primary);// end of primary loop

		in.close();// closing the scanner

	}// end of main

		public static boolean isBetween(int num1, int num2, int num3) {
			
			return (num1 < num2 && num2 < num3);
		}//end of isBetween
	
}// end of class
