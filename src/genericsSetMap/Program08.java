package genericsSetMap;

import java.util.HashSet;
import java.util.Set;

import entities.Product6;

public class Program08 {

	public static void main(String[] args) {

		Set<Product6> set = new HashSet<>();
		
		set.add(new Product6("TV", 900.0));
		set.add(new Product6("Notebook", 1200.0));
		set.add(new Product6("Tablet", 400.0));
		
		Product6 prod = new Product6("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
