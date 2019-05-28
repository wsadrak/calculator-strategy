package app;

public class OperationSubtract implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return a - b;
	}

}
