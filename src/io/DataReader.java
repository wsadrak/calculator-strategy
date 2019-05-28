package io;

import java.util.Scanner;

public class DataReader {
	private Scanner input = new Scanner(System.in);

	public double readDoubleFromUser() {
		System.out.println("Please type a number: ");
		double number = Double.parseDouble(input.nextLine());
		return number;
	}

	public String readCharacter() {
		System.out.println("Please type an operator: ");
		String sign = input.nextLine();
		return sign;
	}
}
