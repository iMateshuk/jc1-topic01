package by.htp.ex02.presentation;

public class OneArrayPrint {
	
	public void print(int sum, int k, int[] massive) {
		System.out.println("Сумма элементов массива, кратная " + k + ": " + sum);
		
		for (int i = 0; i < massive.length; i++) {
			System.out.print(i + "-[" + massive[i] + "]; ");
		}
		
	}

}
