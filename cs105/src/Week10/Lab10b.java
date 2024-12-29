/**
* File: Lab10a.java
* Description: This program will use Scanner object to read from a file and print the String variable in a organised format.
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
* @since: 5 March 2024
*/

package Week10;

import java.io.File;
import java.util.Scanner;

public class Lab10b {

	public static void main(String[] args) {

		String fileName = "Student Assignment Scores.csv";
		String[] markSheet = {};
		File inFile = new File(fileName);

		Scanner file = null;
		try {
			file = new Scanner(inFile);

		} catch (Exception e) {
			System.out.printf("Error: The file %s is not found.", fileName);
			return;
		} // end of try/catch
	
		markSheet = file.nextLine().split(",");
		System.out.printf("%-30s%-7s%-7s%-7s%-7s%-7s%-7s \n", markSheet[0], markSheet[1], markSheet[2], markSheet[3], markSheet[4], markSheet[5], markSheet[6]);
		System.out.println("----------------------------------------------------------------------");
			
		while(file.hasNext()) {
			
			markSheet = file.nextLine().split(",");			
			System.out.printf("%-30s%-7s%-7s%-7s%-7s%-7s%-7s \n", markSheet[0], markSheet[1], markSheet[2], markSheet[3], markSheet[4], markSheet[5], markSheet[6]);

		}//end of while loop

		file.close();

	}// end of main

}// end of class
