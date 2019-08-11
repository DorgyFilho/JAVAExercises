//Exercício 021 - Udemy - Média Ponderada

import java.util.Scanner;
import java.util.Locale;

public class Ex021{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pA = 2;
		int pB = 3;
		int pC = 5;
		double media = 0;
		
		for(int i = 0; i < num; i++) {
			double a = sc.nextFloat();
			double b = sc.nextFloat();
			double c = sc.nextFloat();
			media = (a*pA + b*pB + c*pC)/10.0;	
			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}
}