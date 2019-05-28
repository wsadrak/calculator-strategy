package app;

import exception.UnknownOperatorException;
import io.DataReader;
import model.Calculator;

public class CalculatorController {
	Calculator calculator = new Calculator();
	DataReader dataReader = new DataReader();

	private double firstValue;
	private double secondValue;
	private String operator;
	private double result;
	boolean calculationsComplete;

	public void mainLoop() {

		while (!calculationsComplete) {
			try {
				readValues();
				calculateResult();

			} catch (NumberFormatException | UnknownOperatorException e) {
				System.out.println("Nieprawid³owy format danych. Spróbuj ponownie.");
			}

		}
	}

	private void printingResult() {
		System.out.println(firstValue + operator + secondValue + "=" + result);
	}

	private void calculateResult() {
		result = calculator.doOperation(firstValue, secondValue, operator);
		calculationsComplete = true;
		if (calculationsComplete)
			printingResult();
	}

	private void readValues() {
		firstValue = dataReader.readDoubleFromUser();
		secondValue = dataReader.readDoubleFromUser();
		operator = dataReader.readCharacter();
	}

}
