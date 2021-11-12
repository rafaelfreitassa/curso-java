package genericsSetMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new TreeSet<>();
		Set<Integer> b = new TreeSet<>();
		Set<Integer> c = new TreeSet<>();
		Set<Integer> x = new TreeSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			a.add(sc.nextInt());
		}
		
		/*for (Integer cod : a) {
			System.out.println(cod);
		}*/
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			b.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			c.add(sc.nextInt());
		}
		
		x.addAll(a);
		x.addAll(b);
		x.addAll(c);
		
		System.out.println("Total students: " + x.size());
		
		sc.close();

	}

}
