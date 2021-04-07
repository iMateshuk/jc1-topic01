package by.htp.ex03.logic;

import java.util.Random;

public class MultiArrayLogic {

	public int sumModules(int[][] mas) {
		int sum = 0;

		for (int i = 1; i < mas.length; i = i + 2) {// i = 0; i < mas.length; i++
			for (int j = 1; j < mas[i].length; j = j + 2) { // j = 0; j < mas[i].length; j++
				if (mas[i][j] < 0 && mas[i][j] % 2 != 0) {
					sum = sum + Math.abs(mas[i][j]);
				}
			}
		}

		return sum;
	}

	public int[][] masGenerator(int[][] massive, Random random) {

		int diff = massive.length * 2;

		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive.length; j++) {
				massive[i][j] = random.nextInt(diff + 1) - massive.length;
			}
		}

		return massive;

	}

}
