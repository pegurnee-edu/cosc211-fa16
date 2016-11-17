package edu.emich.cosc211.lab1;

/**
 * This class is a handler for high scores of players. The number of players is
 * limited to ten. Players can be added, removed, and all information can be
 * displayed.
 * 
 * @author eddie gurnee
 *
 */
public class HighScoreHandler {
	private final static int PLAYER_LIMIT = 10;

	private Player[] players;
	private int pointer;

	public HighScoreHandler() {
		this.players = new Player[PLAYER_LIMIT];

		for (int i = 0; i < players.length; i++) {
			this.players[i] = new Player();
		}

		this.pointer = 0;
	}

	/**
	 * Adds a new player to the high score handler. Only adds them in sequential
	 * order.
	 * 
	 * @param newPlayer
	 *            the player to be handled by the handler
	 * @return true if the player was able to be added, false if there is no
	 *         space
	 */
	public boolean addPlayer(Player newPlayer) {

		if (this.pointer == this.players.length) {
			return false;
		} else {
			this.players[this.pointer] = newPlayer;
			this.pointer += 1;

			return true;
		}
	}

	public void removePlayer(String playerName) {
		
	}

	public void displayAll() {

	}

	public void displayScore(String playerName) {

	}
}
