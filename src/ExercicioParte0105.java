import java.util.Locale;
import java.util.Scanner;

public class ExercicioParte0105 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String codigo;
		int quantidade;
		double valorUnitario, total;
		
		codigo = sc.next();
		quantidade = sc.nextInt();
		valorUnitario = sc.nextDouble();
		
		total = quantidade * valorUnitario;

		codigo = sc.next();
		quantidade = sc.nextInt();
		valorUnitario = sc.nextDouble();
		
		total = total + (quantidade * valorUnitario);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
