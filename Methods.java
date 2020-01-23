package MineSweeping;

import java.util.Random;
import java.util.Scanner;


public class Methods {
	static Grid[][] grid = new Grid[10][10];
	static int numOfBomb = 10;
	static Scanner stdin = new Scanner(System.in);

	//Initializes a two-dimensional array
	public static void Creat() {
	for(int i = 0;i < grid.length;i++) {
		for(int j = 0;j < grid[i].length;j++) {
			grid[i][j] = new Grid();
			grid[i][j].setMark(" []");
			grid[i][j].setContent(' ');
			grid[i][j].setState(false);
		}
	}
	}

	//Display game board
	public static void Show() {
		System.out.println("x/y 0  1  2  3  4  5  6  7  8  9");
		for(int i=0;i<grid.length;i++) {
			System.out.print(i+" ");
			for(int j=0;j<grid[i].length;j++) {
				//Test bomb
//				grid[i][j].setState(true);
				if(grid[i][j].isState()) {
//					System.out.print(grid[i][j].getContent()+" ");
					System.out.printf("  %s",grid[i][j].getContent());
				}else {
//				System.out.print(" []");
					System.out.print(grid[i][j].getMark());
				}
			}
			System.out.println();
		}
	}
	//Random bomb placement
	public static void SetBomb(){
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
	
	//Open the box
	public static boolean Click(int x,int y){
		if(grid[x][y].isState()){
//			System.out.println("This box has been opened, please select another box");
			return true;
		}else{
			//If it's a bomb.Game over
			if(grid[x][y].getContent()=='*'){
				//If it's a bomb.Game over
				Show();
				return false;
			}else {
			    if(grid[x][y].getContent()==' '){
			        /*
			           If it's a blank space
			           Continue judging until the space is surrounded by Numbers or bombs
			        */
			    	grid[x][y].setState(true);
			    	clickBlank(x, y);
			    	return true;
			    }else {
				//If it's a number	
					grid[x][y].setState(true);
					return true;
				}
			}		
		}
	}

	

	/*Click on the blank grid after the extension process
	If the current cell is blank, go ahead and determine if there is white space above, below, right or left, and call the click method back
	*/
	public static void clickBlank(int x,int y){
		if(x-1 > -1 && x-1 < 10 && grid[x-1][y].getContent() != '*'){
			Click(x-1,y);
		}
		if(x+1 > -1 && x+1 < 10 && grid[x+1][y].getContent() != '*') {
			Click(x+1,y);
		}
		if(y-1 > -1 && y-1 < 10 && grid[x][y-1].getContent() != '*') {
			Click(x,y-1);
		}
		if(y+1 > -1 && y+1 < 10 && grid[x][y+1].getContent() != '*') {
			Click(x,y+1);
		}
	}
}
 
class Grid{
	//Use as an instance model for each square
	private char content;
	private boolean state;//It describes the state of the square
	private String mark;//
	public char getContent() {
		return content;
	}
	public void setContent(char content){
		this.content = content;
	}
	public boolean isState(){
		return state;
	}
	public void setState(boolean state){
		this.state = state;
	}

	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
}
