package app;

import exception.UnknownOperatorException;
import io.ConsolePrinter;
import io.DataReader;
import model.Calculator;

public class CalculatorController {
	DataReader dataReader = new DataReader();
	ConsolePrinter consolePrinter = new ConsolePrinter();

	private String firstValue;
	private String secondValue;
	private String operator;
	boolean calculationsComplete;

	public void mainLoop() {

		while (!calculationsComplete) {
			readValues();
			double result = calculateResult();
			printResult(result);
		}
	}


	private void readValues() {
		consolePrinter.print("First number: ");
		firstValue = dataReader.readInputFromUser();
		
		consolePrinter.print("Second number: ");
		secondValue = dataReader.readInputFromUser();
		
		consolePrinter.print("Operator: ");
		operator = dataReader.readInputFromUser();
	}
	
	private double calculateResult() {
		Calculator calculator = new Calculator();
		double calculationResult = 0;
		try {
			calculationResult = calculator.doOperation(firstValue, secondValue, operator);
			calculationsComplete = true;
		} catch (NumberFormatException | ArithmeticException exception) {
			consolePrinter.print("Invalid data format. Please try again. ");
		} catch (UnknownOperatorException exception) {
			consolePrinter.print(exception.getMessage() + ". Please try again. ");
		}
		
		return calculationResult;
	}

	private void printResult(double result) {
		if(calculationsComplete) {
			consolePrinter.print(firstValue + " " + operator + " " + secondValue + " = " + result);
		}
	}



}
