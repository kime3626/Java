package week02;

import java.util.Scanner;

public class Lab2a {

	public static void main(String[] args) {
		// Using Scanner for getting Input from user
		Scanner in = new Scanner(System.in);

		// Ask the user's name
		System.out.printf("Please enter your name:");
		String name = in.nextLine();
		System.out.println("\nHello " + name + "!\n");

		// Ask the user's age
		System.out.printf("Please enter your age:");
		name = in.nextLine();
		System.out.println("\nWow,your " + name + " years old!\n");

		// Ask the user's where they are from
		System.out.printf("Where are you from?\n");
		name = in.nextLine();
		System.out.println("\nYou are from " + name + ".\n");

		// Ask the user's number of family members
		System.out.println("How many members does your family have?");
		name = in.nextLine();
		System.out.println("\nYou have " + name + " members in your family.\n");

		// Ask the user's favorite ice cream flavor
		System.out.println("What is your favourite flavour of ice cream?");
		name = in.nextLine();
		System.out.println("\nYou like " + name + "!!! Letssss goooo! I knew you had a good taste.\n");

		System.out.println("GOODBYE.");

	}

}
