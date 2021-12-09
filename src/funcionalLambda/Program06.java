package funcionalLambda;

import java.util.ArrayList;
import java.util.List;

import entities.Product8;
import services.ProductService;

public class Program06 {

	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		List<Product8> list = new ArrayList<>();
		
		list.add(new Product8("TV", 900.00));
		list.add(new Product8("Mouse", 50.00));
		list.add(new Product8("Tablet", 350.50));
		list.add(new Product8("Notebook", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);
		
		System.out.println("Sum = " + String.format("%,2f",sum));

	}

}
