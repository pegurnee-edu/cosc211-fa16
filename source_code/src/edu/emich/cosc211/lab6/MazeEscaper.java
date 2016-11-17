package edu.emich.cosc211.lab6;

public class MazeEscaper {
	private Maze maze;

	public MazeEscaper(Maze maze) {
		this.maze = maze;
	}
	
	public void solve() {
		int[] startPoints = this.maze.getStart();
		
		this.escape(startPoints[0], startPoints[1]);
	}
	
	private boolean escape(int x, int y) {
		char room = this.maze.getRoom(x, y);
		
		//TODO: check if location is available
		//TODO: solve maze for orthogonal positions
		
		return false;
	}
	
	public void printMaze() {
		System.out.println(this.maze.view());
	}
}
