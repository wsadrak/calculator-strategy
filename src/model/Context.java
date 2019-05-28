package model;

public class Context {
	Strategy strategy;
	
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public double executeStrategy(double a, double b) {
		return strategy.calculate(a, b);
	}
}
