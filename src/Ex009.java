//Exercício 009 - Udemy - Even(Par) or Odd(Ímpar)?

import java.util.Scanner;

public class Ex009{
	public static void main(String[] args) {
		System.out.print("Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();
	}
}

