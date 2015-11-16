package fields;

import spillere.*;

public abstract class Field {
	// Variable
	protected String name;
	
	// Constructor
	public Field() {}
	
	// Metoder
	public abstract void landOnField(Spiller spiller);
}