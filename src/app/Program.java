package app;

import java.util.Locale;

import java.util.Scanner;

import entity.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		System.out.print("A: ");
		rectangle.a = sc.nextDouble();
		System.out.print("B: ");
		rectangle.b = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", rectangle.Area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.Perimeter());
		System.out.printf("DIAGONAL: %.2f", rectangle.Diagonal());
		
		sc.close();		
		
	}

}
