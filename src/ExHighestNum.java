//Exemplos = Maior Número.

import java.util.Scanner;

public class ExHighestNum{
	public static void main(String[] args) {
		System.out.println("Three Numbers: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int Highest = max(x,y,z);
		
		showResult(Highest);
		
		
/*		if (a >= b && a >= c && a >= Highest) {
			Highest = a;
		}
		else if (b >= a && b >= c && b >= Highest) {
			Highest = b;
		}
		else if (c >= a && c >= b && c >= Highest) {
			Highest = c;
		} 
		System.out.println("Highest = " + Highest); 
*/
		
		sc.close();
	}
	public static int max(int a, int b, int c) {
		int aux = 0;
		if (a >= b && a >= c && a >= aux) {
			aux = a;
		}
		else if (b >= a && b >= c && b >= aux) {
			aux = b;
		}
		else if (c >= a && c >= b && c >= aux) {
			aux = c;
		}
		return aux;
		
	}
	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}
	
}	