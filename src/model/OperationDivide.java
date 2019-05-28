package model;

public class OperationDivide implements Strategy {

	@Override
	public double calculate(double a, double b) {
		return a/b;
	}

}
