package by.htp.ex02.logic;

import org.junit.Assert;
import org.junit.Test;

public class OneArrayTest {
	@Test
	public void tstOneArray01() {
		
		int k = 2;
		int[] massive = new int[] {2, 3, 5, 6, 8, 10, 12, 22, 18};
		int expexted = 78;
		int result = new OneArrayLogic().sumEllements(k, massive);
		
		Assert.assertEquals(expexted, result);
		
	}
	
	@Test
	public void tstOneArray02() {
		
		int k = 5;
		int[] massive = new int[] {2, 3, 5, 6, 8, 10, 12, 20, 18};
		int expexted = 35;
		int result = new OneArrayLogic().sumEllements(k, massive);
		
		Assert.assertEquals(expexted, result);
		
	}

}
