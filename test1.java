package yangZhang1904077;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	
	 public void UnOpenedTest(){
	  meth.Creat();
	  meth.Show();
	  assertEquals(100, meth.UnOpened());
	 }
}
