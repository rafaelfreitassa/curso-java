package entities;

import java.text.DecimalFormat;

public class Product8 {

	DecimalFormat df = new DecimalFormat("0.00");
	
	private String name;
	private Double price;
		
	public Product8() {
	}

	public Product8(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product8 p) {
		return p.getPrice() >= 100.0;
	}

	public boolean nonstaticProductPredicate() {
		return price >= 100.0;
	}
	
	public static void staticPriceUpdate(Product8 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}
	
	public static String staticUpperCaseName(Product8 p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + df.format(price) + "]";
	}

}
