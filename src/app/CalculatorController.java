package app;

import exception.UnknownOperatorException;
import io.DataReader;
import model.Calculator;

public class CalculatorController {
	
	DataReader dataReader = new DataReader();
	public void mainLoop() {
		double a = 0;
		double b = 0;
		String operator = null; 
		boolean readComplete = false;
		
		// 1. wczytywanie wartoœci
		do {

			try {
				a = dataReader.readDoubleFromUser();
				b = dataReader.readDoubleFromUser();
				operator = dataReader.readCharacter();
				readComplete = true;
			} catch (NumberFormatException e) {
				System.out.println("Wprowadzono nieprawid³owe znaki. Spróbuj jeszcze raz.");
			}

		} while (!readComplete);

		// 2. obliczanie wyniku
		Calculator calc = new Calculator();
		double result = 0;
		boolean calculatonComplete = false;
		try {
			result = calc.doOperation(a, b, operator);
			calculatonComplete = true;
		} catch (UnknownOperatorException | ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		
		// 3. wyœwietlanie wyniku
		if(calculatonComplete) {
			System.out.println(a + operator + b + "=" + result);
		} else {
			System.out.println("Nie mo¿na by³o obliczyæ wyniku wyra¿enia " + a + operator + b);
		}
	}


}
