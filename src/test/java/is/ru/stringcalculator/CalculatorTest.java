package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(42, Calculator.add("42"));
	}

	@Test
	public void testTwoNumber() {
		assertEquals(5, Calculator.add("3,2"));
	}

	@Test
	public void testTreeNumber() {
		assertEquals(9, Calculator.add("3,2,4"));
	}

	@Test
	public void testiFourNumber() {
		assertEquals(28, Calculator.add("3,2,4,19"));
	}

	@Test
	public void testiFiveNumber() {
		assertEquals(50, Calculator.add("3,2,22,4,19"));
	}
}
