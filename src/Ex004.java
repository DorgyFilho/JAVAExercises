//Exercicio 004 - Udemy - Salário

import java.util.Locale;
import java.util.Scanner;

public class Ex004{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFunc = sc.nextInt();
		int hours = sc.nextInt();
		double salaryPerHour = sc.nextDouble();
		
		double Salary = salaryPerHour*hours;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f", Salary);
		
		sc.close();
	}
}