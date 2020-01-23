package yaochuanliang;

public class game {
	 
	 private static Grid[][] grid = new Grid[10][10];
	 private  static int numOfBomb = 10;

	 public static void produceDigital() {
		 for (int i = 0; i < grid.length; i++) {
			 for (int j = 0; j < grid[i].length; j++) {
		      // Ê¹ÓÃasciÂë
				 int z = 48;
				 if (grid[i][j].getContent() != '*') {
					 for (int x = i - 1; x < i + 2; x++) {
						 for (int y = j - 1; y < j + 2; y++) {
							 if (x >= 0 && x < 9 && y >= 0 && y < 9 && grid[x][y].getContent() == '*') {
								 z++;
							 }
						 }
					 }
					 if (z == 48) {
						 grid[i][j].setContent(' ');
					 } else {
						 grid[i][j].setContent((char) z);
					 }
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
