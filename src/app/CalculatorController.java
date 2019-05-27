package app;
import java.util.Scanner;

public class CalculatorController {
	
	Scanner input = new Scanner(System.in);

	public void mainLoop() {

		boolean correctValues = false;
		do {

			try {
				int a = readIntFromUser();
				String sign = readCharacter();
				int b = readIntFromUser();
				doOperation(a, b, sign);
				correctValues = true;
			} catch (IllegalArgumentException e) {
				System.out.println("Wprowadzono nieprawid³owe znaki. Spróbuj jeszcze raz.");
			}

		} while (!correctValues);

	}

	private void doOperation(int a, int b, String sign) throws IllegalArgumentException {
		switch (sign) {
		case "+":
			add(a, b);
			break;
		case "-":
			subtract(a, b);
			break;
		case "*":
			multiply(a, b);
			break;
		case "/":
			divide(a, b);
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	private void divide(int a, int b) {
		System.out.println("Dodawanie");
		Context context = new Context(new OperationDivide());
		System.out.println(a + " + " + b + " = " + context.executeStrategy(a, b));
		
	}

	private void multiply(int a, int b) {
		System.out.println("Dodawanie");
		Context context = new Context(new OperationMultiply());
		System.out.println(a + " + " + b + " = " + context.executeStrategy(a, b));
		
	}

	private void subtract(int a, int b) {
		System.out.println("Dodawanie");
		Context context = new Context(new OperationSubtract());
		System.out.println(a + " + " + b + " = " + context.executeStrategy(a, b));
		
	}

	private String readCharacter() {
		System.out.println("Podaj znak: ");
		String sign = input.nextLine();
		return sign;
	}

	private int readIntFromUser() {
		System.out.println("Podaj pierwsz¹ liczbê: ");
		int a = Integer.parseInt(input.nextLine());
		return a;
	}

	private void add(int a, int b) {
		System.out.println("Dodawanie");
		Context context = new Context(new OperationAdd());
		System.out.println(a + " + " + b + " = " + context.executeStrategy(a, b));
	}

}
