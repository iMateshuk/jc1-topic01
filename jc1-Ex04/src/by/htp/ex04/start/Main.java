package by.htp.ex04.start;

import by.htp.ex04.entity.Fraction;
import by.htp.ex04.logic.FractionLogic;
import by.htp.ex04.presentation.FractionView;

public class Main {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);

		Fraction f3;

		FractionLogic logic = new FractionLogic();
		FractionView view = new FractionView();
		
		f3 = logic.sum(f1, f2);
		logic.reduction(f3);
		view.printSum(f1, f2, f3);

		f3 = logic.division(f1, f2);
		logic.reduction(f3);
		view.printDivision(f1, f2, f3);

		f3 = logic.substract(f1, f2);
		logic.reduction(f3);
		view.printSubstract(f1, f2, f3);

		f3 = logic.multiplication(f1, f2);
		logic.reduction(f3);
		view.printMultiplication(f1, f2, f3);

	}

}
