package funcionalLambda;

import java.util.ArrayList;
import java.util.List;

import entities.Product8;

public class Program03 {

	public static void main(String[] args) {

		List<Product8> list = new ArrayList<>();
		
		list.add(new Product8("TV", 900.00));
		list.add(new Product8("Mouse", 50.00));
		list.add(new Product8("Tablet", 350.00));
		list.add(new Product8("Notebook", 80.90));
		
		double min = 100.0;
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product8 p : list) {
			System.out.println(p);
		}

	}

}
