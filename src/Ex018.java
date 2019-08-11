//Exercicio 018 - Udemy - Preferência de Combustível

import java.util.Scanner;

public class Ex018{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		int Alcool = 0;
		int Diesel = 0;
		int Gasolina = 0;
		
		while (op != 4) {
			if (op == 1) {
				Alcool += 1;
			}
			else if (op == 2) {
				Gasolina += 1;
			}
			else if (op == 3) {
				Diesel += 1;
			}
			op = sc.nextInt();				
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		sc.close();
		
		
	}
}