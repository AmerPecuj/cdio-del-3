package fields;

import desktop_resources.GUI;
import spillere.Spiller;

public class Tax extends Field {
	// Variable
	protected int basisLeje;

	// Constructor
	public Tax(String name, int basisLeje) {
		this.name = name;
		this.basisLeje = basisLeje;
	}

	// Metoder
	
	public void setBasisLeje(int n) {
		basisLeje = n;
	}
	
	public int getBasisLeje() {
		return basisLeje;
	}
	
	// landOnField();
	@Override
	public void landOnField(Spiller spiller) {
		if (GUI.getUserLeftButtonPressed("Oensker du at betale " + getBasisLeje() + " eller 10% af din pengebeholdning?",
				getBasisLeje() + "",
				"10% af pengebeholdning")) {
			spiller.addBalance(-getBasisLeje());
		} else {
			spiller.addBalance(- (int) (spiller.getBalance() / 100 * 10));
		}
	}
}
