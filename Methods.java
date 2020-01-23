package wangzhe.teamproject;

import java.util.Scanner;
//calculate the number of unopened boxes
public class Methods {
		static Grid[][] grid = new Grid[10][10];
		static int numOfBomb = 10;
		static Scanner stdin = new Scanner(System.in);
	public int UnOpened() {
		int box = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j].isState() == false) {
					box++;
				}
			}
			
		}
		return box;
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
