import java.util.Locale;
import java.util.Scanner;

public class EntradaDados1 {

	public static void main(String[] args) {

		//Locale.setDefault(Locale.US);//para mudar de , (padrão) para .
		
		Scanner sc = new Scanner(System.in);
		
		//String x;
		//int x;
		//double x;
		//char x;
		String x;
		int y;
		double z;
		
		//x = sc.next(); //string
		//x = sc.nextInt(); //int
		//x = sc.nextDouble(); //double
		//x = sc.next().charAt(0); //char
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		//System.out.println("Voce digitou: " + x);
		//System.out.printf("Voce digitou: %.2f%n", x);
		//System.out.println("Voce digitou: " + x);
		//System.out.println("Voce digitou: " + x);
		System.out.println("Dados digitados: " + x + " / " + y + " / " + z);
		
		sc.close();
	}

}
