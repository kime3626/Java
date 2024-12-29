/**
* File: Lab7b.java
* Description: This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*	Method calling and return
*   Helper method
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 26 February 2024
*/

package Week07;

import java.util.Scanner;
import java.lang.Math;

public class Lab7b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		boolean primary = false, playagain = false, sideX = false;

		// start of primary do-while
		do {

			// program introduction
			System.out.println(
					"This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.");
			System.out.println(
					"The program will ask the user which side they wish to calculate and the lengths of the other two sides.");
			System.out.println(
					"Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle)\n");

			do {
				System.out.print("Which side of the triangle do you wish to calculate? (a/b/c): ");
				input = in.nextLine();

				if (input.equalsIgnoreCase("A") || input.equalsIgnoreCase("a")) {
					sideX = true;
					calculateSideA(in);

				} else if (input.equalsIgnoreCase("B") || input.equalsIgnoreCase("b")) {
					sideX = true;
					calculateSideB(in);

				} else if (input.equalsIgnoreCase("C") || input.equalsIgnoreCase("c")) {
					sideX = true;
					calculateSideC(in);

				} else {
					System.out.println("Invalid response: Please enter either a, b, or c.\n");
					sideX = false;
				} // end of if statements

			} while (!sideX);// end of do-while sideX

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
					System.out.println("Invalid response: Please answer with a 'Y' or 'N'.\n");
					playagain = false;

				} // end of if statements

			} while (!playagain);// end of do-while playagain

		} while (!primary);// end of do-while primary

		in.close();// closing the scanner

	}// end of main

	//calculating side A
	public static void calculateSideA(Scanner in) {

		double b = getSideLength(in, "b");
		double c = getSideLength(in, "c");
		double a = Math.sqrt((c * c) - (b * b));

		System.out.printf(
				"A right triangle with sides 'b' = %.1s and 'c' (hypotenuse) = %.1s, has a side 'a' which has a length of: %.1f \n",
				b, c, a);

	}// end of calculateSideA

	//calculating side B
	public static void calculateSideB(Scanner in) {

		double a = getSideLength(in, "a");
		double c = getSideLength(in, "c");
		double b = Math.sqrt((c * c) - (a * a));

		System.out.printf(
				"A right triangle with sides 'a' = %.1s and 'c' (hypotenuse) = %.1s, has a side 'b' which has a length of: %.1f \n",
				a, c, b);

	}// end of calculateSideB

	//calculating side C
	public static void calculateSideC(Scanner in) {

		double a = getSideLength(in, "a");
		double b = getSideLength(in, "b");
		double c = Math.sqrt((b * b) + (a * a));

		System.out.printf(
				"A right triangle with sides 'a' = %.1s and 'b' = %.1s, has a side 'c' (hypotenuse) which has a length of: %.1f \n",
				a, b, c);

	}// end of calculateSideC

	//Getting the length of the sides
	public static int getSideLength(Scanner in, String letter) {
		int lengthX = 0;
		boolean length = false;

		//start of do-while length
		do {
			System.out.printf("Please enter the length of side %s: ", letter);
			String input = in.nextLine();

			//start of try/catch
			try {
				lengthX = Integer.parseInt(input);
				length = true;

			} catch (Exception e) {
				System.out.println("\nInvalid response. Please enter a whole number.");

			} // end of try/catch

		} while (!length); // end of do-while length

		// returning the lenght of the side X(a,b,c)
		return lengthX;

	}// end of getSideLength

}// end of class
