//Exercicio Matriz

import java.util.Scanner;

public class Matrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho da matriz: ");
		int n = sc.nextInt();
		
		int [][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Main Diagonal");
		System.out.println("=======================");
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");			
		}
		System.out.println();
		
		int negative = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0){
					negative++;
				}
			}
		}
		
		System.out.print("NEGATIVE NUMBERS = " + negative);
		
		sc.close();
	}
}