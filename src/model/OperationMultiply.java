package model;

public class OperationMultiply implements Strategy {


	@Override
	public double calculate(double a, double b) {
		return a*b;
	}

}
