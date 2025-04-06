package strategypattern.model;

import java.util.ArrayList;
import java.util.List;

import strategypattern.strategies.*;

public class Order  {
	private List<OrderLine> orderlines = new ArrayList<OrderLine>();
	private OrderTotalCalculatorStrategy totalsCalculator;
	
	public Order(OrderTotalCalculatorStrategy totalsCalculator) {
		super();
		this.totalsCalculator = totalsCalculator;
	}
	
	public Order() {this(new DefaultCalculatorStrategy());}

	
	public List<OrderLine> getOrderlines() {
		return orderlines;
	}
	public void addProducts(Product product, int quantity) {
		addOrderLine(new OrderLine(product, quantity));
	}
	public void addOrderLine(OrderLine orderline) {
		this.orderlines.add(orderline);
	}
	public OrderTotalCalculatorStrategy getTotalsCalculator() {
		return totalsCalculator;
	}
	public void setTotalsCalculator(OrderTotalCalculatorStrategy totalsCalculator) {
		this.totalsCalculator = totalsCalculator;
	}
	
	public float getOrderTotal()
	{
		return getTotalsCalculator().getTotal(getOrderlines());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(OrderLine line : getOrderlines()) {
			sb.append(line.toString() + "\n");
		}
		sb.append("Order total: $" + getOrderTotal() + "\n");
		return sb.toString();
	}
}