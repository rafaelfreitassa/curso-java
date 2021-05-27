import java.util.Locale;
import java.util.Scanner;

public class ExercicioParte0102 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double x1, resultado;
		
		x1 = sc.nextDouble();
		sc.nextLine();
				
		resultado = (3.14159 * (Math.pow(x1, 2.0000)));
		
		System.out.printf("O raio de %.4f é igual a: %.4f%n", x1, resultado);
		
		sc.close();

	}

}
