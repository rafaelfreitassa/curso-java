package funcionalLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product8;
import util.UpperCaseName;

public class Program05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product8> list = new ArrayList<>();
		
		list.add(new Product8("TV", 900.00));
		list.add(new Product8("Mouse", 50.00));
		list.add(new Product8("Tablet", 350.00));
		list.add(new Product8("Notebook", 80.90));
		
		Function<Product8, String> func = p -> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		names.forEach(System.out::println);

	}

}
