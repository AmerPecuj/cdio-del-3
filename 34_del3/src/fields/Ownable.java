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
	// getPris(); - returnerer feltets pris
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
	
	// landOnField();
	// Ens defineret for alle Ownable subtypes - derfor laegges den ind her
	@Override
	public void landOnField(Spiller spiller) {
		if (ejer != null) {
			if (!spiller.equals(ejer)) {
				spiller.overfoerPenge(getLeje(), ejer);
			}
		} else {
			koebFelt(spiller);
		}
	}
}
