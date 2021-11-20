package funcionalLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product8;

public class Program02 {

	public static int compareProducts(Product8 p1, Product8 p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
	
	public static void main(String[] args) {
		
		List<Product8> list = new ArrayList<>();
		
		list.add(new Product8("TV", 900.00));
		list.add(new Product8("Notebook", 1200.00));
		list.add(new Product8("Tablet", 450.00));
		
		list.sort(Program02::compareProducts);
		
		for (Product8 p : list) {
			System.out.println(p);
		}

	}

}
