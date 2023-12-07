package s20_Interface;

public class GameRunner {

	public static void main(String[] args) {

		// Eks of Polymorphism

		GamingConsole[] games = { new MarioGame(), new ChessGame() };

		// ArrayList loop
		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}

	}

}
