//Exercício - Matriz

import java.util.Scanner;

public class Matrix2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lines Columns: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Choose a number: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == num) {
					System.out.println("Position " + i + ", " + j + ':');
					if (j - 1 >= 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (j + 1 < matriz[i].length) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i - 1 >= 0) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
					if (i + 1 < matriz.length) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
				}
			}
		}
		
		sc.close();
		
	}
}