/**
* File: Lab12a.java
* Description: This program will make a shopping list.
* Lessons Learned: The concepts and constructs that you learned while creating this project. List the constructs as a list after this line
*   boolean data type
*  	Exception handling using try-catch blocks for parsing integer input
*   PrintWriter to save data to a fixed storage device
*	try/catch to handle PrintWriter errors without crashing
*  
*   
*     ...
* Instructor's Name: Jeff Light
*
* @author: Kimball Bushi
* @since: 2 April 2024
*/

package Week12;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab12b {

	public static void main(String[] args) {
		// Initialize variables
		Scanner sIn = new Scanner(System.in); // Input Scanner for String
		ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
		String choice; // Holds user input of type String
		boolean done = false; // Keeps program running until user wants to quit
		String fileName = "ShoppingList.txt";

		// Keep running the program until the user quits
		do {
			// Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Save List");
			System.out.println("6. Open List");
			System.out.println("7. Exit");
			System.out.print("Please enter a command: ");
			choice = sIn.nextLine();

			// Call the appropriate method for the choice selected.
			switch (choice) {
			case "1": // Add items to the Shopping List
				System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
				break;
			case "2": // Delete items from the Shopping List
				System.out
						.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
				break;
			case "3": // Show the items in the Shopping List
				showItems(shoppingList);
				break;
			case "4": // Sort the items in the Shopping List
				sortItems(shoppingList);
				break;
			case "5":
				saveList(sIn, shoppingList, fileName);
				break;
			case "6":
				shoppingList = openList(sIn, shoppingList, fileName);
				break;
			case "7":
				System.out.println("\nGoodbye");
				done = true;
				break;
			default: // Handles all input that is not between 1-5
				System.out.println("Invalid response.  Please enter a choice from the menu (1-7).");
			} // End of switch (choice)

		} while (!done); // Keep running the program until the user quits

	}// end of main()

	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {

		int count = 0;

		System.out.print("\nAdd an item to the list (or just hit 'ENTER' when done): ");
		String Input = sIn.nextLine();

		while (!Input.isEmpty()) {

			int colon = Input.indexOf(':');

			if (colon != -1) {

				String item = Input.substring(0, colon).trim();
				String amount = Input.substring(colon + 1).trim();
				shoppingList.add(item + ":" + amount);

				System.out.printf("'%s:%s' has been added to the Shopping List.\n", item, amount);
				count++;

			} else {
				System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'\n");

			} // end of if statements

			System.out.print("\nAdd an item to the list (or just hit 'ENTER' when done): ");
			Input = sIn.nextLine().trim();

		} // end of while

		return count;

	} // end of method addItems(ArrayList<String>)

	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {

		int count = 0;

		if (shoppingList.isEmpty()) {
			System.out.println("\nThe Shopping List is empty. No items to delete.");
			return 0;
		} // end of if statement

		System.out.print("\nDelete an item from the list (or just hit 'ENTER' when done): ");
		String item;
		while (!(item = sIn.nextLine()).isEmpty()) {
			if (shoppingList.remove(item)) {
				System.out.printf("'%s' has been deleted from the Shopping List.\n", item);
				count++;
			} else {
				System.out.printf("Invalid response! '%s' is NOT an item in the list.\n", item);
				System.out.printf("\nThe Shopping List contains the following items:\n%s", showItems(shoppingList));

			} // end of if statements

			System.out.print("\nDelete an item from the list (or just hit 'ENTER' when done): ");

		} // end of while loop

		return count;

	}// end of method deleteItems(ArrayList<String>)

	public static ArrayList<String> showItems(ArrayList<String> shoppingList) {

		if (shoppingList.isEmpty()) {
			System.out.println("\nThe Shopping List is empty.");
			return shoppingList;
		} // end of if statement

		System.out.println("\n--------------------------");
		System.out.println("\n      Shopping List       ");
		System.out.println("\n--------------------------");

		for (String item : shoppingList) {

			int colon = item.indexOf(':');
			String product = item.substring(0, colon).trim();
			String amount = item.substring(colon + 1).trim();
			System.out.printf("%-20s%s\n", product, amount);

		} // end of for loop

		System.out.println("--------------------------");
		return shoppingList;

	}// end of method showItems(ArrayList<String>)

	public static void sortItems(ArrayList<String> shoppingList) {

		if (shoppingList.isEmpty()) {
			System.out.println("The Shopping List is empty. No items to sort.");
		} else {
			shoppingList.sort(null);
			System.out.println("The Shopping List has been sorted.");
			showItems(shoppingList);
		} // end of if statements

	}// end of method sortItems(ArrayList<String>)

	public static void saveList(Scanner sIn, ArrayList<String> shoppingList, String filename) {
		boolean repeat = false;

		do {

			System.out.printf("Are you sure you wish to overwrite the '%s' file with your current list? (Y/N)",
					filename);
			String confirm = sIn.nextLine().trim().toUpperCase();

			if (confirm.equals("Y")) {
				try {
					PrintWriter writer = new PrintWriter(filename);

					for (String item : shoppingList) {
						writer.println(item);
					} // end of for loop

					writer.close();
					System.out.printf("Shopping List saved to file: '%s' \n", filename);
					repeat = true;

				} catch (Exception e) {
					System.out.println("Error: Failed to save the shopping list to file.");
				} // end of try/catch block

			} else if (confirm.equals("N")) {
				System.out.println("Shopping List not saved.");
				repeat = true;

			} else {
				System.out.println("Invalid response. Please answer with a 'Y' or 'N'");
				repeat = false;
			} // end of if-else

		} while (!repeat);// end of do-while loop

	}// end of saveList

	public static ArrayList<String> openList(Scanner sIn, ArrayList<String> shoppingList, String fileName) {
	    boolean again;
	    
	    do {
	        System.out.printf("Are you sure you wish to overwrite your current shopping list with the '%s' file? (Y/N) ", fileName);
	        String confirm = sIn.nextLine().trim().toUpperCase();

	        if (confirm.equals("Y")) {
	            File file = new File(fileName);
	            
	            if (file.exists()) {
	            	
	                try {
	                    Scanner fileScanner = new Scanner(file);
	                    shoppingList.clear(); // Clear current list before adding from file
	                    
	                    while (fileScanner.hasNextLine()) {
	                        shoppingList.add(fileScanner.nextLine());
	                    }//end of while loop
	                    
	                    fileScanner.close();
	                    System.out.printf("Shopping List overwritten from file: %s.\n", fileName);
	                    
	                } catch (FileNotFoundException e) {
	                    System.out.println("File Error: File not found! Please save the list before trying to open it.");
	                }//end of try/catch block
	                
	            } else {
	                System.out.printf("\nFile Error: File '%s' not found! Please save the list before trying to open it.\n", fileName);
	            }//end of nested if-else
	            again = false;
	            
	        } else if (confirm.equals("N")) {
	            System.out.println("Shopping List not opened.");
	            again = false;
	        } else {
	            System.out.println("Invalid response. Please answer with a 'Y' or 'N'");
	            again = true;
	        }//end of if-else statement
	        
	    } while (again);//end of do-while loop
	    
	    return shoppingList;
	    
	}//end of openList

}// end of class Lab9aStartCode
