package fields;

import spillere.*;
//import desktop_resources.*;

public abstract class Ownable extends Field {
	// Variable
	protected int pris;
	protected Spiller ejer;
	
	// Constructor
	public Ownable() {}
	
	/*
	 * METODER
	 */
	
	/*
	 * Getter-metoder
	 */
	
	// getPris(); - returnerer feltets pris
	public int getPris() {
		return pris;
	}
	
	public Spiller getEjer() {
		return ejer;
	}
	
	// getLeje(); - abstrakt metode
	public abstract int getLeje();
	
	/*
	 * Setter-metoder
	 */
	
	// saet Ejer
	public void setEjer(Spiller spiller) {
		this.ejer = spiller;
	}
	
	/*
	 * Oevrig metodik
	 */
	
	// koebFelt();
	public abstract void koebFelt(Spiller spiller);
	
	/*
	 * landOnField();
	 * Ens defineret for alle Ownable subtypes - derfor laegges den ind her
	 */
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