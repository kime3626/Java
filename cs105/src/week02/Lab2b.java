/**
* File: Lab2b.java
* Description: Calculating the areas of a square and rectangle using user's input.
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*     Integer.parseInt(input);
*     Scanner in = new Scanner(System.in);
*     String = in.nextLine();
*     system.out.Print.();
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 21 January 2024
*/

package week02;

import java.util.Scanner;

public class Lab2b {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		String answer;
		int sqWidth, recWidth, recHeight, sqArea, recArea;

		// Asking the user for the width of the square.
		System.out.println("Please enter the width of the square: ");
		answer = in.nextLine();
		sqWidth = Integer.parseInt(answer);

		// Asking the user for the width of the rectangle.
		System.out.println("Please enter width of the rectangle: ");
		answer = in.nextLine();
		recWidth = Integer.parseInt(answer);

		// Asking the user for the height of the rectangle.
		System.out.println("Please enter height of the rectangle: ");
		answer = in.nextLine();
		recHeight = Integer.parseInt(answer);

		sqArea = sqWidth * sqWidth; // Formula to find area of square.
		System.out.printf("The area of a square with a width of %d is %d.\n", sqWidth, sqArea);

		recArea = recWidth * recHeight; // Formula to find area of rectangle.
		System.out.printf("The area of a rectangle with a width of %d and a height of %d is %d.", recWidth, recHeight,
				recArea);

	}

}
