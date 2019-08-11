//Exercicio 019 - Udemy - Mostrar Impares

import java.util.Scanner;

public class Ex019{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}