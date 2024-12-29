/**
 * File: Lab13a.java
 * Description: This program performs password analysis on passwords read from a file and categorizes them as valid or invalid based on certain criteria.
 *              It checks if passwords are at least 8 characters long, contain at least one uppercase letter, one lowercase letter, one number, and one special character.
 * Lessons Learned:
 *     1. File IO operations in Java for reading and writing files.
 *     2. Error handling using try-catch blocks to handle file-related exceptions.
 *     3. String manipulation and character checking to validate passwords.
 *
 * Instructor's Name: Jeffrey Light
 *
* @author: Kimball Bushi
* @since: 4 April 2024
 */

package Week13;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab13a {
	public static void main(String[] args) {
		File file = null;
		Scanner passwords = null;
		PrintWriter invalidPwd = null;
		PrintWriter validPwd = null;

		System.out.println("Beginning password analysis....");
		try {
			System.out.println("Opening file 'Pwd.txt'.");
			file = new File("./src/week13/Pwd.txt");
			passwords = new Scanner(file);
		} catch (Exception e) {
			System.out.println("File not found");
		}//end of try/catch

		try {
			invalidPwd = new PrintWriter("./src/week13/invalidpwd.txt");
		} catch (Exception e) {
			System.out.println("File not found");
		}//end of try/catch

		try {
			validPwd = new PrintWriter("./src/week13/validpwd.txt");
		} catch (Exception e) {
			System.out.println("File not found");
		}//end of try/catch block

		while (passwords.hasNextLine()) {
			String password = passwords.nextLine();

			if (password.length() < 8) {
				invalidPwd.printf("%-15s - Invalid Password!  Must be at least 8 characters long.\n", password);
			} else if (!hasUpper(password)) {
				invalidPwd.printf("%-15s - Invalid Password!  Must contain at least one UPPERCASE character.\n",
						password);
			} else if (!hasLower(password)) {
				invalidPwd.printf("%-15s - Invalid Password!  Must contain at least one LOWERCASE character.\n",
						password);
			} else if (!hasNumber(password)) {
				invalidPwd.printf("%-15s - Invalid Password!  Must contain at least one NUMBER.\n", password);
			} else if (!hasSpecial(password)) {
				invalidPwd.printf("%-15s - Invalid Password!  Must contain at least one of {@, #, %%, -, &, *}.\n",
						password);
			} else {
				validPwd.println(password);
			}//end of if statment
			
		}//end of while loop

		System.out.println("Analysis complete. Closing files.");
		passwords.close();
		invalidPwd.close();
		validPwd.close();

		System.out.println(
				"Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the C:\\MyLDSBC\\CS105\\eclipse-workspace\\CD105\\ directory.");
	}//end of main method

	public static final boolean hasUpper(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				return true;
			}//end of if statement
		}//end of for loop

		return false;
	}//end of hasUpper

	public static final boolean hasLower(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				return true;
			}//end of if statement
		}//end of for loop

		return false;
	}//end of hasLower

	public static final boolean hasNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) {
				return true;
			}//end of if statement
		}//end of for loop

		return false;
	}//end of hasNumber

	public static final boolean hasSpecial(String password) {
		String[] specialChars = { "@", "#", "%", "-", "&", "*" };

		for (int i = 0; i < password.length(); i++) {
			for (int j = 0; j < specialChars.length; j++) {
				if (password.charAt(i) == specialChars[j].charAt(0)) {
					return true;
				} // end of if statement
			} // end of nested for loop
		} // end of first for loop

		return false;
	}// end of hasSpecial
}//end of class
