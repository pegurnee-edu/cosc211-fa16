package edu.emich.cosc211.lab1;

/**
 * This player class contains all information associated with a player, namely
 * high score and name.
 * 
 * @author eddie gurnee
 *
 */
public class Player {
	private String name;
	private int score;
	
	public Player() {
		this.name = "Eddie";
		this.score = 9001;
	}
	
	@Override
	public boolean equals(Object otherPlayer) {
		return false;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.score;
	}
	public static void main(String[] args) {
		System.out.println(new Player());
	}
}
