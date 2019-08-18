package compras;

import java.util.Locale;
import java.util.Scanner;

import prodCompra.ProdutoCompra;

public class Compras {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many products are purchased? ");
		int n = sc.nextInt();
		
		ProdutoCompra[] vect = new ProdutoCompra[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProdutoCompra(name, price);
		}
		
		double Total = 0.0;
		for (int i = 0; i < n; i++) {
			Total += vect[i].getPrice();		
		}
		
		double avg = Total / n;
		
		System.out.printf("AVERAGE PRICE: %.2f", avg);
		
		sc.close();
		
		
	}
	

}
