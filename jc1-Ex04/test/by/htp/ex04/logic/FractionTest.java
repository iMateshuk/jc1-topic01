package by.htp.ex04.logic;

import org.junit.Assert;
import org.junit.Test;

import by.htp.ex04.entity.Fraction;

public class FractionTest {
	@Test
	public void tstFr01() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		
		FractionLogic logic =  new FractionLogic();

		Fraction result = logic.sum(f1, f2);
		logic.reduction(result);
		
		Fraction expected = new Fraction(5, 4);

		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void tstFr02() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		
		FractionLogic logic =  new FractionLogic();

		Fraction result = logic.division(f1, f2);
		logic.reduction(result);
		
		Fraction expected = new Fraction(2, 3);

		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void tstFr03() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		
		FractionLogic logic =  new FractionLogic();

		Fraction result = logic.substract(f1, f2);
		logic.reduction(result);
		
		Fraction expected = new Fraction(-1, 4);

		Assert.assertEquals(expected, result);
		
	}
	
	@Test
	public void tstFr04() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);
		
		FractionLogic logic =  new FractionLogic();

		Fraction result = logic.multiplication(f1, f2);
		logic.reduction(result);
		
		Fraction expected = new Fraction(3, 8);

		Assert.assertEquals(expected, result);
		
	}

}
