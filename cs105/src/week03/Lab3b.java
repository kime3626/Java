/**
* File: Lab3b.java
* Description: This program will calculate a person's BMI..
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*     if, else if, else
*     && operator
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 28 January 2024
*/

package week03;

import java.util.Scanner;

public class Lab3b {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);
		String input;
		double height, weight, meters, kg, BMI;

		// Display program introduction
		System.out.println("In this program we will calculate a person's BMI.\n");

		// Asking the customer's chest measurement in inches.
		System.out.println("Please enter a person's height in inches: ");
		input = in.nextLine();
		height = Double.parseDouble(input);

		// Converting inches to meters
		meters = (height * 0.0254);

		// Asking the customer's chest measurement in inches.
		System.out.println("Please enter a person's weight in pounds: ");
		input = in.nextLine();
		weight = Double.parseDouble(input);

		// Converting pounds to kg's
		kg = (weight * 0.45359237);

		// Calculating BMI using user's input
		BMI = (kg) / (meters * meters);

		// Start of 'if' Statement
		if (BMI < 18.5) {
			System.out.printf("The person's BMI is: " + BMI + ". The person has a BMI classification of: Underweight");
		} else if (BMI >= 18.5 && BMI <= 24.9) {
			System.out.printf("The person's BMI is: " + BMI + ". The person has a BMI classification of: Normal");
		} else if (BMI >= 25.0 && BMI <= 29.9) {
			System.out.printf("The person's BMI is: " + BMI + ". The person has a BMI classification of: Overweight");
		} else if (BMI >= 30.0) {
			System.out.printf("The person's BMI is: " + BMI + ". The person has a BMI classification of: Obese");
		} // End of 'if' Statement

	}

}
