package model;

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
	public void shouldReturn3whenArguments1plus2() {
		assertEquals(3, calculator.doOperation("1", "2", "+"), 0);
	}
	
	@Test
	public void shouldReturnDoublewhenArgumentsDouble() {
		assertEquals(3.25, calculator.doOperation("1.05", "2.2", "+"), 0);
	}
	
	@Test(expected = UnknownOperatorException.class)
	public void shouldReturnExceptionWhenOperatorInvalid() {
		calculator.doOperation("1", "2", "ads");
	}
	
	@Test
	public void shouldReturn1WhenArguments2minus1() {
		assertEquals(1, calculator.doOperation("2", "1", "-"), 0);
	}
	
	@Test
	public void shouldReturn6WhenArguments2multiply3() {
		assertEquals(6, calculator.doOperation("2", "3", "*"), 0);
	}
	
	@Test
	public void shouldReturn2WhenArguments10divide5() {
		assertEquals(2, calculator.doOperation("10", "5", "/"), 0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void shouldReturnExceptionWhenDivide0() {
		calculator.doOperation("3", "0", "/");
	}
	
	@Test(expected = NumberFormatException.class)
	public void shouldReturnExceptionWhenArgumentNotNumber() {
		calculator.doOperation("asd", "0", "/");
	}
	

}
