package yangZhang1904077;
import java.util.*;

public class Method {

	private static Grid[][] grid = new Grid[10][10];
	private  static int numOfBomb = 10;

	public void startjudge() {
		  while (true) {
			  Show();
			  System.out.print("请您操作 C代表选行列，M代表标雷 :");
			  Scanner san = new Scanner(System.in);
			  CMUtility std = new CMUtility();
			  char command = std.readChar();
			  if (command == 'C') {
				  System.out.print("Select the Row:");
				  int x = std.readInt();
				  System.out.print("Select the Column:");
				  int y = std.readInt();
				  boolean flag = this.Click(x, y);
				  if (!flag) {
					  ShowAll();
					  Show();
					  System.out.println("Game Over");
					  break;
				  }
			  } else if (command == 'M') {
				  System.out.print("Select the Row:");
				  int x = std.readInt();
				  System.out.print("Select the Column:");
				  int y = std.readInt();
				  this.Mark(x, y);
			  } else
				  System.out.println("error");
			  if (UnOpened() == 10) {
				  ShowAll();
				  Show();
				  System.out.println("Successful");
				  break;
			  }
		  }
	}
	
	//显示未开盒子的数量
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

