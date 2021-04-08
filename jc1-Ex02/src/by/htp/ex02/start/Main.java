package by.htp.ex02.start;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import by.htp.ex02.logic.OneArrayLogic;
import by.htp.ex02.presentation.OneArrayPrint;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Main {

	public static void main(String[] args) {

		Random random = new Random();

		int k = 5;
		int second = new GregorianCalendar().get(Calendar.SECOND);
		int[] massive = new OneArrayLogic().masGenerator(new int[random.nextInt(second) + 1], random);

		int sum = new OneArrayLogic().sumEllements(k, massive);

		new OneArrayPrint().print(sum, k, massive);

	}

}
