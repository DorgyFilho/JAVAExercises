//Exercício 022 - Udemy - Divisão

import java.util.Scanner;
import java.util.Locale;

public class Ex022{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double result = 0.0;
		
		for(int i = 0; i < num; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if (b == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				result = a/b;
				System.out.println(result);
			}
			
		}
		sc.close();
	}
}