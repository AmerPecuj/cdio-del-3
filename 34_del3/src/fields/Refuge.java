package fields;

import spillere.Spiller;

public class Refuge extends Field {
	// Variable
	protected int bonus;
	
	// Constructor

	public Refuge(int bonus) {
		this.bonus = bonus;
	}

	// Metoder
	// landOnField();
	@Override
	public void landOnField(Spiller spiller) {
		spiller.addBalance(bonus);
	}
}