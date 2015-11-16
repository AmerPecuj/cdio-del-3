package fields;

import spillere.*;

public abstract class Felt {
	// Variable
	protected String name;
	
	// Constructor
	public Felt() {}
	
	// Metoder
	// getter-metoder
	public String getName() {
		return name;
	}
	
	// setter-metoder
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void landOnField(Spiller spiller);
}