package yangZhang1904077;
import java.util.*;

public class Method {

	private static Grid[][] grid = new Grid[10][10];
	private  static int numOfBomb = 10;

	public void startjudge() {
		while (true) {
		   Show();//��ʾ����
		   System.out.print("�������� C����ѡ���У�M������� :");
		   Scanner san = new Scanner(System.in);
		   CMUtility std = new CMUtility();//����
		   char command = std.readChar();
		   if (command == 'C') {
			   System.out.print("Select the Row:");
			   int x = std.readInt();
			   System.out.print("Select the Column:");
			   int y = std.readInt();
			   boolean flag =;//��־�Ƿ�ȵ���
			   if (!flag) {
				 
				   Show();//������ʾ����
				   System.out.println("Game Over");
				   break;
			   }
		   } else if (command == 'M') {
		   System.out.print("Select the Row:");
		   }
		}
	}
	
	//��ʾδ�����ӵ�����
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

