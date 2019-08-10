//Exercício 012 - Udemy - Lanchonete

import java.util.Scanner;
import java.util.Locale;

public class Ex012{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.print("CÓDIGO DO LANCHE E A QUANTIDADE: ");
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt();
		int Qty = sc.nextInt();
		double Total = 0;
		
		if (cod == 1) {
			Total = 4.00*Qty;			
					
		}
		else if (cod == 2) {
			Total = 4.50*Qty;
			
		}
		else if (cod == 3) {
			Total = 5.00*Qty;
					
		}
		else if (cod == 4) {
			Total = 2.00*Qty;
			
		}
		else if (cod == 5) {
			Total = 1.50*Qty;
		}
		sc.close();
		System.out.printf("Total: R$ %.2f", Total);
		
	}
}