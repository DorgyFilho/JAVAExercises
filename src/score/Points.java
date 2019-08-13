package score;

import java.util.Locale;
import java.util.Scanner;

import constr.Aluno;

public class Points {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		System.out.print("Score 1: ");
		aluno.s1 = sc.nextDouble();
		System.out.print("Score 2: ");
		aluno.s2 = sc.nextDouble();
		System.out.print("Score 3: ");
		aluno.s3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.sumScore());
		
		if (aluno.sumScore() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aluno.verifyStatus());
		}
		else {
			System.out.println("PASS");
			
		}
		sc.close();
		
		
	}

}
