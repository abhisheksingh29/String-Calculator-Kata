package StringCalculator;

public class Calculator {

    public int add(String input) {
        String [] numbers = input.split(",|\n");
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return stringToInt(input);
        }
        else {
            return findSum(numbers[0], numbers[1]);
        }
    }
    private int findSum(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
}
