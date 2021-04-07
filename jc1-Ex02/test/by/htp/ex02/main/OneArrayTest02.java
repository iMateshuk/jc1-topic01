package by.htp.ex02.main;

import org.junit.Assert;
import org.junit.Test;

import by.htp.ex02.logic.OneArrayLogic;

public class OneArrayTest02 {
	
	@Test
	public void tstOneArray02() {
		
		int k = 5;
		int[] massive = new int[] {2, 3, 5, 6, 8, 10, 12, 20, 18};
		
		Assert.assertEquals(35, new OneArrayLogic().sumEllements(k, massive));
		
	}

}
