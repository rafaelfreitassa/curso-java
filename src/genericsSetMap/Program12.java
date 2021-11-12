package genericsSetMap;

import java.util.HashMap;
import java.util.Map;

import entities.Product7;

public class Program12 {

	public static void main(String[] args) {
		
		Map<Product7, Double> stock = new HashMap<>();
		
		Product7 p1 = new Product7("Tv", 900.0);
		Product7 p2 = new Product7("Notebook", 1200.0);
		Product7 p3 = new Product7("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product7 ps = new Product7("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
