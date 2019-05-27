package app;

public class OperationDivide implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return a/b;
	}

}
