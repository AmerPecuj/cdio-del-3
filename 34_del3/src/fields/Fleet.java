package fields;

import desktop_resources.GUI;
import spillere.*;

public class Fleet extends Ownable {
	// Variable
	protected final int LEJE1 =  500;
	protected final int LEJE2 = 1000;
	protected final int LEJE3 = 2000;
	protected final int LEJE4 = 4000;
	
	protected final int PRIS  = 4000;
	
	// Constructor
	public Fleet(String name) {
		this.name = name;
	}
	
	// getLeje();
	@Override
	public int getLeje() {
		if (ejer != null) {
			if (ejer.getFleetsEjet() == 1) {
				return LEJE1;
			} else if (ejer.getFleetsEjet() == 2) {
				return LEJE2;
			} else if (ejer.getFleetsEjet() == 3) {
				return LEJE3;
			} else if (ejer.getFleetsEjet() == 4) {
				return LEJE4;
			}
		}
		return 0;
	}
	
	@Override
	public void koebFelt(Spiller spiller) {
		if (GUI.getUserLeftButtonPressed("Dette felt har ingen ejer! Oensker du at koebe dette felt for " + getPris() + "?",
				"Ja",
				"Nej")) {
			if (spiller.getBalance() >= getPris()) {
				setEjer(spiller);
				spiller.addBalance(-getPris());
				spiller.addFleet(); // Tilfoejer 1 til spillerens fleet-beholdning
				GUI.showMessage("Du er nu retmaessig ejer af feltet!");
			}
		}
	}
}
