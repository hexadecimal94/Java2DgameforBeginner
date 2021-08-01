package dev.codenmore.tileGame;

import dev.codenmore.tileGame.display.Display;

public class Launcher {
	
	public static void main(String[] args) {
		Game game = new Game("Title Game!", 800, 800);
		game.start();
	}

}
