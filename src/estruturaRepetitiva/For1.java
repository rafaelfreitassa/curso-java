package estruturaRepetitiva;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		int x = 0;
		
		for (int i=1; i<=N; i++) {
			x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
