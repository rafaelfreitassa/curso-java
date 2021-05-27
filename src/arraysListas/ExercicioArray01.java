package arraysListas;

import java.util.Scanner;

import entities.Room;

public class ExercicioArray01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Room[] vect = new Room[10];
		
		System.out.printf("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++ ) {
			sc.nextLine();
			System.out.println();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int number = sc.nextInt();
			vect[number] = new Room(name, email, number);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i<vect.length; i++) {
			if (vect[i] != null ) {
				System.out.println(vect[i]);
			}
		}
		//laço for each
		System.out.println("------");
		for (Room obj: vect) {
			if (obj != null ) {
				System.out.println(obj);
			}
		}
		
		sc.close();

	}

}
