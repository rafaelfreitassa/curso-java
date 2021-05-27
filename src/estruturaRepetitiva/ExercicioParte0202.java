package estruturaRepetitiva;

import java.util.Scanner;

public class ExercicioParte0202 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X, qtdIn= 0, qtdOut = 0;
		
		for (int i=1; i<=N; i++) {
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				qtdIn++;
			}
			else {
				qtdOut++;
			}
		}
		
		System.out.println(qtdIn +" in" );
		System.out.println(qtdOut+" out");
		
		sc.close();

	}

}
