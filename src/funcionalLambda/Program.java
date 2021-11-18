package funcionalLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Product8;

public class Program {

	public static void main(String[] args) {
		
		List<Product8> list = new ArrayList<>();
		
		list.add(new Product8("TV", 900.00));
		list.add(new Product8("Notebook", 1200.00));
		list.add(new Product8("Tablet", 450.00));
		
		Collections.sort(list);
		
		for (Product8 p : list) {
			System.out.println(p);
		}

	}

}
