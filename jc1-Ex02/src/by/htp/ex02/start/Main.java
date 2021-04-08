package by.htp.ex02.start;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import by.htp.ex02.logic.OneArrayLogic;
import by.htp.ex02.presentation.OneArrayPrint;

// � ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.
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
