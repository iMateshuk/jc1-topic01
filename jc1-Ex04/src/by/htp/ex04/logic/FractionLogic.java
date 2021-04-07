package by.htp.ex04.logic;

import by.htp.ex04.entity.Fraction;

public class FractionLogic {

	public Fraction sum(Fraction f1, Fraction f2) {
		int newNum;
		int newDen;

		newNum = f1.getNumerator() * f2.getDenominator() + f1.getDenominator() * f2.getNumerator();
		newDen = f1.getDenominator() * f2.getDenominator();

		Fraction rezult = new Fraction(newNum, newDen);

		return rezult;
	}

	public Fraction multiplication(Fraction f1, Fraction f2) {

		return new Fraction(f1.getNumerator() * f2.getNumerator(), f1.getDenominator() * f2.getDenominator());

	}

	public Fraction division(Fraction f1, Fraction f2) {

		return new Fraction(f1.getNumerator() * f2.getDenominator(), f1.getDenominator() * f2.getNumerator());

	}

	public Fraction substract(Fraction f1, Fraction f2) {

		return new Fraction(f1.getNumerator() * f2.getDenominator() - f1.getDenominator() * f2.getNumerator(),
				f1.getDenominator() * f2.getDenominator());

	}

	public void reduction(Fraction f) {

		int nod;
		
		if (f.getNumerator() > f.getDenominator()) {
			nod = Math.abs(f.getDenominator());
		} else {
			nod = Math.abs(f.getNumerator());
		}
	
		while (!((f.getNumerator() % nod == 0) && (f.getDenominator() % nod == 0))) {
			nod--;
		}
		
		f.setNumerator(f.getNumerator() / nod);
		f.setDenominator(f.getDenominator() / nod);
	}

}
