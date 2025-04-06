package strategypattern.strategies;

import java.util.List;
import strategypattern.model.*;

public class FlatDiscountAbovePriceCalculatorStrategy implements OrderTotalCalculatorStrategy {

	
	private float minimumPriceForDiscount, flatDiscount;
	
		
	public float getMinimumPriceForDiscount() {
		return minimumPriceForDiscount;
	}

	public void setMinimumPriceForDiscount(float minimumPriceForDiscount) {
		this.minimumPriceForDiscount = minimumPriceForDiscount;
	}

	public float getFlatDiscount() {
		return flatDiscount;
	}

	public void setFlatDiscount(float flatDiscount) {
		this.flatDiscount = flatDiscount;
	}

	public FlatDiscountAbovePriceCalculatorStrategy(float minimumPriceForDiscount, float flatDiscount) {
		this.minimumPriceForDiscount = minimumPriceForDiscount;
		this.flatDiscount = flatDiscount;
	}

	@Override
	public float getTotal(List<OrderLine> orderLines) {
		float total = 0;
		for(OrderLine line : orderLines) {			
			total += line.getLineTotal();
		}
		if(total >= getMinimumPriceForDiscount()) {
			total = total - flatDiscount;	
		}
		return total;
	}
}