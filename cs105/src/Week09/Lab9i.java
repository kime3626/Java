/*
Program: 9i Starter Code
Names: Kimball Bushi
Date: 03/14/2024
Instructor: Jeff Light
Description: Individual work - Flexible Input validation - Starter Code
*/
package Week09;

import java.util.Scanner;

public class Lab9i {

	public static void main(String[] args) {
		//Initialize local variables
	    Scanner sIn = new Scanner(System.in);	//Input Scanner for String
		int intNum = 0;
		double doubleNum = 0;
		String choice = "";
		String playAgain = "Y";
		
		//Keep program running until user wants to quit		
	    do {
	    	//Get an integer from the user
	    	int[] intRange1 = {}; 
	        intNum = getValidInt(sIn, "Please enter your age: ", "Invalid response. Age must be a whole number.",intRange1);
	        System.out.println("The whole number your entered was: "+ intNum);
	        System.out.println("Now we will test your whole number in a math equation...");
	        System.out.printf("In a decade, you will be: 10 + %d = %d.\n\n",intNum, (intNum + 10));

	        //Get an integer within a range from the user
	    	int[] intRange2 = {3, 18}; 
	        intNum = getValidInt(sIn, "Please enter a number between 3 and 18 that represents the number of credit hours you are taking: ", "Invalid response. You can only take between 3 and 18 credit hours per semester.",intRange2);
	        System.out.println("The whole number your entered was: "+ intNum);
	        System.out.println("Now we will test your whole number in a math equation...");
	        System.out.printf("Adding a 3 credit hour class to your schedule would cause your current credit load to be: 3 + %d = $%d.\n\n",intNum,(intNum + 3));

	        //Get a Double from the user
	        double[] doubleRange1 = {}; 
	        doubleNum = getValidDouble(sIn, "Please enter the current price for a gallon of gasoline: ", "Invalid response. The price of gasoline must be a floating-point numbers.",doubleRange1);
	        System.out.println("The float your entered was: " + doubleNum);
	        System.out.println("Now we will test your floating-point number in a math equation...");
	        System.out.printf("If the price of gasoline goes up by another $0.50, the price for a gallon of gasoline will then be: 0.50 + %.2f = $%.2f.\n\n", doubleNum, (doubleNum + 0.50));

	        //Get a Double within a range from the user
	        double[] doubleRange2 = {7.5, 15.5}; 
	        doubleNum = getValidDouble(sIn, "Please enter a number between 7.50 and 15.50 that represents your part time wage: ", "Invalid response. The place you work only pays people between $7.50 and $15.50 per hour.",doubleRange2);
	        System.out.println("The float your entered was: " + doubleNum);
	        System.out.println("Now we will test your floating-point number in a math equation...");
	        System.out.printf("If you reveived a $2.75 raise, your new hourly wage would be: 2.75 + %.2f = $%.2f.\n\n", doubleNum, (doubleNum + 2.75));
	        
	        //Get either an "a", "b" or "c" from the user
	        String[] options1 = {"a","b","c"};
	        choice = getValidString(sIn, "Please enter 'a', 'b' or 'c': ", "Invalid response. Only the letters 'a', 'b' or 'c' are acceptable.", options1);
	        System.out.printf("The letter your entered was: %s\n\n", choice);

	        //Get a word from the user
	        String[] options2 = {"Chocolate","Vanilla","Strawberry", "Pistachio", "Rocky Road"};
	        choice = getValidString(sIn, "Please choose either Chocolate, Vanilla, Strawberry, Pistachio, or Rocky Road: ", "Invalid response. Only 'Chocolate', 'Vanilla', Strawberry, 'Pistachio, and 'Rocky Road' are acceptable answers.",options2);
	        System.out.printf("You chose: %s\n\n", choice);

	        //Get a 'Y' or 'N' from the user
	        String[] options3 = {"Y","y","N","n"};	        
	        playAgain = getValidString(sIn, "Would you like to play again? (Y/N): ", "Invalid response.  Please answer with a 'Y' or 'N'", options3);	
	    }while(playAgain.equalsIgnoreCase("Y"));

	}//end of method main()

	
	/**getValidInt method validates user input is an Integer within range and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If range is empty, range is ignored and only validates input is an integer.
	 * If range is not empty, validates user input is an integer within range.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static int getValidInt(Scanner sIn, String question, String warning, int[] range){
		
		String input;
		int num;
		boolean valid = false;
		
		//start of do-while
		do {
			System.out.print(question);
			input = sIn.nextLine();
			
			try {
			num = Integer.parseInt(input);
			
			if (range.length == 0 || (num >= range [0] && num <= range [1])) {
				return num;
				
			}else if (num >= 3 && num <= 18) {
				return num;
				
			}else{
				System.out.print(warning);
				valid = false;
				
			}//end of if statements
			
		} catch (Exception e) {
			System.out.println(warning);
			valid = false;
		}//end of try-catch block
		
		} while (!valid);//end of do-while
		
		return 0;

	}//end of method getValidInt(Scanner, String, String, int[])
		
	
	/**getValidDouble method validates user input is a double within range and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If range is empty, range is ignored and only validates input is an double.
	 * If range is not empty, validates user input is a double within range.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static double getValidDouble(Scanner sIn, String question, String warning, double[] range){
		String input;
		double num;
		boolean valid = false;
		
		do {

		System.out.print(question);
		input = sIn.nextLine();
		
		try {
			num = Double.parseDouble(input);
			
			if (range.length == 0 || (num >= range[0] && num <= range[1])) {
				return num;
				
			}else if (num >= 7.5 && num <= 15.5) {
				return num;
				
			}else {
				System.out.println(warning);
				valid = false;
				
			}//end of if statement
			
		} catch (Exception e) {
			System.out.println(warning);
			
		}//end of try/catch 
		
		} while (!valid);
		
		
		return 0;

	}//end of method getValidDouble(Scanner, String, String, double[])		
	
	
	/**getValidString method validates user input is within list of choices and returns it back to the calling method.
	 * Uses sIn to get user input from the console.
	 * Asks user question.
	 * If choices is empty, returns input.
	 * If choices is not empty, validates user input is within choices.
	 * If user input is not valid, prints warning and repeats question.
	 * Returns validated input.
	 */
	public static String getValidString(Scanner sIn, String question, String warning, String[] choices){
		String input;
		boolean valid = false;
		
		do {
			System.out.print(question);
			input = sIn.nextLine();
			
			if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("b") || input.equalsIgnoreCase("c")) {
				return input;
			} //end of if statement
			
			if (input.equalsIgnoreCase("Chocolate") || input.equalsIgnoreCase("Vanilla") || input.equalsIgnoreCase("Strawberry") || input.equalsIgnoreCase("Pistachio") || input.equalsIgnoreCase("Rocky Road")) {
				return input;
			}//end of if statement
			
			if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Y")) {
				return input;
				
			} else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("N")) {
				return input;
				
			}else {
				System.out.println(warning);
			}//end of if statement
			
		} while (!valid);
		
		return warning;

	}// end of method getValidString(Scanner, String, String, String[])
	
}//end of class Lab9iStartCode
