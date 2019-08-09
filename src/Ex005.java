//Exercício 005 - Udemy - Compras

import java.util.Locale;
import java.util.Scanner;

public class Ex005{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String Cod = sc.next();
		int Qty = sc.nextInt();
		double Price = sc.nextDouble();
		
		double subTotal1 = Qty * Price;
		
		String Cod2 = sc.next();
		int Qty2 = sc.nextInt();
		double Price2 = sc.nextDouble();
		
		double subTotal2 = Qty2 * Price2;
		
		double Total = subTotal1 + subTotal2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", Total);
		
		sc.close();
		
	}
}

