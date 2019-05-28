package model;

	public class OperationAdd implements Strategy {

		@Override
		public double calculate(double num1, double num2) {
			return num1 + num2;
		}

}
