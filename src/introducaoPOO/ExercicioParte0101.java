package introducaoPOO;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class ExercicioParte0101 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
				
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Area = %.2f%n", rectangle.area());
		System.out.printf("Perimiter = %.2f%n", rectangle.perimetro());
		System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());
		
		sc.close();

	}

}
