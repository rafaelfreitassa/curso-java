package estruturaRepetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int total = 0;
		
		while (x != 0) {
			total += x;
			x = sc.nextInt();
		}

		System.out.println("Total " + total);
		
		sc.close();

	}

}
