package by.htp.ex01.logic;

import java.util.Scanner;

public class AlgorithmLogic {

	public double action(int a, int b, int c) {

		if (a == 0) {
			a = setInt("a");
		}
		
		if (b == 0) {
			b = setInt("b");
		}
		
		if (c == 0) {
			c = setInt("c");
		}
		
		return (Math.pow(a, 2)-Math.pow(b-c, 2)+ Math.log(Math.pow(b,2)+1));

	}

	private int setInt(String strVar) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String dispLine = "Введите " + strVar + ":";
		int retInt = 0;

		System.out.println(dispLine);

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Нет, нужно целое число. " + dispLine);
		}
		retInt = sc.nextInt();
		sc.nextLine();

		return retInt;

	}

}
