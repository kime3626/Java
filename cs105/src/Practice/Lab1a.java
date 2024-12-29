package Practice;

import java.util.Scanner; 
import java.util.ArrayList; 
import java.util.Collections; 
public class Lab1a {

	public static void main(String[] args) {
	    // Create an ArrayList to store the integers entered by the user.
	    ArrayList<Integer> allNum = new ArrayList<Integer>();
	    
	    // Control flag for the input loop.
	    boolean repeating = true;
	    
	    // Initialize the scanner for user input.
	    Scanner in = new Scanner(System.in);
	    
	    // Variables to store the sum of numbers and the largest number.
	    int sum = 0;
	    int biggestNum;
	    System.out.println("In this program, you will enter a list of numbers.");
	    // Input loop to gather numbers from the user.
	    do {
	        System.out.println("Please enter a number (or hit the <Enter> key to stop): ");
	        String input = in.nextLine();
	        
	        // Check if the user wants to exit the loop.
	        if(input.equals("")) {
	            repeating = false;
	            continue;
	        }

	        // Try to parse the input as an integer and add to the list.
	        try {
	            int addNum = Integer.parseInt(input);
	            allNum.add(addNum);
	        } catch(Exception e) {
	            // Handle invalid input and prompt again.
	            System.out.println("Invalid response. Please enter a valid number.\n");
	        }
	    } while(repeating);

	    // Sort the list of numbers.
	    Collections.sort(allNum);

	    // Calculate the sum and find the largest number.
	    sum = addNumbers(allNum);
	    biggestNum = largestNumber(allNum);

	    // Print the results.
	    System.out.println("The total of the list of numbers is: " + sum);
	    System.out.println("The biggest number in the list is: " + biggestNum);
	}

	// Method to calculate the sum of numbers in the ArrayList.
	static int addNumbers(ArrayList<Integer> num) {
	    int sumNum = 0;
	    for(int i = 0; i < num.size(); i++) {
	        sumNum = sumNum + num.get(i);
	    }
	    return sumNum;
	}

	// Method to find the largest number in the ArrayList.
	static int largestNumber(ArrayList<Integer> num) {
	    int comparedNum = 0;
	    for(int i = 0; i < num.size() ;i++) {
	        if(comparedNum < num.get(i)) {
	            comparedNum = num.get(i);
	        }
	    }
	    return comparedNum;
	}
}

/**
* File: The name of the file such as "Lab1a.java"
* Description: A short description of the project.  This does not need to be long.  One sentence will suffice.
* Lessons Learned: The concepts and constructs that you learned while creating this project.  List the constructs as a list after this line
*  Reminding the previous material I learn in CS105
*  Based on input numbers, the code finds large number and the sum of number.
* 
* Instructor's Name: Barbara Chamberlin
*                           
* @author: Yuto Kikuchi
* @since: 01/25/2024.
*/

