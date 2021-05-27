package estrutraCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double numero = 0;
		String mensagem;
		
		numero = sc.nextDouble();
		
		if (numero >= 0 && numero <= 25) {
			mensagem = "Intervalo [0,25]";
		}
		else if (numero > 25 && numero <= 50) {
			mensagem = "Intervalo [25,50]";
		}
		else if (numero > 50 && numero <= 75) {
			mensagem = "Intervalo [50,75]";
		}
		else if (numero > 75 && numero <= 100) {
			mensagem = "Intervalo [75,100]";
		}
		else {
			mensagem = "Fora do intervalo";
		}
		
		System.out.println(mensagem);
		
		sc.close();

	}

}
