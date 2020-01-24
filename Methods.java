package wangzhe.teamproject;

import java.util.Random;
import java.util.Scanner;

//calculate the number of unopened boxes
public class Methods {
		static Grid[][] grid = new Grid[10][10];
		static int numOfBomb = 10;
		static Scanner stdin = new Scanner(System.in);
}

//Mark the grid in the corresponding position 
//but there are some problem need to be solved.
public void Mark(int x, int y) {
	grid[x][y].setMark(" ? ");
}

public static void init() {
	Creat();
	SetBomb();
	produceDigital();
}

public static void Creat() {
	for (int i = 0; i < grid.length; i++) {
		for (int j = 0; j < grid[i].length; j++) {
			grid[i][j] = new Grid();
			grid[i][j].setMark("[ ]");
			grid[i][j].setContent(' ');
			grid[i][j].setState(false);
		}
	}
}

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

public static void produceDigital() {
	for (int i = 0; i < grid.length; i++) {
		for (int j = 0; j < grid[i].length; j++) {
			// 使用asci码
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



//The show method is improved. When a grid is marked, 
//a question mark will be displayed on the corresponding grid of the console 
public static void Show() {
	System.out.println("x/y0  1  2  3  4  5  6  7  8  9");
	for (int i = 0; i < grid.length; i++) {
		System.out.print(i + " ");
		for (int j = 0; j < grid[i].length; j++) {
			// Test bomb
			// grid[i][j].setState(true);
			if (grid[i][j].isState()) {
				// System.out.print(grid[i][j].getContent()+" ");
				System.out.printf(" %s ", grid[i][j].getContent());
			} else {
				if (grid[i][j].getMark().equals(" ? "))
					System.out.printf("%s", grid[i][j].getMark());
				else
					System.out.print("[ ]");
				// System.out.print(grid[i][j].getMark());
			}
		}
		System.out.println();
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
