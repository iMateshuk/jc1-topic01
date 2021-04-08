package by.htp.ex01.logic;

import org.junit.Assert;
import org.junit.Test;

public class AlgorithmTest {
	@Test
	public void tstAlg01() {
		int a = 1;
		int b = 2;
		int c = 3;
		double expected = 1.60943791;
		
		AlgorithmLogic logic = new AlgorithmLogic();

		double result = logic.action(a, b, c);
		
		Assert.assertEquals(expected, result, 0.00000001);
		
	}
	
	@Test
	public void tstAlg02() {
		int a = 1;
		int b = 1;
		int c = 3;
		double expected = -2.30685281;
		
		AlgorithmLogic logic = new AlgorithmLogic();

		double result = logic.action(a, b, c);
		
		Assert.assertEquals(expected, result, 0.00000001);
		
	}

}
