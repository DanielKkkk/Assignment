package MineSweeping;

import java.util.Random;


public class Methods {
	private static Grid[][] grid = new Grid[10][10];
	private  static int numOfBomb = 10;
	public static void main(String[] args) {
		creat();
		setBomb();
		show();
	}
	//Initializes a two-dimensional array
	public static void creat() {
	for(int i = 0;i < grid.length;i++) {
		for(int j = 0;j < grid[i].length;j++) {
			grid[i][j] = new Grid();
			grid[i][j].setContent(' ');
			grid[i][j].setState(false);
		}
	}
	}

	//Display game board
	public static void show() {
		System.out.println("x/y 0  1  2  3  4  5  6  7  8  9");
		for(int i=0;i<grid.length;i++) {
			System.out.print(i+" ");
			for(int j=0;j<grid[i].length;j++) {
				grid[i][j].setState(true);
				if(grid[i][j].isState()) {
//					System.out.print(grid[i][j].getContent()+" ");
					System.out.printf("  %s",grid[i][j].getContent());
				}else {
				System.out.print(" []");
				}
			}
			System.out.println();
		}
	}
	//Random bomb placement
	public static void setBomb(){
		while(numOfBomb > 0){
			Random ran = new Random();
			int x = ran.nextInt(10);
			int y = ran.nextInt(10);
			if(grid[x][y].getContent() != '*'){
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

