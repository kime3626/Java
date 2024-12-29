/*
 * Program: Final Exam 1
 * Name:Kimball Vincington Bushi
 * Date: 4/9/2020
 * Instructor: Jeff Light
 * Description: Strings
 */
package Week14;

import java.util.Scanner;

public class FinalExam1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		String name = null;
		String ward = null;
		int males = 0, females = 0, total = 0;
		boolean validMales = false, validFemales = false;

		// asking the user for their name
		System.out.print("Please enter your name: ");
		input = in.nextLine();
		name = input;
		System.out.println();

		// asking the user for the name of their ward
		System.out.print("Please enter the name of your Ward:");
		input = in.nextLine();
		ward = input;
		System.out.println();

		// asking the user for the number of males in their ward
		do {

			System.out.print("Please enter the approximate number of adult males in the ward:");
			input = in.nextLine();

			// start of try/catch to validate the user's input
			try {
				males = Integer.parseInt(input);
				System.out.println();
				validMales = true;

			} catch (Exception e) {
				System.out.println("Invalid Response: Please enter a whole number.\n");
				validMales = false;
			} // end of try/catch

		} while (!validMales);// end of do-while loop for males

		// Asking the user for the number of females in their ward
		do {

			System.out.print("Please enter the approximate number of adult females in the ward:");
			input = in.nextLine();

			// start of try/catch to validate the user's input
			try {
				females = Integer.parseInt(input);
				System.out.println();
				validFemales = true;

			} catch (Exception e) {
				System.out.println("Invalid Response: Please enter a whole number.\n");
				validFemales = false;
			} // end of try/catch

		} while (!validFemales);// end of do-while loop for females

		total = males + females;// finding the sum of adult members

		System.out.printf("There are %s adult members in %s's %s ward.", total, name, ward);

		in.close();// closing the scanner

	}// end of main()

}// end of class FinalExam1
