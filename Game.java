package MineSweeping;

import java.util.Scanner;

public class Game{

	public static void main(String[] args){
		Methods meth = new Methods();
		meth.Creat();
		meth.SetBomb();
//		meth.produceDigital();
		meth.Show();
		
		
		int X,Y;
		Scanner stdin = new Scanner(System.in);
		while(true){
			
			System.out.println("Open grid:F，Mark the grid:M，cancel the mark:C");
			String str = stdin.next();
			if(str.equals("F")){
			System.out.println("请输入X");
			X = stdin.nextInt();
			System.out.println("请输入Y");
			Y = stdin.nextInt();
			boolean flag = meth.Click(X, Y);
			if(!flag){
				meth.ShowAll();
				meth.Show();
				System.out.println("Fail");
				break;
				}
//				
//			if(meth.UnOpened() == 10){
//				meth.ShowAll();
//				meth.Show();
//				System.out.println("successful");
//				break;
//				}
			meth.Show();
			}
			else if(str.equals("M")){
				System.out.println("请输入X");
				X = stdin.nextInt();
				System.out.println("请输入Y");
				Y = stdin.nextInt();
//				meth.Mark(X, Y);
			}
			else if(str.equals("C")){
				System.out.println("请输入X");
				X = stdin.nextInt();
				System.out.println("请输入Y");
				Y = stdin.nextInt();
//				meth.CancelMark(X, Y);
			}
	}
//		switch (str) {
//		case "F":
//			System.out.println("请输入X");
//			X = stdin.nextInt();
//			System.out.println("请输入Y");
//			Y = stdin.nextInt();
//			boolean flag = meth.Click(X, Y);
//			if(!flag) {
//				meth.ShowAll();
//				meth.Show();
//				System.out.println("游戏失败!!!");
//				break;
//				}
//			
//			if(meth.detection() == 10) {
//				meth.ShowAll();
//				meth.Show();
//				System.out.println("游戏成功");
//				break;
//				}
//			meth.Show();
//			break;
//		case "M":
//			System.out.println("请输入X");
//		    X = stdin.nextInt();
//			System.out.println("请输入Y");
//			Y = stdin.nextInt();
//			meth.Mark(X, Y);
//			break;
//		default:
//			break;
//		}
	}

}
