package util;

import java.util.function.Consumer;

import entities.Product8;

public class PriceUpdate implements Consumer<Product8> {

	@Override
	public void accept(Product8 p) {
		
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
