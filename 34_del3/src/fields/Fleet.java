package fields;

import spillere.Spiller;

public class Fleet extends Ownable {
	// Variable
	final int LEJE1 = 500;
	final int LEJE2 = 1000;
	final int LEJE3 = 2000;
	final int LEJE4 = 4000;

	// Constructor
	public Fleet(int pris, Spiller ejer, int leje) {
		super(pris, ejer);
	}

	// Metoder
	public void setLeje() {
		// Set leje ud fra antal arvede felter
	}
	
}
