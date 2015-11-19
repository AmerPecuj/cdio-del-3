package game;

import java.awt.Color;
import java.util.ArrayList;

import desktop_resources.GUI;
import spillere.*;

public class PlayerFactory {
	// variable
	
	/**
	 * opretSpillere()
	 * @return spillere Array af spillerobjekter
	 */
	public Spiller[] opretSpillere() {
		ArrayList<String> spillerNavne = getSpillerNavne();
		Spiller[] spillere = new Spiller[spillerNavne.size()];
		
		for (int i = 0; i < spillere.length; i++) {
			spillere[i] = new Spiller(spillerNavne.get(i));
		}
		return spillere;
	}
	
	/**
	 * getSpillerNavne()
	 * @return spillerNavne ArrayList<String> med alle indtastede spillernavne
	 */
	
	private ArrayList<String> getSpillerNavne() {
		ArrayList<String> spillerNavne = new ArrayList<String>(0);
		String spillerNavn;
		
		for (int i = 0; i < 6; i++) {
			// Spillerens navn. Hvis det allerede er indtastet, spoerges igen.
			do {
				spillerNavn = GUI.getUserString("Hvad skal spiller " + (i + 1) + " hedde?");
			} while (spillerNavne.contains(spillerNavn)); // Hvis der ikke er indtastet et navn, brydes loekken.
			
			if (spillerNavn.isEmpty()) {
				break;
			} else {
				spillerNavne.add(spillerNavn);
			}
		}
		
		return spillerNavne;
	}
}
