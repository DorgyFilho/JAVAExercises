package mainpack;

import java.util.Scanner;

import convdollar.CalcDollar;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dollar Price: ");
		double priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars do you want? ");
		double buyDollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in BRL = %.2f", CalcDollar.convDollar(priceDollar, buyDollars));
	}
	

}
