package fields;

import spillere.Spiller;

public class Refuge extends Felt {
	// Variable
	protected int bonus;
	
	// Constructor
	public Refuge(String name, int bonus) {
		this.name = name;
		this.bonus = bonus;
	}
	
	// Metoder
	// getter-metoder
	/**
	 * @return the bonus
	 */
	public int getBonus() {
		return bonus;
	}
	
	/**
	 * getText();
	 */
	@Override
	public String getText() {
		return "Gevinst: " + getBonus();
	}
	
	// setter-metoder
	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	// landOnField();
	@Override
	public void landOnField(Spiller spiller) {
		spiller.addBalance(bonus);
	}
}