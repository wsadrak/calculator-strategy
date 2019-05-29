package model;

public class OperationContext {
	Strategy strategy;
	
	
	public OperationContext(Strategy strategy) {
		this.strategy = strategy;
	}

	public double executeStrategy(double a, double b) {
		return strategy.calculate(a, b);
	}
}
