package game;

import java.util.*;

import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;
import fields.*;

public class GameBoard {
	// Variable
	Field[] guiFelter;
	
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
	
	// getFelter();
	public Felt[] getFelter() {
		return felter;
	}
	
	// createBoard(); - skab brættet
	public void createBoard() {
		GUI.create(fieldFactory());
	}
	
	// Metoder
	// fieldFactory() - private, da den kun bruges internt i klassen
	private Field[] fieldFactory() {
		Field[] guiFelter = new Field[felter.length];
		
		for (int i = 0; i < guiFelter.length; i++) {
			guiFelter[i] = new Street.Builder()
					.setTitle(felter[i].getName())
					.setSubText(felter[i].getText())
					.build();
		}
		
		return guiFelter;
	}
	
	
}