package yangZhang1904077;

import yangZhang1904077.GAME.Grid;

public class Mark {
	
	private static Grid[][] grid = new Grid[10][10];
	private  static int numOfBomb = 10;

	
	
	
	//将一个盒子做标记
	public static void mark(int x,int y) {
		System.out.println("x/y 0  1  2  3  4  5  6  7  8 ");
		for(int i=0;i<grid.length;i++) {
			System.out.print(i+" ");
			for(int j=0;j<grid[i].length;j++) {
				if(!grid[x][y].isState()) {
					 if(i==x&&j==y) {
						 System.out.print(" ?");
					 }else {
						 System.out.print(" []");
					 }	
				}
					
			}
			System.out.println();
		}
	}
	
	//取消标记
	public static void unMark(int x, int y) {
		System.out.println("x/y 0  1  2  3  4  5  6  7  8 ");
		for(int i=0;i<grid.length;i++) {
			System.out.print(i+" ");
			for(int j=0;j<grid[i].length;j++) {
				if(!grid[x][y].isState()) {
					 if(i==x&&j==y) {
						 System.out.print(" []");
					 }else {
						 System.out.print(" []");
					 }	
				}
				
			}
			System.out.println();
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

