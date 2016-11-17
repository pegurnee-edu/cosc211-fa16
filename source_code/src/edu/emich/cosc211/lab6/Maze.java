package edu.emich.cosc211.lab6;

public class Maze {
	private char[][] maze;

	public Maze(char[][] mazeVal) {
		this.maze = mazeVal;
	}

	public char getRoom(int r, int c) {
		char returnVal;
		try {
			returnVal = this.maze[r][c];
		} catch (ArrayIndexOutOfBoundsException e) {
			returnVal = 'N';
		}
		return returnVal;
	}

	public int[] getStart() {
		int[] toReturn = {-1, -1};
		
		for (int r = 0; r < maze.length; r++) {
			for (int c = 0; c < maze[r].length; c++) {
				if ('S' == maze[r][c]) {
					toReturn[0] = r;
					toReturn[1] = c;
				}
			}
		}
		
		return toReturn;
	}

	public String view() {
		String toReturn = "";
		
		for (int r = 0; r < maze.length; r++) {
			toReturn += "|";
			for (int c = 0; c < maze[c].length; c++) {
				char roomItem = maze[r][c];
				char room;
				switch (roomItem) {
				case 'V':
					room = '-';
					break;
				case 'W':
					room = '#';
					break;
				case 'E':
					room = '<';
					break;
				case 'S':
					room = '>';
					break;
				case '0':
				default:
					room = ' ';
					break;
				}
				
				toReturn += " " + room + " |";
			}
			toReturn += "\n";
		}
		
		return toReturn;
	}
	
	public void visit(int r, int c) {
		this.maze[r][c] = 'V';
	}
}
