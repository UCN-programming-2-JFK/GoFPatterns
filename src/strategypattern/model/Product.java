package strategypattern.model;

public class Product {

	private String name, category;
	private float price;
	
	public Product(String name, String category, float price) {
		super();
		this.setName(name);
		this.setCategory(category);
		this.setPrice (price);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return getName() + "($" + String.format("%.2f", getPrice()).replace(",", ".") + " each)";
	}
}