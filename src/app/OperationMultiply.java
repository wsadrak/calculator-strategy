package app;

public class OperationMultiply implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return a*b;
	}

}
