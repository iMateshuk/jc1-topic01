package by.htp.ex01.main;

import org.junit.Assert;
import org.junit.Test;

import by.htp.ex01.logic.AlgorithmLogic;

public class AlgorithmTest01 {
	
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

}
