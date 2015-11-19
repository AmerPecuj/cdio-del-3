package game;

import desktop_resources.GUI;

public class GameController {
	// Variable
	GameBoard board = new GameBoard();
	
	// Constructor	
	public GameController() {}
	
	// Metoder
	// run();
	public void run() {
		board.createBoard();
		
		String str = GUI.getUserString("Skriv dit navn");
		System.out.println(str);
	}
}