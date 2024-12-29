package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab8a {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input;
		int wholenum;
		boolean inputnums = false;
		
		System.out.println("This program will ask the user to enter a series of numbers.");
		System.out.println("The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.");
		System.out.println("The program will then display the array of numbers and the sum total of those numbers.\n");
		
		ArrayList<Integer> userInput = new ArrayList<Integer>() ; 
		
		do {

		System.out.print("Please enter a number (or just hit enter to finish): ");
		input = in.nextLine();
		
		if (input.equals("")) {
			break;
		}//end of if
		
		try {
			wholenum = Integer.parseInt(input);
			userInput.add(wholenum);
			
		} catch (Exception e) {
			System.out.println("Invalid response. Please enter a valid whole number.\n");
		}
		
	} while (!inputnums);
		
		for (int i = 0; i < userInput.size(); i++) {
			System.out.printf("%d       %d\n", i, userInput.get(i));
		}
		
		System.out.printf("There are %s items in the ArrayList.\n", userInput.size());
		System.out.printf("The sum total of numbers in the ArrayList is %s.\n", sumValues(userInput));
		
	}//end of main

	public static int sumValues(ArrayList<Integer> userInput) {
		int sumNum = 0;
		for (int i = 0; i < userInput.size(); i++) {
			sumNum += userInput.get(i);
			
		}
		
		return sumNum;
	}

}// end of class
