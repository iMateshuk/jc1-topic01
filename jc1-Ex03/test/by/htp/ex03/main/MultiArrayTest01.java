package by.htp.ex03.main;

import org.junit.Assert;
import org.junit.Test;

import by.htp.ex03.logic.MultiArrayLogic;

public class MultiArrayTest01 {

	@Test
	public void tstMultiArray01() {
		// int n = 5;

		int[][] mas = new int[][] { 
			{ -4, 5, 6, 4, 8 }, 
			{ -6, 2, 5, 0, -2 }, 
			{ -5, 1, -1, 6, 1 }, 
			{ 4, -9, -4, 1, -10 },
			{ 3, -7, -7, 10, -8 } 
		};

		Assert.assertEquals(9, new MultiArrayLogic().sumModules(mas));
	}

}
