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
	private double result;
	boolean calculationsComplete;

	public void mainLoop() {

		while (!calculationsComplete) {
			readValues();
			calculateResult();
			printResult();
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
	
	private void calculateResult() {
		Calculator calculator = new Calculator();
		
		try {
			calculator.doOperation(firstValue, secondValue, operator);
			calculationsComplete = true;
		} catch (NumberFormatException exception) {
			consolePrinter.print("Invalid data format. Please try again. ");
		} catch (UnknownOperatorException exception) {
			consolePrinter.print(exception.getMessage() + ". Please try again. ");
		}
	}

	private void printResult() {
		if(calculationsComplete) {
			consolePrinter.print(firstValue + " " + operator + " " + secondValue + " = " + result);
		}
	}



}
