package io;

import java.util.Scanner;

public class DataReader {
	private Scanner input = new Scanner(System.in);

	public String readInputFromUser() {
		return input.nextLine();
	}
}
