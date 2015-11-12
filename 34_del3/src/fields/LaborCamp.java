package fields;

import spillere.*;
import game.*;

public class LaborCamp extends Ownable {
	// Variable
	int basisLeje = 100;

	// Constructor
	public LaborCamp(int pris, Spiller ejer, int basisLeje) {
	}

	// Metoder
	// getLeje();
	@Override
	public int getLeje() {
		// Betal 100*(terningernes sum)*(antal labor camps ejet af ejeren)
		return basisLeje*Terninger.getSum()*ejer.getLaborCampsEjet();
	}

	// landOnField();
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