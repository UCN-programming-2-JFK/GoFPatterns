package strategypattern.strategies;

import java.util.List;

import strategypattern.model.*;

/** DefaultCalculator sums up the line total of all order lines */

public class DefaultCalculatorStrategy implements OrderTotalCalculatorStrategy {

	@Override
	public float getTotal(List<OrderLine> orderLines) {
		float total = 0;
		for(OrderLine line : orderLines) {			
			total += line.getLineTotal();
		}
		return total;
	}
}