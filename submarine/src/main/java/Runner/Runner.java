package Runner;

import SubGame.SubGame;
import Input.*;

public class Runner {

	public static void main(String[] args) {
		SubGame game = new SubGame();
		game.start();		
		Input.scanner.close();	
	}

}
