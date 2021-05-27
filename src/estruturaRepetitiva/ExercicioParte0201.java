package estruturaRepetitiva;

import java.util.Scanner;

public class ExercicioParte0201 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N;
		
		for (int i=1; i<=X; i++) {
			N = i % 2;
			if (N != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
