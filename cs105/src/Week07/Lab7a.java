/**
* File: Lab7a.java
* Description: This program will ask the user to enter a name and a birth year for a potential student and determine what type of school, if any, the potential student is eligible to attend.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*	Method calling and return
*   LocalDate module
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 22 February 2024
*/

package Week07;

import java.util.Scanner; // Needed for user input
import java.time.LocalDate; // Import the LocalDate class

public class Lab7a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "", name = "";
		int year = 0;
		boolean primary = false, playagain = false, intyear = false;

		// Introduction of the program
		System.out.println("This program will ask the user to enter a name and a birth year for a potential student.");
		System.out.println(
				"The program will then determine what type of school, if any, the potential student is eligible to attend.\n");

		//start of Primary do - while 
		do {
		
		// asking the potential student's name
		System.out.print("Please enter the name of a potential student: ");
		name = in.nextLine();

		// asking the potential student's birth year
		do {
			System.out.print("Please enter the year the potential student was born: ");
			input = in.nextLine();

			// start of try/catch
			try {
				year = Integer.parseInt(input);
				intyear = true;
			} catch (Exception e) {
				System.out.println("\nInvalid Response: Please enter a whole number.");
				intyear = false;
			} // end of try/catch
		} while (!intyear);// end of do-while intyear

		// calling the second method (checkEligibility)
		checkEligibility(name, year, year);

		// playagain
		do {
			System.out.print("\nWould you like to play again? (Y/N): ");
				input = in.nextLine();
				
			if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("y")) {
				primary = false;
				playagain = true;
				System.out.println("");
				
			}else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("n")) {
				primary = true;
				playagain = true;
				
			}else {
				System.out.println("Invalid response: Please answer with a 'Y' or 'N'.\n");
				playagain = false;
			}//end of if statements
			
		} while (!playagain);//end of playagain

	} while (!primary);//end of primary do-while 
	
		in.close();// closing the scanner

	}// end of main

	// Start of method checkeligibility
	public static void checkEligibility(String name, int year, int caledAge) {

		// calling the thrid method calculateAge
		calculateAge(year);

		if (calculateAge(caledAge) >= 0 && calculateAge(caledAge) <= 4) {
			System.out.printf("%s is %d years old. %s is too young to attend school.\n", name, calculateAge(caledAge),
					name);
		} else if (calculateAge(caledAge) >= 5 && calculateAge(caledAge) <= 11) {
			System.out.printf("%s is %d years old. %s may attend Elementary school.\n", name, calculateAge(caledAge),
					name);
		} else if (calculateAge(caledAge) >= 12 && calculateAge(caledAge) <= 14) {
			System.out.printf("%s is %d years old. %s may attend Jr. High school.\n", name, calculateAge(caledAge), name);
		} else if (calculateAge(caledAge) >= 15 && calculateAge(caledAge) <= 17) {
			System.out.printf("%s is %d years old. %s may attend High school.\n", name, calculateAge(caledAge), name);
		} else {
			System.out.printf("%s is %d years old. %s may attend college.\n", name, calculateAge(caledAge), name);
		} // end of if statements

	}// end of checkEligibility

	// start of method calculateAge
	public static int calculateAge(int year) {
		int caledAge;

		// getting current year to calculte with
		LocalDate rightnow = LocalDate.now();
		int thisYear = rightnow.getYear();

		// calculating age of the potential student
		caledAge = thisYear - year;

		return caledAge;// returning age

	}// end of calculateAge

}// end of class
