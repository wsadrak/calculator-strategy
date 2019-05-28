package model;

import exception.UnknownOperatorException;

public class Calculator {

	private static final String DIVIDE = "/";
	private static final String MULTIPLY = "*";
	private static final String MINUS = "-";
	private static final String PLUS = "+";

	public double doOperation(double a, double b, String operator) {
		double result = 0;

		switch (operator) {
		case PLUS:
			result = add(a, b);
			break;
		case MINUS:
			result = subtract(a, b);
			break;
		case MULTIPLY:
			result = multiply(a, b);
			break;
		case DIVIDE:
			result = divide(a, b);
			break;
		default:
			throw new UnknownOperatorException("Wykorzystujesz niezdefiniowany operator arytmetyczny");
		}
		return result;
	}

	private double add(double a, double b) {
		Context context = new Context(new OperationAdd());
		return context.executeStrategy(a, b);
	}

	private double subtract(double a, double b) {
		Context context = new Context(new OperationSubtract());
		return context.executeStrategy(a, b);
	}

	private double divide(double a, double b) {
		Context context = new Context(new OperationDivide());
		return context.executeStrategy(a, b);
	}

	private double multiply(double a, double b) {
		Context context = new Context(new OperationMultiply());
		return context.executeStrategy(a, b);
	}

}
