package services;

import java.util.List;

import entities.Product8;

public class ProductService {
	
	public double filteredSum(List<Product8> list) {
		double sum = 0.0;
		for (Product8 p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
