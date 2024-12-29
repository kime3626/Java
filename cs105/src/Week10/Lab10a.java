/**
* File: Lab10a.java
* Description: This program will use Scanner object to read from a file and print the String variable.
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

public class Lab10a {

	public static void main(String[] args) {

		String fileName = "Student Assignment Scores.csv";
		String line;
		File inFile = new File(fileName);

		Scanner file = null;
		try {
			file = new Scanner(inFile);

		} catch (Exception e) {
			System.out.printf("Error: The file %s is not found.", fileName);
			return;
		} // end of try/catch
	
			
		while(file.hasNext()) {
			
			line = file.nextLine();
			System.out.println(line);
		}//end of while loop

		file.close();

	}// end of main

}// end of class
