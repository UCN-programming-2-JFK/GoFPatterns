package strategypattern.model;

import java.util.*;

public class UglyOrder {

	private float flatSumDiscount, discountPercentage;
	private boolean cheapestItemFree;
	private int cheapestItemFreeOrder = 0, percentageDiscountOrder=1, flatSumDiscountOrder = 2; 
	private List<OrderLine> orderLines = new ArrayList<OrderLine>();
	

	public boolean isCheapestItemFree() {
		return cheapestItemFree;
	}

	public void setCheapestItemFree(boolean cheapestItemFree) {
		this.cheapestItemFree = cheapestItemFree;
	}
	
	public float getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(float discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public float getFlatSumDiscount() {
		return flatSumDiscount;
	}

	public void setFlatSumDiscount(float discountPercentage) {
		this.flatSumDiscount = discountPercentage;
	}

	public int getCheapestItemFreeOrder() {
		return cheapestItemFreeOrder;
	}

	public void setCheapestItemFreeOrder(int cheapestItemFreeOrder) {
		this.cheapestItemFreeOrder = cheapestItemFreeOrder;
	}

	public int getPercentageDiscountOrder() {
		return percentageDiscountOrder;
	}

	public void setPercentageDiscountOrder(int percentageDiscountOrder) {
		this.percentageDiscountOrder = percentageDiscountOrder;
	}

	public int getFlatSumDiscountOrder() {
		return flatSumDiscountOrder;
	}

	public void setFlatSumDiscountOrder(int flatSumDiscountOrder) {
		this.flatSumDiscountOrder = flatSumDiscountOrder;
	}

	
	public List<OrderLine> getOrderlines() {
		return orderLines;
	}

	public float getOrderTotal() {
		
		/*TODO: add simple code which 
		based on whether or not a given discount is active
		uses its value in the correct order
		to determine and return the order total
		
		Hint: very hard to do! :-D
		*/ 
		return -1;
	}

	
	public float subtractCheapestItemPrice(float subTotal) {
		if(getOrderlines().size() < 2) {return subTotal;}
		
		Product cheapestItem = findCheapestProduct(getOrderlines());
		return subTotal - cheapestItem.getPrice();
	}
	
	private Product findCheapestProduct(List<OrderLine> orderLines) {
		if(orderLines.size()== 0) {throw new IllegalArgumentException("No orderlines in list!");}

		Product cheapestSoFar = orderLines.get(0).getProduct();

		for(int productCounter = 1; productCounter < orderLines.size(); productCounter++) {
			Product currentProduct = orderLines.get(productCounter).getProduct();
			if(currentProduct.getPrice() < cheapestSoFar.getPrice()) {
				cheapestSoFar = currentProduct;
			}
		}

		return cheapestSoFar;
	}	
	
}
