/**
* File: Lab5i.java
* Description: This program will multiply each number between the starting number and ending number by the multiplier.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   do-while loop
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*  	Input validation for integers
*
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 14 February 2024
*/

package Week05;

import java.util.Scanner;

public class Lab5i {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		int num1 = 0, num2 = 0, num3 = 0, calnum = 0, total = 0;
		boolean primary = false, int1 = false, int2 = false, int3 = false, playagain = false;
		
		
		
			//Program introduction
			System.out.println("This program will ask the user for three numbers:\n* A starting number\n* An ending number\n* A multiplier");
			
			//description about the program
			System.out.println("The program will multiply each number between the starting number and ending number by the multiplier.");
			
			//start of primary do-while loop
			do {
				
			//asking the user for starting number
			do {
				System.out.print("\nPlease enter the starting number: ");
				answer = in.nextLine();
				
				try {
					num1 = Integer.parseInt(answer);
					int1 = true;
					
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.\n");
					int1 = false;
					
				}//end of try/catch block
				
			} while (!int1);//end of do-while loop (Int1)
			
			//Asking the user for an ending number
			do {
				System.out.print("Please enter the ending number: ");
				answer = in.nextLine();
				
				try {
					num2 = Integer.parseInt(answer);
					int2 = true;
					
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.\n");
					int2 = false;
					
				}//end of try/catch block
				
			} while (!int2);//End of do-while loop for int2
			
			//Asking the user for multiplier
			do {
				System.out.print("Please enter the multiplier: ");
				answer = in.nextLine();

				
				try {
					num3 = Integer.parseInt(answer);
					int3 = true;
					
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.\n");
					int3 = false;
				}//end of try/catch block
				
			} while (!int3); //end of do-while loop for int3
			
			//printing a blank line
			System.out.println("");
			
			
			for (calnum = num1; calnum <= num2; calnum++) {
				
				total = calnum * num3;
				System.out.printf("Multiplying %d by %d results in: %d\n", calnum ,num3, total);
				
			}//end of for loop
			
			total = 0; //resetting the value of total.
			
			//asking the user if they want to play again 
			do {
				System.out.print("Would you like to play again? (Y/N): ");
				answer = in.nextLine();
				
				//start of if statements
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y")) {
					playagain = true;
					primary = false;
					
				}else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
					playagain = true;
					primary = true;
					
				}else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.\n");
					playagain = false;
					
				}//end of if statements
				
			} while (!playagain);//end of do-while playagain
			
			
		} while (!primary);//end of primary do-while loop
		
			in.close();//closing the scanner
			
	}//end of main

}//end of class
