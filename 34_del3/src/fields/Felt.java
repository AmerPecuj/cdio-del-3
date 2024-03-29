package fields;

import spillere.*;

public abstract class Felt {
	// Variable
	protected String name;
	protected String text;
	
	// Constructor
	public Felt() {}
	
	// Metoder test
	// getter-metoder
	public String getName() {
		return name;
	}
	
	// setter-metoder
	public void setName(String name) {
		this.name = name;
	}
	
	// Abstrakte metoder
	// landOnField();
	public abstract void landOnField(Spiller spiller);
	
	// getText();
	public abstract String getText();
}