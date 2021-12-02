package util;

import java.util.function.Function;

import entities.Product8;

public class UpperCaseName implements Function<Product8, String> {

	@Override
	public String apply(Product8 p) {
		return p.getName().toUpperCase();
	}

}
