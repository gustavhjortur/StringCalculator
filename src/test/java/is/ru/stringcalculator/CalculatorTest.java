package is.ru.stringcalculator;

import org.junit.rules.ExpectedException;
import org.junit.Rule;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import static junit.framework.TestCase.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }


/*    //Exception rules start.
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void throwsNothing() {
    // no exception expected, none thrown: passes.
     }
    
    @Test
       public void throwsIllegalArgumentException_1() {
       thrown.expect(IllegalArgumentException.class);
       throw new IllegalArgumentException("Negative not allowed: -1");
   }
    
    @Test
       public void throwsIllegalArgumentException_2() {
       thrown.expect(IllegalArgumentException.class);
       throw new IllegalArgumentException("Negative not allowed: -4, -5");
   }
    //Exception rules end.
    
*/















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
	public void testFourNumber() {
		assertEquals(28, Calculator.add("3,2,4,19"));
	}

	@Test
	public void testFiveNumber() {
		assertEquals(50, Calculator.add("3,2,22,4,19"));
	}

	@Test
	public void testNewlineInput() {
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testLargerThen1000_1() {
		assertEquals(2, Calculator.add("1001,2"));
	}

	@Test
	public void testLargerThen1000_2() {
		assertEquals(1002, Calculator.add("1000,2"));
	}

	@Test
	public void testDifferentDelimiter_1() {
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

	@Test
	public void testDifferentDelimiter_2() {
		assertEquals(6, Calculator.add("1;2^$$%^^dfgd/3"));
	}

    //Exception rules start.
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void throwsNothing() {
    // no exception expected, none thrown: passes.
     }
    
    @Test
    public void throwsIllegalArgumentException_1() {
        try {
            assertEquals("Negatives not allowed: -1", Calculator.add("-1,2"));
        } catch (IllegalArgumentException e) { 
           assertThat(e.getMessage(), is("Negatives not allowed: -1"));
        }
    }
   
    @Test
    public void throwsIllegalArgumentException_2() {
        try {
            assertEquals("Negatives not allowed: -4,-5", Calculator.add("2,-4,3,-5"));
       } catch (IllegalArgumentException e) { 
           assertThat(e.getMessage(), is("Negatives not allowed: -4,-5"));
           //final String msg = "Negative not allowed: -4,-5";
           //Assert.fail("Test failed : " + e.getMessage());
           //assertEquals("Negative not allowed: -4,-5",  e.getMessage());
           //e.printStackTrace();
           //e.printStackTrace("Negative not allowed: -4, -5");
           //assertThat(e).hasMessage("Negative not allowed: -4,-5");
       }
   }
    //Exception rules end.
    
}
