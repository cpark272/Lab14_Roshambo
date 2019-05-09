package co.grandcirus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Initialize variables
		String userName = null;
		String userOpponent = null;
		String userRoshambo = null;
		String opponentName = null;
		String gameResult = null;
		Roshambo userMove = null;
		Roshambo opponentMove = null;
		String userProgram = "y";

		
		// Title of program
		System.out.println("Welcome to Rock Paper Scissors!");
		
		// User enters their name
//		System.out.print("Enter your name: ");
//		userName = scan.next();
		userName = Validator.getString(scan, "Enter your name: ");
		
		// New object called human
		Player human = new User();
		human.setName(userName);
		
		// User decides on computer opponent
//		System.out.print("Would you like to play against Only Rocks or Crazy Scramblers (O/C)?: ");
//		userOpponent = scan.next();
		userOpponent = Validator.getStringMatchingRegex(scan, "Would you like to play against Only Rocks or Crazy Scramblers (O/C)?: ", "[cCoO]");
		
		
		// New object called opponent
		Player opponent = new User();
		
		// Initializes Only Rocks opponent
		if (userOpponent.equalsIgnoreCase("O")) {
			opponent = new Rocks();
			opponentName = "Only Rocks";

		} else {
			// Initializes Crazy Scramblers opponent
			opponent = new Scramblers();
			opponentName = "Crazy Scramblers";
		}
		
		//System.out.println(opponent);
		
		while (userProgram.equalsIgnoreCase("y")) {
			
			// User decides which Roshambo to use
//			System.out.print("Rock, paper, or scissors? (R/P/S): ");
//			userRoshambo = scan.next();
			userRoshambo = Validator.getStringMatchingRegex(scan, "Rock, paper, or scissors? (R/P/S): ", "[rRpPsS]");

			
			User p = (User)human;
			p.setUserRoshambo(userRoshambo);
			userMove = human.generateRoshambo();
			//System.out.println(p.getUserRoshambo());		
			System.out.println("\n" + userName + ": " + userMove);

			opponentMove = opponent.generateRoshambo();
			System.out.println(opponentName + ": " + opponentMove);
			//System.out.println(opponent.generateRoshambo());
			
			// Processes the game and outputs the results for all combinations
			if (userMove == Roshambo.ROCK && opponentMove == Roshambo.ROCK) {
				gameResult = "Draw!";
			
			} else if (userMove == Roshambo.ROCK && opponentMove == Roshambo.PAPER) {
				gameResult = opponentName + " wins!";
			
			} else if (userMove == Roshambo.ROCK && opponentMove == Roshambo.SCISSORS) {
				gameResult = userName + " wins!";
			
			} else if (userMove == Roshambo.PAPER && opponentMove == Roshambo.ROCK) {
				gameResult = userName + " wins!";
			
			} else if (userMove == Roshambo.PAPER && opponentMove == Roshambo.PAPER) {
				gameResult = "Draw!";
				
			} else if (userMove == Roshambo.PAPER && opponentMove == Roshambo.SCISSORS) {
				gameResult = opponentName + " wins!";
				
			} else if (userMove == Roshambo.SCISSORS && opponentMove == Roshambo.ROCK) {
				gameResult = opponentName + " wins!";
			
			} else if (userMove == Roshambo.SCISSORS && opponentMove == Roshambo.PAPER) {
				gameResult = userName + " wins!";
				
			} else if (userMove == Roshambo.SCISSORS && opponentMove == Roshambo.SCISSORS) {
				gameResult = "Draw!";
			}
			
			// Results of the game			
			System.out.println(gameResult);
			
			// Asks user to continue or end program
//			System.out.print("\nPlay again? (y/n): ");
//			userProgram = scan.next();
			userProgram = Validator.getStringMatchingRegex(scan, "\nPlay again? (y/n): ", "[yYnN]");
			System.out.println("");
		}
		
		// Closes the Scanner
		scan.close();

	}

}
