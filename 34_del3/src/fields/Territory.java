package fields;

import desktop_resources.GUI;
import spillere.*;

public class Territory extends Ownable {
	// Variable
	protected int leje;
	
	// Constructor
	public Territory(String name, int leje, int pris) {
		this.name = name;
		this.leje = leje;
		this.pris = pris;
	}
	
	// getLeje();
	@Override
	public int getLeje() {
		return leje;
	}
	
	@Override
	public void koebFelt(Spiller spiller) {
		if (GUI.getUserLeftButtonPressed("Dette felt har ingen ejer! Oensker du at koebe dette felt for " + getPris() + "?",
				"Ja",
				"Nej")) {
			if (spiller.getBalance() >= getPris()) {
				setEjer(spiller);
				spiller.addBalance(-getPris());
				GUI.showMessage("Du er nu retmaessig ejer af feltet!");
			}
		}
	}
}
