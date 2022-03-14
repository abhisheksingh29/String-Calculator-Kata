package StringCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculate = new Calculator();
    @Test
    public void returnZeroForEmptyString() {
        assertEquals (calculate.add(""), 0);
    }
    @Test
    public void returnIntegerValueForInteger() {
        assertEquals(calculate.add("1"),1);
    }
    @Test
    public void returnSumForTwoNumbersDelimitedByComma() {
        assertEquals(calculate.add("1,2"), 3);
    }
    @Test
    public void returnSumForTwoNumbersDelimitedByNewLine() {
        assertEquals(calculate.add("1\n2"),3);
    }

}
