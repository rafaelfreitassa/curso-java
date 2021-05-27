package estrutraCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double total = 50.0;
		int franquia = 100;
		
		if (minutos > franquia) {
			total += (minutos - franquia) * 2.0;
		}
		
		System.out.printf("Valor da conta é R$ %.2f%n", total);
		
		sc.close();

	}

}
