package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.UnknownOperatorException;
import model.Calculator;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void before() {
		 calculator = new Calculator();
	}
	@Test
	public void should_return_3_when_argument_is_1_plus_2() {
		assertEquals(3, calculator.doOperation("1", "2", "+"), 0);
	}
	
	@Test
	public void should_return_double_sum_when_arguments_double_values() {
		assertEquals(3.25, calculator.doOperation("1.05", "2.2", "+"), 0);
	}
	
	@Test(expected = UnknownOperatorException.class)
	public void nie_wiem() {
		calculator.doOperation("1", "2", "ads");
	}
	
	
	@Test
	public void should_return_1_when_argument_is_2_minus_1() {
		assertEquals(1, calculator.doOperation("2", "1", "-"), 0);
	}
	
	@Test
	public void should_return_6_when_argument_is_2_multiply_3() {
		assertEquals(6, calculator.doOperation("2", "3", "*"), 0);
	}
	
	@Test
	public void should_return_2_when_argument_is_10_divide_5() {
		assertEquals(2, calculator.doOperation("10", "5", "/"), 0);
	}
	

}
