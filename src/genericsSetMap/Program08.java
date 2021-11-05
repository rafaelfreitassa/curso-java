package genericsSetMap;

import java.util.Set;
import java.util.TreeSet;

import entities.Product6;

public class Program08 {

	public static void main(String[] args) {

		Set<Product6> set = new TreeSet<>();
		
		set.add(new Product6("TV", 900.0));
		set.add(new Product6("Notebook", 1200.0));
		set.add(new Product6("Tablet", 400.0));
		
		for (Product6 p : set) {
			System.out.println(p);
		}

	}

}
