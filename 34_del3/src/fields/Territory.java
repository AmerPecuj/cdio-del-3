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
}
