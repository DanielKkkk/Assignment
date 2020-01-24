package wangzhe.teamproject;
import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {
	CMUtility cmu=new CMUtility();
	
	//The test pass
	@Test
	public void testreadMenuSelection(){
		char expected='1';
		char result=cmu.readMenuSelection();
		assertSame(expected,result);
	}
	
	
	@Test
	public void testreadChar(){
		char expected='M';
		char result=cmu.readChar();
		assertSame(expected,result);
	}
	
	@Test
	public void testreadInt(){
		int expected=2;
		int result=cmu.readInt();
		assertSame(expected,result);
	}
	
	@Test
	public void testreadConfirmSelection(){
		char expected='Y';
		char result=cmu.readConfirmSelection();
		assertSame(expected,result);
	}
	
	



}
