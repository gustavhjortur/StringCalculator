package stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class stringCalculatorTest {

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("stringCalculatorTest");
    }

   @Test
    public void testEmptyString() {
        assertEquals(0, stringCalculator.add(""));
    }
}
