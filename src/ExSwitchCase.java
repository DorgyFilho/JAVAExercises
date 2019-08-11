//Exemplo: Switch-Case

import java.util.Scanner;

public class ExSwitchCase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		
		String Day;
		
		switch(Num) {
		case 1:
			Day = "Sunday";
			break;			
		
		case 2:
			Day = "Monday";
			break;
		
		case 3:
			Day = "Tuesday";
			break;
		
		case 4:
			Day = "Wednesday";
			break;
		
		case 5:
			Day = "Thursday";
			break;
		
		case 6:
			Day = "Friday";
			break;
		
		case 7:
			Day = "Saturday";
			break;
		
		default:
			Day = "Invalid Value!";
			break;
		}
		
		System.out.println("Day: " + Day);
		sc.close();
	}
}