package game;

import java.util.*;
import desktop_resources.GUI;
import fields.*;
import spillere.*;

public class GameController {
	// Variable
	GameBoard board;
	PlayerFactory pf;
	CarCreator cf;
	
	Spiller[] spillere;
	
	// Constructor	
	public GameController() {
		board = new GameBoard();
		pf = new PlayerFactory();
		spillere = pf.opretSpillere();
		cf = new CarCreator();
	}
	
	// Metoder
	// run();
	public void run() {
		board.createBoard();
		
	}
}