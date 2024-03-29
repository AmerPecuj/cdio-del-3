package fields;

import desktop_resources.GUI;
import spillere.Spiller;

public class Tax extends Felt {
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
	
	// getText();
	@Override
	public String getText() {
		return "Straf: " + getBasisLeje() + " eller 10%";
	}
	// landOnField();
	@Override
	public void landOnField(Spiller spiller) {
		if (GUI.getUserLeftButtonPressed("Oensker du at betale " + getBasisLeje() + " eller 10% af din pengebeholdning?",
				getBasisLeje() + "",
				"10% af pengebeholdning")) {
			spiller.withdrawBalance(getBasisLeje());
		} else {
			spiller.withdrawBalance((int) (spiller.getBalance() / 100 * 10));
		}
	}
}
