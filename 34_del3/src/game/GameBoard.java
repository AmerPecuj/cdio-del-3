package game;

import java.util.*;

//import desktop_fields.*;
import desktop_resources.GUI;
import fields.*;

public class GameBoard {
	// Variable
	
	/*
	 * FELTER
	 * Array indeholdende Felt-objekter
	 */
	private Felt[] felter =
		{
				new Territory("Tribe Encampment", 	100, 	1000),
				new Territory("Crater",			  	300, 	1500),
				new Territory("Mountain",			500,	2000),
				new Territory("Cold Desert",		700,	3000),
				new Territory("The Werewall",	   1300,	4300),
				new Territory("Black Cave",		   1000,	4000),
				new Territory("Mountain Village",  1600,	4750),
				new Territory("South Citadel",	   2000,	5000),
				new Territory("Palace Gates",	   2600,	5500),
				new Territory("Tower",			   3200,	6000),
				new Territory("Castle",			   4000,	8000),
				new Refuge("Walled City", 					5000),
				new Refuge("Monastery", 					 500),
				new LaborCamp("Huts in the Mountain"   			),
				new LaborCamp("The Pit"							),
				// Denne traekker ogsaa 10% fra efter brugerens eget valg
				// Husk kravspec
				new Tax("Goldmine",							2000),
				new Tax("Caravan",							4000),
				new Fleet("Second Sail"							),
				new Fleet("Sea Grover"							),
				new Fleet("The Buccaneers"						),
				new Fleet("Privateer Armada"					)
		};
	
	// Constructor
	public GameBoard() {}
	
	// Metoder
	public void createGameBoard() {
//		Field[] guiFelter = new Field[11];
	}
}