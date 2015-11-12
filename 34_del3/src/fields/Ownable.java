package fields;

import spillere.*;

public class Ownable extends Field {
	// Variable
	int pris;
	int leje;
	
	// Constructor
	public Ownable(int pris, Spiller ejer) {
		super(ejer);
		this.pris = pris;
	}
	
	// Metoder
	
	// Setter-metoder
	public void setPris(int pris) {
		this.pris = pris;
	}
	
	public void setLeje(int leje) {
		this.leje = leje;
	}
	
	// Getter-metoder
	public int getPris() {
		return pris;
	}
	
	public int getLeje() {
		return leje;
	}
}
