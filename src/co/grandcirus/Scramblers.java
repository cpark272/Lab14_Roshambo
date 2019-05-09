package co.grandcirus;

import java.util.Random;

public class Scramblers extends Player {
	
	Roshambo roshambo;
		
	@Override
	public Roshambo generateRoshambo() {

		int x;
		x = 3;
		
		// Random number generator
		Random randNum = new Random();
		
		int y = randNum.nextInt(x);

		if (y == 0) {
			return Roshambo.ROCK;

		} else if (y == 1) {
			return Roshambo.PAPER;

		} else if (y == 2) {
			return Roshambo.SCISSORS;
			
		} else {
			return null;
		}
	}

//	public static int randomNumber() {
//	
//	// Random number generator
//	Random randNum = new Random();
//	
//	randNum.nextInt(3);
//	
//	if (x = 0) {
//		return Roshambo.ROCK;
//
//	} else if (x = 1) {
//		return Roshambo.PAPER;
//
//	} else if (x = 2) {
//		return Roshambo.SCISSORS;
//	}
//	
//}

//private 
	
	
	
	
//	// Getter for name Scramblers
//	public String getName() {
//		
//		return "Scramblers";
//		
//	}

}
