package by.htp.ex02.main;

import org.junit.Assert;
import org.junit.Test;

import by.htp.ex02.logic.OneArrayLogic;

public class OneArrayTest01 {
	
	@Test
	public void tstOneArray01() {
		
		int k = 2;
		int[] massive = new int[] {2, 3, 5, 6, 8, 10, 12, 22, 18};
		
		Assert.assertEquals(78, new OneArrayLogic().sumEllements(k, massive));
		
	}

}
