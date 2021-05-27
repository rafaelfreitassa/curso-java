package introducaoPOO;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioParte0102 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Enter employee data: ");
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double aumento = sc.nextDouble();
		employee.aumentarSalario(aumento);

		System.out.println();
		System.out.println("Updated data " + employee);
		
		sc.close();

	}

}
