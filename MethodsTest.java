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
	@Test
	public void UnOpenedTest(){
		Methods meth = new Methods();
		meth.Creat();
		meth.Show();
		assertEquals(100, meth.UnOpened());
	}
	@Test
	public void CancelMarkTest(){
		meth.Creat();
		meth.Show();
		meth.Mark(2, 2);
		String exp = " []";
		String res = grid[2][2].getMark();
		assertEquals(exp, res);
	}
	@Test
	public void MarkTest(){
		meth.Creat();
		meth.Show();
		meth.Mark(1, 1);
		String exp = "  ?";
		assertEquals(exp, grid[1][1].getMark());
	}


}
