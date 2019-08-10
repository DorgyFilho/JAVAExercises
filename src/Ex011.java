//Exercicio 011 - Udemy - Hora do Jogo

import java.util.Scanner;

public class Ex011{
	public static void main(String[] args) {
		System.out.print("HORA INICIAL E HORA FINAL: ");
		Scanner sc = new Scanner(System.in);
		int hIni = sc.nextInt();
		int hFim = sc.nextInt();
		int Duracao;
		
		if (hIni < hFim) {
			Duracao = hFim - hIni;
			System.out.println("O JOGO DUROU " + Duracao + " HORA(S)");		
		}
		else {
			Duracao = 24 - hIni + hFim;
			System.out.println("O JOGO DUROU " + Duracao + " HORA(S)");
		}
		sc.close();
	}
}