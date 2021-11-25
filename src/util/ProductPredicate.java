package util;

import java.util.function.Predicate;

import entities.Product8;

public class ProductPredicate implements Predicate<Product8> {

	@Override
	public boolean test(Product8 p) {
		return p.getPrice() >= 100.0;
	}

}
