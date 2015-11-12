package fields;

import spillere.Spiller;

public class LaborCamp extends Ownable {
	// Variable
	int basisLeje;

	// Constructor
	public LaborCamp(int pris, Spiller ejer, int basisLeje) {
		super(pris, ejer);
		super.setLeje(basisLeje);
	}

	// Metoder
	
}