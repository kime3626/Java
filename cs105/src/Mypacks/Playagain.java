package Mypacks;

import java.util.Scanner;

public class Playagain {
	
	public static void main(String[] args) {
		String input;
		boolean playagain = false, primary = false;
		Scanner in = new Scanner(System.in);
		
		// start of playagain
					do {
						System.out.print("Would you like to play again? (Y/N): ");
						input = in.nextLine();

						if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("y")) {
							playagain = true;
							primary = false;
							System.out.println("");

						} else if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("n")) {
							playagain = true;
							primary = true;
						} else {
							System.out.println("Invalid response: Please answer with a 'Y' or 'N'.\n");
							playagain = false;
						} // end of if-statement

					} while (!playagain);// end of playagain loop

	}//end of main

}//end of playagain
