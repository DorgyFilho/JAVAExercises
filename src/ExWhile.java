//Exemplo - Udemy - While

import java.util.Scanner;
import java.util.Locale;

public class ExWhile{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = sc.nextDouble();
		
		while (num >= 0.0) {
			double square = Math.sqrt(num);
			System.out.printf("Value: %.3f%n", square);
			System.out.print("Another number: ");
			num = sc.nextDouble();
		}
		System.out.println("Negative number!");
		sc.close();
	}
}