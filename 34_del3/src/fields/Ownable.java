package fields;

import spillere.*;

public abstract class Ownable extends Field {
	// Variable
	int pris;
	Spiller ejer;
	
	// Constructor
	public Ownable() {}
	
	// Metoder
	
	// getLeje() - abstract method
	public abstract int getLeje();
}
