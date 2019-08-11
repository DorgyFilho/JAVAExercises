//Exercício 025 - Udemy - Potenciação em Fila

import java.util.Scanner;

public class Ex025{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			int prim = i;
			int seg = i*i;
			int ter = i*i*i;
			System.out.printf("%d %d %d%n", prim, seg, ter);
		}
		sc.close();
	}
}