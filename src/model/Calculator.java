package model;

import exception.UnknownOperatorException;

public class Calculator {

	private static final String DIVIDE = "/";
	private static final String MULTIPLY = "*";
	private static final String MINUS = "-";
	private static final String PLUS = "+";

	public double doOperation(String a, String b, String operator) {
		double result = 0;
		double firstValue = Double.parseDouble(a);
		double secondValue = Double.parseDouble(b);
		switch (operator) {
		case PLUS:
			result = add(firstValue, secondValue);
			break;
		case MINUS:
			result = subtract(firstValue, secondValue);
			break;
		case MULTIPLY:
			result = multiply(firstValue, secondValue);
			break;
		case DIVIDE:
			result = divide(firstValue, secondValue);
			break;
		default:
			throw new UnknownOperatorException("Undefined math operator");
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
