//Exemplo Triangulo

import java.util.Scanner;
import java.util.Locale;

public class ExTriangulo{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double xA, xB, xC, yA, yB, yC;
		Scanner sc = new Scanner(System.in);
		System.out.print("Values - Triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.print("Values - Triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA+xB+xC) / 2.0;
		
		double p2 = (yA+yB+yC) / 2.0;
		
		double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
		
		double areaY = Math.sqrt(p2*(p2-yA)*(p2-yB)*(p2-yC));
		
		double Higher = 0.0;
		
		if (areaX > areaY) {
			Higher = areaX;
			System.out.printf("%.2f%n", Higher);
			System.out.printf("X is Higher than Y");
		}
		else if (areaX < areaY) {
			Higher = areaY;
			System.out.printf("%.2f%n", Higher);
			System.out.printf("Y is Higher than X");
		}
		else {
			System.out.println("Areas are equals!");
		}
		sc.close();
	}
}