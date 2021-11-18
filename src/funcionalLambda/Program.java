package funcionalLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product8;

public class Program {

	public static void main(String[] args) {
		
		List<Product8> list = new ArrayList<>();
		
		list.add(new Product8("TV", 900.00));
		list.add(new Product8("Notebook", 1200.00));
		list.add(new Product8("Tablet", 450.00));
		
		Comparator<Product8> comp = new Comparator<Product8>() {

			@Override
			public int compare(Product8 p1, Product8 p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
		list.sort(comp);
		
		for (Product8 p : list) {
			System.out.println(p);
		}

	}

}
