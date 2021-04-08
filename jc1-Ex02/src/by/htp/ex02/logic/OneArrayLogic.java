package by.htp.ex02.logic;

import java.util.Random;

public class OneArrayLogic {

	public int sumEllements(int k, int[] massive) {
		int sum = 0;

		for (int i = 0; i < massive.length; i++) {
			if (massive[i] % k == 0) {
				sum = sum + massive[i];
			}
		}

		return sum;
	}

	public int[] masGenerator(int[] massive, Random random) {

		int diff = massive.length * 2;

		for (int i = 0; i < massive.length; i++) {
			massive[i] = random.nextInt(diff + 1);
		}

		return massive;

	}

}
