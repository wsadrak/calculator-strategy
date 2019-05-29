package model;

import exception.UnknownOperatorException;

public class Calculator {

	private static final String DIVIDE = "/";
	private static final String MULTIPLY = "*";
	private static final String MINUS = "-";
	private static final String PLUS = "+";

	public double doOperation(String firstValue, String secondValue, String operator) {
		double result = 0;
		double firstNumber = convertToNumber(firstValue);
		double secondNumber = convertToNumber(secondValue);
		
		switch (operator) {
		case PLUS:
			result = add(firstNumber, secondNumber);
			break;
		case MINUS:
			result = subtract(firstNumber, secondNumber);
			break;
		case MULTIPLY:
			result = multiply(firstNumber, secondNumber);
			break;
		case DIVIDE:
			if(secondNumber == 0) {
				throw new ArithmeticException("You can't divide by 0");
			}
			result = divide(firstNumber, secondNumber);
			break;
		default:
			throw new UnknownOperatorException("Undefined math operator");
		}
		return result;
	}

	private double convertToNumber(String a) {
		double firstValue = Double.parseDouble(a);
		return firstValue;
	}

	private double add(double a, double b) {
		OperationContext context = new OperationContext(new OperationAdd());
		return context.executeStrategy(a, b);
	}

	private double subtract(double a, double b) {
		OperationContext context = new OperationContext(new OperationSubtract());
		return context.executeStrategy(a, b);
	}

	private double divide(double a, double b) {
		OperationContext context = new OperationContext(new OperationDivide());
		return context.executeStrategy(a, b);
	}

	private double multiply(double a, double b) {
		OperationContext context = new OperationContext(new OperationMultiply());
		return context.executeStrategy(a, b);
	}

}
