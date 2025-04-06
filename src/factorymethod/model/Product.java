package factorymethod.model;

public class Product {
	
	private double price;
	private int productNumber;
	private String name;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Product (int productNumber, String name, double price) {
		this.setProductNumber(productNumber);
		this.setName(name);
		this.setPrice(price);
	}
}