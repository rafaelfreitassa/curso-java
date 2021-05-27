package introducaoPOO;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ExercicioParte0103 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Enter student data: ");
		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", aluno.total());
		
		if (aluno.pontosFaltantes() == 0.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points%n", aluno.pontosFaltantes());
		}
		
		sc.close();

	}

}
