package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product8;

public class ProductService {
	
	public double filteredSum(List<Product8> list, Predicate<Product8> criteria) {
		double sum = 0.0;
		for (Product8 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
