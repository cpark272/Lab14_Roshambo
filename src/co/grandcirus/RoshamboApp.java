package co.grandcirus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Initialize variables
		String userName = null;
		String userOpponent = null;
		String userRoshambo = null;
		String userProgram = "y";
		
		
		// Title of program
		System.out.println("Welcome to Rock Paper Scissors!");
		
		// User enters their name
		System.out.print("Enter your name: ");
		userName = scan.next();
		
		// User decides on computer opponent
		System.out.print("Would you like to play against The Rocks or The Scramblers (r/s)?: ");
		userOpponent = scan.next();
		
		while (userProgram.equalsIgnoreCase("y")) {
			// User decides which Roshambo to use
			System.out.print("Rock, paper, or scissors? (R/P/S): ");
			userRoshambo = scan.next();
			
			// Results of the game
			System.out.println(userName + ": " + userRoshambo);
			System.out.println(userOpponent + ": "); // Need to set up Roshambo output for the opponents
			System.out.println(Roshambo.ROCK);
			
			// Asks user to continue or end program
			System.out.print("\nPlay again? (y/n): ");
			userProgram = scan.next();
			System.out.println("");
		}
		
		// Closes the Scanner
		scan.close();

	}

}
