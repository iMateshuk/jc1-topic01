package by.htp.ex01.start;

import by.htp.ex01.logic.AlgorithmLogic;
import by.htp.ex01.presentation.AlgorithmView;
// a(��2)-(b-c)(��2)+ln(b(��2)+1) = ?
public class Main {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		
		AlgorithmLogic logic = new AlgorithmLogic();
		AlgorithmView view = new AlgorithmView();

		double result  = logic.action(a, b, c);

		view.print(result);

	}

}
