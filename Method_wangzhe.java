package wangzhe.teamproject;

public class Method_wangzhe {

		private static Grid[][] grid = new Grid[10][10];
		private static int numOfBomb = 10;
		
		/**
		 * 炸弹安放好后进行每一个点的周围炸弹数记录，NumberofBomb是每个不是炸弹的点的四周炸弹个数
		 */
		public void GetNumber() {
			int[][] offset = { { -1, -1 }, { 0, -1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, 1 }, { -1, 1 }, { -1, 0 } };
			int bombCount = 0;
			for (int i = 0; i < grid.length; ++i) {
				for (int j = 0; j < grid[i].length; ++j) {
					// 如果是炸弹，不写数字上去
					if (grid[i][j].getContent() == '*') {
						continue;
					}
					// 如果不是炸弹，遍历周边的8个方块，标记总数在此方块上
					for (int[] off : offset) {
						int row = i + off[1];
						int col = j + off[0];
						if (verify(row, col) && grid[row][col].getContent() == '*') {
							bombCount++;
						}
					} // 如果炸弹的个数不为0,标注出来
					if (bombCount > 0) {
						grid[i][j].getNumberofBomb(bombCount);
					}
					
				}
			}
		}
	//判断位置是否越界
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

	}

