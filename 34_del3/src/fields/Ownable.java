package fields;

import spillere.*;
import desktop_resources.*;

public abstract class Ownable extends Field {
	// Variable
	int pris;
	Spiller ejer;
	
	// Constructor
	public Ownable() {}
	
	// Metoder
	// getter-metoder
	public int getPris() {
		return this.pris;
	}
	// getLeje(); - abstrakt metode
	public abstract int getLeje();
	
	// koebFelt();
	public void koebFelt(Spiller spiller) {
		if (GUI.getUserLeftButtonPressed("Dette felt har ingen ejer! Oensker du at koebe dette felt for " + getPris() + "?",
				"Ja",
				"Nej")) {
			if (spiller.getBalance() >= getPris()) {
				this.ejer = spiller;
				spiller.addBalance(-getPris());
				GUI.showMessage("Du er nu retmaessig ejer af feltet!");
			}
		}
	}
}
