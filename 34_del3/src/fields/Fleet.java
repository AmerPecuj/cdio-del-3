package fields;

import spillere.*;

public class Fleet extends Ownable {
	// Variable
	final int LEJE1 = 500;
	final int LEJE2 = 1000;
	final int LEJE3 = 2000;
	final int LEJE4 = 4000;
	
	// Constructor
	public Fleet(int pris, Spiller ejer, int leje) {
		
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
}
