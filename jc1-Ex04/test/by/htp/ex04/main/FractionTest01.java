package by.htp.ex04.main;

import org.junit.Assert;
import org.junit.Test;

import by.htp.ex04.entity.Fraction;
import by.htp.ex04.logic.FractionLogic;

public class FractionTest01 {

	@Test
	public void tstFr01() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);

		Fraction f3 = new FractionLogic().sum(f1, f2);

		new FractionLogic().reduction(f3);

		Assert.assertEquals(new Fraction(5, 4), f3);
		
	}
	
}
