/**
* File: Lab7i.java
* Description: This program interacts with the user to input numbers and play a mathematical game repeatedly.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*	Method calling and return
*   
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 27 February 2024
*/

package Week07;

import java.util.Scanner;

public class Lab7i {

	public static void main(String[] args) {
		// Play the game until the user says they don't want to play again.
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {

			// Get an integer from the user
			int intNum = getValidInt("Please enter a whole number: ",
					"Invalid response. Only whole numbers are acceptable.");
			System.out.printf("The whole number your entered was: %d.\n", intNum);
			System.out.println("Now we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
			System.out.println();

			// Get a floating-point from the user
			double doubleNum = getValidDouble("Please enter a decimal-point number: ",
					"Invalid response. Only decimal-point numbers are acceptable.");
			System.out.printf("The float your entered was: %f.\n", doubleNum);
			System.out.println("Now we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
			System.out.println();

			// Get a 'Y' or 'N' from the user
			playAgain = getValidYN("Would you like to play again? (Y/N): ",
					"Invalid response. Please answer with a 'Y' or 'N'");
			System.out.println();
		} // end of while (playAgain.equalsIgnoreCase("y"))

	}// end of Main()

	public static int getValidInt(String question, String warning) {
		Scanner in = new Scanner(System.in);
		int intnum = 0;
		String input;
		boolean wholenum = false;

		// start of do-while wholenum
		do {

			System.out.print(question);
			input = in.nextLine();

			try {
				intnum = Integer.parseInt(input);
				wholenum = true;

			} catch (Exception e) {
				System.out.println(warning);
				System.out.println("");
				wholenum = false;

			} // end of try/catch

		} while (!wholenum);// end of do-while wholenum

		// returning the whole number to main
		return intnum;

	}// end of getValidInt

	public static double getValidDouble(String question, String warning) {
		Scanner in = new Scanner(System.in);
		double notintnum = 0;
		String input;
		boolean validDouble = false;

		// start of do-while wholenum
		do {

			System.out.print(question);
			input = in.nextLine();

			try {
				notintnum = Double.parseDouble(input);
				validDouble = true;

			} catch (Exception e) {
				System.out.println(warning);
				System.out.println("");
				validDouble = false;

			} // end of try/catch

		} while (!validDouble);// end of do-while wholenum

		// returning the whole number to main
		return notintnum;

	}// end of getValidDouble

	public static String getValidYN(String question, String warning) {
		Scanner in = new Scanner(System.in);
		String input;
		boolean validYN = false;

		// start of do-while validYN
		do {
			System.out.print(question);
			input = in.nextLine();

			if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("y")) {
				return input;

			} else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("n")) {
				validYN = true;
				
			} else {
				System.out.println(warning);
				validYN = false;
			} // end of if statements

		} while (!validYN);// end of do-while validYN

		// returning the input to main
		return input;

	}// end of getValidYN

}// end of class
