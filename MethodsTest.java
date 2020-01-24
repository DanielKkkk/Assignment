package MineSweeping;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodsTest {
	static Grid[][] grid = new Grid[10][10];
	@Test
	public void ClickTest(){
		Methods meth = new Methods();
		meth.Creat();
		meth.Show();
		assertTrue(meth.Click(0, 0));
	}


}
