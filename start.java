package yaochuanliang;

import yaochuanliang.game.Grid;

public class start {
	
		 
	private static Grid[][] grid = new Grid[10][10];
	private  static int numOfBomb = 10;
	
	public class Game {
		 public void start() {
		  
		  Methods meth = new Methods();
		  
		  CMUtility std = new CMUtility();
		  char choice = 0;
		  boolean flag1=true;
		  while (flag1) {
			  meth.init();
			  System.out.println("Welcome to minesweeper :0- Exit,1- Start");
			  System.out.print("Please Select：");
			  choice = std.readMenuSelection();
			  if (choice == '0') {
				  System.out.print("确认是否删除(Y/N)：");
				  int choice1 = std.readConfirmSelection();
		  
				  if (choice1 == 'Y') {
				    	System.out.println("已退出");
				    	flag1=false;
				    }
				    if (choice1 == 'N') {
				    }
			    
			    
				  } else if (choice == '1') {
					  meth.startjudge();
					  return;
	
				  } else {
					  System.out.println("error!");
				  }
		  	 }
		 }

		 public static void main(String[] args) {
		  new Game().start();

		 }
		 
		 public void Mark(int x, int y) {
				grid[x][y].setMark(" ? ");
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


