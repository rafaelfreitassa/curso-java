package estrutraCondicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int hora1, hora2, total;
		
		hora1 = sc.nextInt();
		hora2 = sc.nextInt();
		
		if (hora1 < hora2) {
			total = hora2 - hora1;
		}
		else if (hora1 > hora2) {
			total = (24 - hora1) + hora2;
			
		}
		else {
			total = 24;
		}
		
		System.out.println("O JOGO DUROU " + total + " HORA(S)");
		
		sc.close();

	}

}
