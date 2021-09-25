package arquivos;

public class Sale {
	
	private String product;
	private Double price;
	public int quantity;
	
	public Sale(String product, Double price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return product;
	}

	public void setName(String name) {
		this.product = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double productTotalValue() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return product
			   + ", "
			   + String.format("%.2f", productTotalValue());
	}

}
