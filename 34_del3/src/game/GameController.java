package game;

public class GameController {
	// Variable
	GameBoard board = new GameBoard();
	
	// Constructor	
	public GameController() {}
	
	// Metoder
	// run();
	public void run() {
		board.createBoard();
	}
}
