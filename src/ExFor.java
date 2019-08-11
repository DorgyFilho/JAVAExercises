//Exemplo For-loop

import java.util.Scanner;

public class ExFor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Max Number: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print("Value number #" + i + ": ");
			int k = sc.nextInt();
			sum += k;			
		}
		System.out.println("Total: " + sum);
		sc.close();
	}
}