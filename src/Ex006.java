//Exercício 006 - Udemy - Figuras Geométricas

import java.util.Locale;
import java.util.Scanner;

public class Ex006{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double pi = 3.14159;
		double AreaTriRet = (A*C)/2.0;
		double AreaCirculo = (C*C)*pi;
		double AreaTrapezio = ((A+B)*C)/2.0;
		double AreaQuadrado = (B*B);
		double AreaRetangulo = (A*B);
		
		System.out.printf("TRIANGULO = %.3f%n", AreaTriRet);
		System.out.printf("CIRCULO = %.3f%n", AreaCirculo);
		System.out.printf("TRAPEZIO = %.3f%n", AreaTrapezio);
		System.out.printf("QUADRADO = %.3f%n", AreaQuadrado);
		System.out.printf("RETANGULO = %.3f", AreaRetangulo);
		
		sc.close();
				
	}
}