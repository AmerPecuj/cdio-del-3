package game;

import fields.*;
import spillere.*;

public class MainScript {
	public static void main(String[] args) {
		Territory field = new Territory(2000);
		Spiller spiller1 = new Spiller();
		Spiller spiller2 = new Spiller();
		
		field.landOnField(spiller1);
		
	}
}
