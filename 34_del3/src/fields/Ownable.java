package fields;

import spillere.*;
//import desktop_resources.*;

public abstract class Ownable extends Felt {
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
	
	
	/*
	 * Setter-metoder
	 */
	public void setPris(int pris) {
		this.pris = pris;
	}
	
	public void setEjer(Spiller spiller) {
		this.ejer = spiller;
	}
	
	public void resetPortefoelje () {
		
		// Skal frigøre spillerens passiver
		
	}
	
	
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
	
	/**
	 * getText();
	 * @return text den subtext, der skal stå på feltet
	 */
	@Override
	public String getText() {
		return "Pris: " + getPris();
	}
	
	/*
	 * Abstrakt metodik
	 */
	
	// getLeje()
	public abstract int getLeje();
	
	// koebFelt()
	public abstract void koebFelt(Spiller spiller);
}