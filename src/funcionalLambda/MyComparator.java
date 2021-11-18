package funcionalLambda;

import java.util.Comparator;

import entities.Product8;

public class MyComparator implements Comparator<Product8> {

	@Override
	public int compare(Product8 p1, Product8 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
