package operations;

import java.util.Locale;
import java.util.Scanner;

import account.Account;

public class Operations {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Account Number: ");
		String AccNumber = sc.nextLine();
		System.out.print("Account Holder: ");
		String AccName = sc.nextLine();
		System.out.print("Do you want to do a first deposit? Y/N: ");
		char Answer = sc.next().charAt(0);
		
		double InitialDep = 0;
				
		if (Answer == 'n') {
			InitialDep += 0.01;
		}
		else if (Answer == 'y'){
			System.out.print("Add initial value: ");
			InitialDep += sc.nextDouble();
		}
		
		Account account = new Account(AccNumber, AccName, InitialDep);
		
		System.out.println(account);
		System.out.println();
		
		double newValue = 0.0;
		
		System.out.print("Add new value? y/n: ");
		char resp = sc.next().charAt(0);
		if (resp == 'n') {
			System.out.println();		
		}
		else if (resp == 'y') {
			System.out.print("Add new value: ");
			newValue = sc.nextDouble();
			account.newDeposit(newValue);
		}
		
		System.out.println("Uploaded Account: " + "\n" + account);
		System.out.print("Withdraw? y/n: ");
		double WithDraw = 0.0;
		char Op = sc.next().charAt(0);
		if (Op == 'n') {
			System.out.println();
		}
		else if (Op == 'y') {
			System.out.print("Withdraw your value: ");
			WithDraw = sc.nextDouble();
			account.WtDraw(WithDraw);	
		}
		System.out.print("Uploaded Account: " + "\n" + account);

	}
}
