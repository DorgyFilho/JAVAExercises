//Exercício 08 - Udemy - Negativo ou Não-Negativo?

import java.util.Scanner;

public class Ex008{
	public static void main(String[] args) {
		System.out.print("Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 0){
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();	
	}
}