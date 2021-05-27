package estruturaRepetitiva;

import java.util.Scanner;

public class ExercicioParte0101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		int senhaValida = 2002;
		
		while (senha != senhaValida) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");

		sc.close();

	}

}
