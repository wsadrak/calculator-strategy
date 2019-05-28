package model;

public class OperationSubtract implements Strategy {


	@Override
	public double calculate(double a, double b) {
		return a-b;
	}

}
