package funcionalLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product8;

public class Program04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product8> list = new ArrayList<>();
		
		list.add(new Product8("TV", 900.00));
		list.add(new Product8("Mouse", 50.00));
		list.add(new Product8("Tablet", 350.00));
		list.add(new Product8("Notebook", 80.90));
		
		list.forEach(Product8::staticPriceUpdate);
		
		list.forEach(System.out::println);

	}

}
