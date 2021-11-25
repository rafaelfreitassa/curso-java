package funcionalLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product8;

public class Program03 {

	public static void main(String[] args) {

		List<Product8> list = new ArrayList<>();
		
		list.add(new Product8("TV", 900.00));
		list.add(new Product8("Mouse", 50.00));
		list.add(new Product8("Tablet", 350.00));
		list.add(new Product8("Notebook", 80.90));
		
		Predicate<Product8> pred = p -> p.getPrice() >= 100.0;
		
		list.removeIf(pred);
		
		for (Product8 p : list) {
			System.out.println(p);
		}

	}

}
