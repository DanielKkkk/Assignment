package wangzhe.teamproject;

public class Method_wangzhe {

		private static Grid[][] grid = new Grid[10][10];
		private static int numOfBomb = 10;
		
		/**
		 * After the bomb is placed, the number of bombs around each point is recorded. 
		 * Numberof bombs is the number of bombs around each point that is not a bomb.
		 */
		public void GetNumber() {
			int[][] offset = { { -1, -1 }, { 0, -1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, 1 }, { -1, 1 }, { -1, 0 } };
			int bombCount = 0;
			for (int i = 0; i < grid.length; ++i) {
				for (int j = 0; j < grid[i].length; ++j) {
					// If it's a bomb, don't put Numbers on it
					if (grid[i][j].getContent() == '*') {
						continue;
					}
					// If it is not a bomb, traverse the 8 squares around it, marking the total on the square
					for (int[] off : offset) {
						int row = i + off[1];
						int col = j + off[0];
						if (verify(row, col) && grid[row][col].getContent() == '*') {
							bombCount++;
						}
					} // If the number of bombs is not zero, label it
					if (bombCount > 0) {
						grid[i][j].getNumberofBomb(bombCount);
					}
					
				}
			}
		}
		
		public int pailei(int x, int y){
			if(this.grid[x][y].getNumberofBomb()==-1){
				blust();
				return -1;//Step on a landmine
			}else if(this.grid[x][y].getNumberofBomb()>0){//There are bombs around.
				this.grid[x][y].setContent((char)(this.grid[x][y].getNumberofBomb()+'0'));
			}
			else//No bombs around.
			{
				this.grid[x][y].setContent(' ');
				int isok=clickBlank(x,y);//Call each other
				if(isok==1 || isok==0)
					return 1;
				
					
					
			}
			show();
			return 1;//No landmines
		}
		
		//If it's blank, it's going to determine if there are Numbers or bombs around, 
		//and if there are, it's going to terminate the call to pailei.
		public int clickBlank(int x,int y) {
			boolean isok=true;
			while(isok)
			{
			int rowofdirection=(int)(Math.random()*4);
			if(rowofdirection == 0)
			if(verify(x-1,y)&&grid[x-1][y].getNumberofBomb()!=-1) {
				int i=pailei(x-1,y);
				if(i==-1 || i==1)
					return 1;
			}
			if(rowofdirection == 1)
			if(verify(x+1,y)&&grid[x+1][y].getNumberofBomb()!=-1) {
				pailei(x+1,y);
				int i=pailei(x+1,y);
				if(i==-1 || i==1)
					return 1;
			}
			if(rowofdirection == 2)
			if(verify(x,y-1)&&grid[x][y-1].getNumberofBomb()!=-1) {
				pailei(x,y-1);
				int i=pailei(x,y-1);
				if(i==-1 || i==1)
					return 1;
			}
			if(rowofdirection == 3)
			if(verify(x,y+1)&&grid[x][y+1].getNumberofBomb()!=-1) {
				pailei(x,y+1);
				int i=pailei(x,y+1);
				if(i==-1 || i==1)
					return 1;
			}
			}
		 return -1;//Out of bounds returns -1
		}
			
	//Determine if the position is out of bounds
		private boolean verify(int row, int col) {

			return row >= 0 && row < this.grid.length && col >= 0 && col < this.grid[1].length;

		}

	}

	class Grid {
		// Use as an instance model for each square
		private char content;
		private boolean state;// It describes the state of the square
		private int row;
		private int column;
		private int NumberofBomb;

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

		public int getRow() {
			return row;
		}

		public void setRow(int row) {
			this.row = row;
		}

		public int getColumn() {
			return column;
		}

		public void setColumn(int column) {
			this.column = column;
		}
		
		public int getNumberofBomb(int number)
		{
			NumberofBomb=number;
			return NumberofBomb;
		}

		public int getNumberofBomb() {
			return NumberofBomb;
		}

		public void setNumberofBomb(int numberofBomb) {
			NumberofBomb = numberofBomb;
		}
		

	}

