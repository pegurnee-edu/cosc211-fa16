package edu.emich.cosc211.lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeLoader {
	private static final String DEFAULT_MAZE = "maze1";

	public static Maze load() throws FileNotFoundException {
		return load(DEFAULT_MAZE);
	}

	public static Maze load(String filename) throws FileNotFoundException {
		Scanner input = new Scanner(new FileInputStream(filename));

		int rows = input.nextInt();
		int cols = input.nextInt();
		char[][] mazeVal = new char[rows][cols];

		for (int r = 0; r < mazeVal.length; r++) {
			for (int c = 0; c < mazeVal[r].length; c++) {
				char nextItem = input.next().charAt(0);

				mazeVal[r][c] = nextItem;
			}
		}

		input.close();

		return new Maze(mazeVal);
	}
}
