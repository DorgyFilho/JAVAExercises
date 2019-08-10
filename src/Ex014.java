//Exercício 014 - Udemy - Pontos

import java.util.Scanner;
import java.util.Locale;

public class Ex014{
	public static void main(String[] args) {
		System.out.print("Pontos a e b: ");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		if (a > 0.0 && b > 0.0) {
			System.out.println("Q1");
		}
		else if (a < 0.0 && b > 0.0) {
			System.out.println("Q2");	
		}
		else if (a < 0.0 && b < 0.0) {
			System.out.println("Q3");
		}
		else if (a > 0.0 && b < 0.0) {
			System.out.println("Q4");			
		}
		else if (a == 0.0 && b == 0.0) {
			System.out.println("Origem");
		}
	}
}
