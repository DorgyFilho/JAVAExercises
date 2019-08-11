//EXercício 017 - Udemy - Coordenadas

import java.util.Scanner;

public class Ex017{
	public static void main(String[] args) {
		System.out.print("a b: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while (a != 0 || b != 0) {
			if (a > 0 && b > 0) {
				System.out.println("primeiro");
			}
			else if (a < 0 && b > 0) {
				System.out.println("segundo");
			}
			else if (a < 0 && b < 0) {
				System.out.println("terceiro");
			}
			else if (a > 0 && b < 0) {
				System.out.println("quarto");
			}
			else if (a == 0 || b == 0) {
				break;	
			}
			System.out.print("a b: ");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		sc.close();
	}
}