import java.util.Locale;
import java.util.Scanner;

public class ExercicioParte0104 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		double horasTrabalhadas, valorHora, salario;
		
		id = sc.next();
		horasTrabalhadas = sc.nextDouble();
		valorHora = sc.nextDouble();
				
		salario = (horasTrabalhadas * valorHora);
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
