package fields;

import spillere.*;

public class Territory extends Ownable {
	// Variable
	int leje;
	
	// Constructor
	public Territory(int pris, Spiller ejer, int leje) {
		super(pris, ejer);
		super.setLeje(leje);
	}
	
	// Metoder
	
}
