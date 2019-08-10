//Exercício 007 - Udemy - Maior Número

import java.util.Scanner;

public class Ex007{
	public static void main(String[] args) {
		System.out.print("Numbers: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3= sc.nextInt();
		
		int Higher = 0;
		
		if (n1 >= n2 && n1 >= n3 && n1 >= Higher) {
			Higher = n1;
			
		}
		else if (n2 >= n1 && n2 >= n3 && n2 >= Higher) {
			Higher = n2;
		
		}
		else if (n3 >= n1 && n3 >= n2 && n3 >= Higher) {
			Higher = n3;
		}
		
		System.out.println("Higher = " + Higher);
		
		sc.close();
		
		
		
	}
}