package edu.emich.cosc211.lab6;

import java.io.FileNotFoundException;

public class MazeFinderDriver {

	public static void main(String[] args) {
		Maze theMaze = null;
		
		try {
			theMaze = MazeLoader.load();
		} catch (FileNotFoundException e) {
			System.err.println("Invalid filename");
			System.exit(1);
		}
		
		MazeEscaper mazeEscaper = new MazeEscaper(theMaze);
		mazeEscaper.solve();
		mazeEscaper.printMaze();
	}

}
