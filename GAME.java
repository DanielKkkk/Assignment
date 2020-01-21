package yangZhang1904077;
import java.util.*;

public class GAME {

	private static Grid[][] grid = new Grid[10][10];
	private  static int numOfBomb = 10;

	
	//player is success or not
	public static boolean isSuccess() {
		int count=0;
		for(int j=0;j<grid[0].length;j++)
		{
			for(int i=0;i<grid.length;i++)
			{
				if(grid[i][j].equals(" ")) {//???遍历棋盘
					count++;
				}
			}
			
		}
		return count==grid.length*grid[0].length;//true is success
	}
	
	//isBomb or not
	public static boolean isBomb(int inputx,int inputy) {
		boolean result=false;
		for(int j=0;j<grid[0].length;j++)
		{
			for(int i=0;i<grid.length;i++)
			{
				if(grid[inputx][inputy].equals('*'))
				{
					result=true;
					break;	
				}
				
			}	
		}
		return result;//true is bomb
		
	}
	
	public static boolean isGameOver(boolean isBombFlag,boolean isSuccessFlag) {
		if(isBombFlag==true||isSuccessFlag==true) 
		{
			return true;
		}
		else {
			return false;//true is game over
		}
	} //游戏结束后需要显示雷的位置
	
	
	


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

