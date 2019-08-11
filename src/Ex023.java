//Exercício 023 - Udemy - Fatorial

import java.util.Scanner;

public class Ex023{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fat = 1;
		
		while (num > 0) {
			fat *= num;
			num -= 1;
		}
		System.out.println(fat);
		sc.close();
	}
}