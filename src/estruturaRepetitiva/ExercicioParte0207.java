package estruturaRepetitiva;

import java.util.Scanner;

public class ExercicioParte0207 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i  +" ");
			System.out.print(i*i+" ");
			System.out.print(i*i*i  );
			System.out.println();
		}

	}

}
