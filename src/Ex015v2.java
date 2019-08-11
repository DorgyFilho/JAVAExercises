//Exercício 015 V2 - Udemy - Imposto de Renda

import java.util.Scanner;
import java.util.Locale;

public class Ex015v2{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double Salary = sc.nextDouble();
		double imposto = 0.0;
		
		if (Salary <= 2000.00) {
			imposto = 0.0;
		}
		else if (Salary > 2000.00 && Salary <= 3000.00) {
			imposto = ((Salary - 2000)*0.08);
		}
		else if (Salary > 3000.00 && Salary <= 4500.00) {
			imposto = ((Salary - 3000)*0.18) + (1000*0.08);
		}
		else if (Salary > 4500.00) {
			imposto = ((Salary - 4500.00)*0.28) + (1500.00*0.18) + (1000.00*0.08);
		}
		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f", imposto);
		}
		sc.close();
	}
}