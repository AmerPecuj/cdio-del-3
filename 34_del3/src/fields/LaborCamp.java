package fields;

import spillere.*;
import desktop_resources.GUI;
import game.*;

public class LaborCamp extends Ownable {
	// Variable
	protected int basisLeje = 100;

	// Constructor
	public LaborCamp(String name) {
		this.name = name;
		pris = 2500; // Ens for alle labor camps
	}
	
	// Metoder
	// getLeje();
	@Override
	public int getLeje() {
		// basisLeje*(terningernes sum)*(antal labor camps ejet af ejeren)
		return basisLeje
				*Terninger.getSum()
				*ejer.getLaborCampsEjet();
	}
	
	@Override
	public void koebFelt(Spiller spiller) {
		if (GUI.getUserLeftButtonPressed("Dette felt har ingen ejer! Oensker du at koebe dette felt for " + getPris() + "?",
				"Ja",
				"Nej")) {
			if (spiller.getBalance() >= getPris()) {
				setEjer(spiller);
				spiller.addBalance(-getPris());
				spiller.addLaborCamp(); // Tilfoejer 1 til koeberens LaborCamp-beholdning
				GUI.showMessage("Du er nu retmaessig ejer af feltet!");
			}
		}
	}
}