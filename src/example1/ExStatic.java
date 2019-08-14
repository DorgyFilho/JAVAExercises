//1° Versão;

package example1;

import java.util.Locale;
import java.util.Scanner;

import utilitary.Calculator;

public class ExStatic {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circunference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi: %.2f%n", Calculator.Pi);	
		
		sc.close();
	}

}
