import java.util.Locale;
import java.util.Scanner;

public class ExercicioParte0106 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		float a, b, c;
		float triangulo, circulo, trapezio, quadrado, retangulo, pi;
		
		pi = (float) 3.14159;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		triangulo = (a * c) / 2; 
		circulo = (float) (pi * (Math.pow(c, 2f)));
		trapezio = (((a * c) / 2) + ((b * c) / 2)); 
		quadrado = (float) Math.pow(b, 2f);
		retangulo = (a * b);
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();

	}

}
