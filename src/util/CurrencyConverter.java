package util;

public class CurrencyConverter {

	public static final double TAX = 6;
	
	public static double convert(double dollar,double total) {
		return dollar * total + tax(dollar);
	}
	
	public static double tax(double dollar) {
		return 200 * TAX / 100 * dollar;
	}
	
	
}
