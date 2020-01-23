package yangZhang1904077;

import java.util.Random;

import yangZhang1904077.GAME.Grid;

public class setBomb {

	private static Grid[][] grid = new Grid[10][10];
	private  static int numOfBomb = 10;

	public static void SetBomb() {
		  while (numOfBomb > 0) {
		   Random ran = new Random();
		   int x = ran.nextInt(10);
		   int y = ran.nextInt(10);
		   if (grid[x][y].getContent() != '*') {
		    grid[x][y].setContent('*');
		    numOfBomb--;
		   }
		  }
		 }
}



class Grid {
	//Use as an instance model for each square
	private char content;
	private boolean state;//It describes the state of the square
	public char getContent() {
		return content;
	}
	public void setContent(char content) {
		this.content = content;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
}
}
