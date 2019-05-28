package test;

import static org.junit.Assert.*;

import org.junit.Test;

import exception.UnknownOperatorException;
import junit.framework.Assert;
import model.Calculator;

public class CalculatorTest {
	
	
	@Test
	public void should_return_3_when_argument_is_1_plus_2() {
		Calculator calc = new Calculator();
		assertEquals(3, calc.doOperation(1, 2, "+"), 0);
	}
	
	@Test
	public void should_return_double_sum_when_arguments_double_values() {
		Calculator calc = new Calculator();
		assertEquals(3.25, calc.doOperation(1.05, 2.2, "+"), 0);
	}
	
	@Test(expected = UnknownOperatorException.class)
	public void nie_wiem() {
		Calculator calc = new Calculator();
//		assertEquals(3.25, calc.doOperation(1.05, 2.2, "+"), 0);
		calc.doOperation(1, 2, "ads");
	}
	
	
	@Test
	public void should_return_1_when_argument_is_2_minus_1() {
		Calculator calc = new Calculator();
		assertEquals(1, calc.doOperation(2, 1, "-"), 0);
	}
	
	@Test
	public void should_return_6_when_argument_is_2_multiply_3() {
		Calculator calc = new Calculator();
		assertEquals(6, calc.doOperation(2, 3, "*"), 0);
	}
	
	@Test
	public void should_return_2_when_argument_is_10_divide_5() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.doOperation(10, 5, "/"), 0);
	}
	

}
