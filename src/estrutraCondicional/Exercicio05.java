package estrutraCondicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double total = 0;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = (quantidade * 4.00);
		}
		else if (codigo == 2) {
			total = (quantidade * 4.50);
		}
		else if (codigo == 3) {
			total = (quantidade * 5.00);
		}
		else if (codigo == 4) {
			total = (quantidade * 2.00);
		}
		else if (codigo == 5) {
			total = (quantidade * 1.50);
		}

		System.out.printf("Total: %.2f%n", total);
		
		sc.close();

	}

}
