package StringCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculate = new Calculator();
    @Test
    public void returnZeroForEmptyString() throws Exception {
        assertEquals (calculate.add(""), 0);
    }
    @Test
    public void returnIntegerValueForInteger() throws Exception {
        assertEquals(calculate.add("1"),1);
    }
    @Test
    public void returnSumForTwoNumbersDelimitedByComma() throws Exception {
        assertEquals(calculate.add("1,2"), 3);
    }
    @Test
    public void returnSumForTwoNumbersDelimitedByNewLine() throws Exception {
        assertEquals(calculate.add("1\n2"),3);
    }
    @Test
    public void returnSumForMultipleNumbersDelimitedEitherWay() throws Exception {
        assertEquals(calculate.add("1\n2,3"),6);
    }
    @Test
    public void differentDelimitersAreValid() throws Exception {
        assertEquals(calculate.add("//;\n1;2"),3);
    }
    @Test(expected = Exception.class)
    public void returnExceptionForNegativeNumbers() throws Exception{
        calculate.add("-1,-2");
    }

}
