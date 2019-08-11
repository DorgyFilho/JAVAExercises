//Exemplo: do-while

import java.util.Scanner;
import java.util.Locale;

public class ExDoWhile{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Enter a number: ");
			double num = sc.nextDouble();
			double sq = Math.sqrt(num);
			System.out.printf("Square root = %.3f%n", sq);
			System.out.print("Repeat? (y/n) ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
		
	}
}