package introducaoPOO;

import java.util.Locale;
import java.util.Scanner;

import util.Calculatorv1;
import util.Calculatorv2;
import util.CurrencyConverter;

public class ExercicioEstatico73 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double totalDollar = sc.nextDouble();
		
		double totalReal = CurrencyConverter.convert(dollar,totalDollar);
		
		//double imposto = CurrencyConverter.tax(dollar);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", totalReal/*+imposto*/);
		
		sc.close();

	}

}
