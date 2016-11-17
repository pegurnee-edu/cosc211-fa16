package edu.emich.cosc211.lab1;

import java.util.Scanner;

/**
 * This class is simply the driver class to simulate the handling of high
 * scores.
 * 
 * @author eddie gurnee
 *
 */
public class UseHighScoreHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		HighScoreHandler hsh = new HighScoreHandler();
		// all of our menu stuff

		int command;
		do {
			System.out.println("Enter command:");
			// inform user of all the options
			command = keyboard.nextInt();
			switch (command) {
			case 1:
				// adding
				break;
			case 2:
				// removing
				break;
			case 3:
				// display specific
				break;
			case 4:
				// display all
				break;
			}
		} while (command != 0);
	}

}
