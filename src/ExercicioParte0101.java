import java.util.Scanner;

public class ExercicioParte0101 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1, x2, resultado;
		
		x1 = sc.nextInt();
		sc.nextLine();
		x2 = sc.nextInt();
		sc.nextLine();
				
		resultado = x1 + x2;
		
		System.out.println("O resultado de " + x1 + " + " + x2 + " é igual a: " + resultado);
		
		sc.close();

	}

}
