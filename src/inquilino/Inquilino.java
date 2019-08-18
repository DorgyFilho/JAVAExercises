package inquilino;

import java.util.Scanner;

import aluguel.CadastroAluguel;

public class Inquilino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CadastroAluguel[] rooms = new CadastroAluguel[10];
		
		System.out.print("How many rooms will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Room number: ");
			int room = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.print("E-Mail: ");
			String Email = sc.next();
			rooms[room] = new CadastroAluguel(name, Email);
		}
		
		for (int k = 0; k < rooms.length; k++) {
			if (rooms[k] != null) {
				System.out.print("The room " + k + " is under responsibility of " 
			+ rooms[k].getName() + ", whose e-mail is " + rooms[k].getEmail() + "\n");
			}
			else {
				System.out.println("The room " + k + " is available");
			}
		
		sc.close();
						
		}
	}
}
