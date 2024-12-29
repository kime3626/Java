/*
 * Program: Final Exam 2
 * Name:Kimball Vincington Bushi
 * Date: 4/9/2020
 * Instructor: Jeff Light
 * Description: Arrays and Functions
 */
package Week14;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {

		System.out.println("In this program, you will ask the user to enter a list of numbers.");
		System.out.println(
				"The program will then find the sum of the numbers and determine which of the numbers is the largest.\n");

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.print("Please enter a number (or just hit enter to finish): ");

		while (in.hasNextLine()) {
			String input = in.nextLine();
			if (input.isEmpty()) {
				break;
			} // end of if statement

			try {
				int number = Integer.parseInt(input);
				numbers.add(number);
			} catch (NumberFormatException e) {
				System.out.println("Invalid response. Please enter a whole number.\n");
			}//end of try/catch block

			System.out.print("Please enter a number (or just hit enter to finish): ");

		} // end of while loop

		System.out.println();

		int sumNumbers = addNumbers(numbers);//calling method addNumbers()
		int largest = largestNumber(numbers);//calling method largestNumber()

		System.out.println("The sum of the list of numbers is: " + sumNumbers + ".");
		System.out.println("The largest number in the list is: " + largest + ".");

		in.close();//closing the scanner

	}// end of main()

	public static int addNumbers(ArrayList<Integer> numbers) {
		int sum = 0;

		for (int number : numbers) {
			sum += number;
		} // end of for loop

		return sum;// returning the result

	}// end of addNumbers

	public static int largestNumber(ArrayList<Integer> numbers) {
		int largest = numbers.get(0);

		for (int i = 1; i < numbers.size(); i++) {
			int number = numbers.get(i);
			if (number > largest) {
				largest = number;
			} // end of if

		} // end of for loop

		return largest;// returning the result

	}// end of largestNumber

}// end of class FinalExam2
