/**
* File: Lab10d.java
* Description: This program will Store data input from a file in a nested Array.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*  	Exception handling using try-catch blocks for parsing integer input
*   Use the Scanner to read data from a file
*   if-else statments
*  
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 19 March 2024
*/

package Week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Przactice1 {

	public static void main(String[] args) {
		// ArrayList to store student data
		ArrayList<String[]> classRoster = new ArrayList<>();
		String[] student;

		// Open the file
		File file = new File("Student Test Grades Lab10D.csv");

		try {
			Scanner scanner = new Scanner(file);

			// Read each line of the file
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				// Split the line by commas and add to ArrayList
				String[] data = line.split(",");
				classRoster.add(data);
			} // end of while
			scanner.close(); // Close the file after reading

			for (int i = 0; i < classRoster.size(); i++) {
				student = classRoster.get(i);

				if (i == 0) {
					System.out.println("--------------------------------------------------------");
					System.out.printf("%-30s%-10s%-10s%-10s\n", student[0], student[1], student[2], student[3]);
					System.out.println("--------------------------------------------------------");
				} else {
					int grade1 = Integer.parseInt(student[1]);
					int grade2 = Integer.parseInt(student[2]);
					int grade3 = Integer.parseInt(student[3]);

					System.out.printf("%-30s%-10s%-10s%-10s\n", student[0], convertToLetterGrade(grade1),
							convertToLetterGrade(grade2), convertToLetterGrade(grade3));

				} // end of if-statements

			} // end of for loop
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} // end of try/catch

	}// end of main method

	// Method to convert numeric score to letter grade
	public static String convertToLetterGrade(int score) {
		if (score > 94)
			return "A";
		else if (score > 90)
			return "A-";
		else if (score > 87)
			return "B+";
		else if (score > 84)
			return "B";
		else if (score > 80)
			return "B-";
		else if (score > 77)
			return "C+";
		else if (score > 74)
			return "C";
		else if (score > 70)
			return "C-";
		else if (score > 67)
			return "D+";
		else if (score > 64)
			return "D";
		else if (score > 60)
			return "D-";
		else
			return "E"; // for scores below 60
	}// end of convertToLetterGrade method
}// end of class