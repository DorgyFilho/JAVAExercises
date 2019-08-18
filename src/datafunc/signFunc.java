package datafunc;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;
import java.util.List;

import signup.cadFunc;


public class signFunc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<cadFunc> cadastro = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int qty = sc.nextInt();
		
		//1 - Employee register
		for (int i = 0; i < qty; i++) {
			System.out.println();
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.println();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			cadastro.add(new cadFunc(id, name, salary));
			
		}
		//2 . Increase Salary!
		System.out.println();
		System.out.print("Enter the id: ");
		int Id = sc.nextInt();
		cadFunc cad = cadastro.stream().filter(k -> k.getId() == Id).findFirst().orElse(null);
		
		if (cad != null) {
			System.out.println();
			System.out.print("Enter the percentual: ");
			double perc = sc.nextDouble();
			cad.incSalary(perc);
		}
		else {
			System.out.println("This id is not available.");
		}
		
		//3 - List of Employees
		System.out.println("List of Employees");
		System.out.println("======================================");
		for (cadFunc employee : cadastro) {
			System.out.println(employee);
		}
		
		sc.close();

	}

}
