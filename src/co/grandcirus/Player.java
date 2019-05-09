package co.grandcirus;

public abstract class Player {
	private String name;
	
	
	public abstract Roshambo generateRoshambo();

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	public Roshambo generateRoshambo(String userRoshambo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
