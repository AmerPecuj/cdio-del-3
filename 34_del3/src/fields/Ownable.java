package fields;

import spillere.*;

public abstract class Ownable extends Field {
	// Variable
	int pris;
	int leje;
	Spiller ejer;
	
	// Constructor
	public Ownable() {}
	
	// Metoder
	// getLeje();
	
	// getLeje() - abstract method
	public abstract int getLeje();
}
