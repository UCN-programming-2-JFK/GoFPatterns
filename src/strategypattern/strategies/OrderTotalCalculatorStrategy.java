package strategypattern.strategies;

import java.util.List;

import strategypattern.model.OrderLine;

public interface OrderTotalCalculatorStrategy {
	float getTotal(List<OrderLine> orderLines); 
}