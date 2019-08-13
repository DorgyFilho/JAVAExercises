package pack;

import java.util.Scanner;

import constructor.Employee;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Taxes: ");
		employee.taxes = sc.nextDouble();
		
		System.out.print("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percIncrease = sc.nextDouble();
		employee.incSalary(percIncrease);
		
		System.out.print("Updated data: " + employee);
		
		sc.close();		
		
	}
	

}
