/**
* File: Lab10c.java
* Description: This program will use Scanner object to read from a file and print the assignments with 0 .
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*  	Exception handling using try-catch blocks for parsing integer input
*   Use the Scanner to read data from a file
*  
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 14 March 2024
*/

package Week10;

import java.io.File;
import java.util.Scanner;

public class Lab10c {

	public static void main(String[] args) {

		String fileName = "Student Assignment Scores.csv";
		String[] markSheet = {};
		int score;
		File inFile = new File(fileName);

		Scanner file = null;
		try {
			file = new Scanner(inFile);

		} catch (Exception e) {
			System.out.printf("Error: The file %s is not found.", fileName);
			return;
		} // end of try/catch

		markSheet = file.nextLine().split(",");
		System.out.printf("%-20s%-7s \n", markSheet[0],"Assignment with 0");
		System.out.println("-------------------------------------");

		while (file.hasNextLine()) {

			markSheet = file.nextLine().split(",");

			for (int i = 1; i < markSheet.length; i++) {
				score = Integer.parseInt(markSheet[i]);
				
				if (score == 0) {
					System.out.printf("%-25s%-10s \n", markSheet[0], i);

				} // end of if statement

			} // end of for loop

		} // end of while loop

		file.close();// closing the scanner

	}// end of main

}// end of class
