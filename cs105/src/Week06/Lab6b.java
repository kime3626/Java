/**
* File: Lab6b.java
* Description: This program will ask the user for 2 numbers and raise the first number to the power of the second.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*   do-while loop
*   if, else-if, else statements
*   input.equalsIgnoreCase("") for case-insensitive input comparison
*  	Exception handling using try-catch blocks for parsing integer input
*  	Input validation for variable
*  	Input validation for integers
*	Method calling and return
*     
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 15 February 2024
*/

package Week06;

import java.util.Scanner;

public class Lab6b {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);		
		String answer = "";
		int num1 = 0, num2 = 0;
		boolean primary = false, playagain = false, int1 = false, int2 = false;
	
		System.out.println("This program will ask the user for 2 numbers and raise the first number to the power of the second. \n");
		
		//start of primary loop
		do {
			
			//askinig the user for first whole number
			do {
				System.out.print("Please enter the first number: ");
				answer = in.nextLine();
				
				try {
					num1 = Integer.parseInt(answer);
					int1 = true;
					
				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number. \n");
					int1 = false;
				}//end of try/catch block
				
			} while (!int1);//end of do-while int1
			
			//asking the user for second whoe number
			do {
				System.out.print("Please enter the second number: ");
				answer = in.nextLine();
				
				try {
					num2 = Integer.parseInt(answer);
					int2 = true;
					
				} catch (Exception e) {
					System.out.println("Invalid Response: Please enter a whole number.\n");
					int2 = false;
				}//end of try/catch block
				
			} while (!int2); //end of do-while int2
			
			
			System.out.printf("%d raised to the power of %d is: %d.\n", num1, num2, power(num1, num2));
		
			//asking the user if they want to playagain
			do {
				System.out.print("\nWould you like to play again? (Y/N): ");
				answer = in.nextLine();
				
				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y")) {
					playagain = true;
					primary = false;
					System.out.println("");
					
				}else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
					playagain = true;
					primary = true;
				}else {
					System.out.println("Invalid response: Please answer with a 'Y' or 'N'.\n");
					playagain = false;
				}//end of if statements
				
			} while (!playagain);//end of do-while playagain
		
		} while (!primary);//end of do-while primary loop
		
		in.close();//closing the scanner
		
	}//end of main
	
	//calculating num1 to the power num2
	public static int power(int num1, int num2) {
		int num3, num4 = 1;
		
		for (num3 = 0; num3 < num2; num3++) {
			
			num4 *= num1;
			
		}//end of for loop
		
		return num4;//returning the result to main 
		
	}//end of power
	

}//end of class
