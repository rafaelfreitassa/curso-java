import java.util.Scanner;

public class ExercicioParte0103 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, resultado;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
				
		resultado = ((a * b) - (c * d));
		
		System.out.println("O resultado é: " + resultado);
		
		sc.close();

	}

}
