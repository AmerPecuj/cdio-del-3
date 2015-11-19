package game;

import java.util.*;
import desktop_resources.GUI;
import fields.*;
import spillere.*;

public class GameController {
	// Variable
	GameBoard board;
	PlayerFactory pf;
	CarFactory cf;
	
	Spiller[] spillere;
	
	// Constructor	
	public GameController() {
		board = new GameBoard();
		board.createBoard();
		
		pf = new PlayerFactory();
		cf = new CarFactory();
	}
	
	// Metoder
	// run();
	public void run() {
		spillere = pf.opretSpillere();
		cf.addCarsToGUI(spillere);
	}
}