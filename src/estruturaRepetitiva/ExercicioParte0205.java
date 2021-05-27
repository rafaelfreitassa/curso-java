package estruturaRepetitiva;

import java.util.Scanner;

public class ExercicioParte0205 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = n;

		if (n == 0) {
			fatorial = 1;
		}
		else {

			for (int i=1; i<n; i++) {
				fatorial = fatorial * (n-i);
			}
		
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}
