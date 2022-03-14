package StringCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void returnZeroForEmptyString() {
        Calculator calculate = new Calculator();
        assertEquals (calculate.add(""), 0);
    }
    @Test
    public void returnIntegerValueForInteger() {
        Calculator calculate = new Calculator();
        assertEquals(calculate.add("1"),1);
    }
}