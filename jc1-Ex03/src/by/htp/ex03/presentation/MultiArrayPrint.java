package by.htp.ex03.presentation;

public class MultiArrayPrint {

	public void print(int[][] mas, int sum) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}


		System.out.println("sum - " + sum);
	}

}
