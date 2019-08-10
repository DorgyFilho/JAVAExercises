//Demo #2 - Udemy - Day Or Night

import java.util.Scanner;

public class DayOrNight{
	public static void main(String[] args) {
		System.out.print("What time is it?: ");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		if (hour < 12) {
			System.out.println("Good Morning!");
		}
		else if (hour >= 12 && hour < 18) {
			System.out.println("Good Afternoon!");
		}
		else {
			System.out.println("Good Evening!");
		}
	}
	
}