//Exercício 026 - Udemy - Fixação

import java.util.Scanner;

public class Ex026{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int Higher = 0;
		while (num <= 0){
			System.out.println("Invalid Number! Try again.");
			num = sc.nextInt();
			if (num > 0) {
				for(int i = 0; i < num; i++) {
					int value = sc.nextInt();
					if (value > Higher) {
						Higher = value;
					}	
				}
				System.out.print("Higher = " + Higher);	
				sc.close();
			}
		}
			
	}
}