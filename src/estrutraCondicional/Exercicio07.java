package estrutraCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		String mensagem = "";
		
		if (x == 0.0 && y == 0.0) {
			mensagem = "Origem";
		}
		else if (x == 0.0) {
			mensagem = "Eixo X";
		}
		else if (y == 0.0) {
			mensagem = "Eixo Y";
		}
		else if (x > 0.0 && y > 0.0) {
			mensagem = "Q1";
		}
		else if (x > 0.0 && y < 0.0) {
			mensagem = "Q4";
		}
		else if (x < 0.0 && y < 0.0) {
			mensagem = "Q3";
		}
		else if (x < 0.0 && y > 0.0) {
			mensagem = "Q2";
		}		
		System.out.println(mensagem);
		
		sc.close();

	}

}
