package fields;

import spillere.*;

public class Field {
	// Variable
	Spiller ejer;
	
	// Constructor
	public Field() {
		
	}
	
	public Field(Spiller ejer) {
		this.ejer = ejer;
	}
	
	// Metoder
	public void landOnField(Spiller spiller) {
		if (spiller.equals(this.ejer)) {
			
		}
	}
}