//Exercicio 002 - Udemy - Área do Círculo

import java.util.Locale;
import java.util.Scanner;

public class Ex002{
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double result = pi*(raio*raio);
		
		System.out.printf("A=%.4f",result);
		
		sc.close();
	}
}