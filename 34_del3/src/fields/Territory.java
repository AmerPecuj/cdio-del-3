package fields;

import spillere.*;

public class Territory extends Ownable {
	// Variable
	int leje;
	
	// Constructor
	public Territory(int leje) {
		this.leje = leje;
	}
	
	// getLeje();
	@Override
	public int getLeje() {
		return leje;
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
