package co.grandcirus;

public class Rocks extends Player {

	@Override
	public Roshambo generateRoshambo() {
		
		Roshambo alwaysRock = Roshambo.ROCK;
		
		return alwaysRock;
	}

}
