package co.grandcirus;

public class User extends Player {
	
	private String userRoshambo;

	public String getUserRoshambo() {
		return userRoshambo;
	}

	public void setUserRoshambo(String userRoshambo) {
		this.userRoshambo = userRoshambo;
	}

	public Roshambo generateRoshambo() {
		
		Roshambo userMove = null;
		
		// Outputs the correct string for the three Roshambo types for User
		if (userRoshambo.equalsIgnoreCase("R")) {
			userMove = Roshambo.ROCK;
			
		} else if (userRoshambo.equalsIgnoreCase("P")) {
			userMove = Roshambo.PAPER;
			
		} else if (userRoshambo.equalsIgnoreCase("S")) {
			userMove = Roshambo.SCISSORS;
			
		} else {
			System.out.println("Error, please enter the correct input.");
		}
		
		return userMove;
	}

//	@Override
//	public Roshambo generateRoshambo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}
