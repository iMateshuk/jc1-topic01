package by.htp.ex03.start;

import java.util.Random;

import by.htp.ex03.logic.MultiArrayLogic;
import by.htp.ex03.presentation.MultiArrayPrint;

//Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		
		int n = 5;

		int[][] mas = new MultiArrayLogic().masGenerator(new int[n][n], random);
		
		int sum = new MultiArrayLogic().sumModules(mas);
		
		new MultiArrayPrint().print(mas, sum);

	}

}
