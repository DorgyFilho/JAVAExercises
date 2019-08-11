//Exercicio 020 - Udemy - Dentro ou Fora do Intervalo

import java.util.Scanner;

public class Ex020{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int in = 0;
		int out = 0;
		int Start = 10;
		int Ending = 20;
		
		for (int i = 0; i < num; i++) {
			int k = sc.nextInt();
			if (k >= Start && k <= Ending) {
				in += 1;
			}
			else {
				out += 1;
			}
		}	
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
		
	}
}