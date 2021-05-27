package arraysListas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee1;
import entities.Room;

public class ExercicioListas01 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee1> list = new ArrayList<>();
		
		System.out.printf("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++ ) {
			//sc.nextLine();
			System.out.println();
			System.out.println("Employee #" + i + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Employee1(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee1 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			//list.get(pos).increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee1 x : list) {
			System.out.println(x);
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee1> list, int id) {
		
		Employee1 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return emp != null;
	}

	public static Integer position(List<Employee1> list, int id) {
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	
}
