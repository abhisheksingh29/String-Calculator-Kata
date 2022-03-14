package StringCalculator;

public class Calculator {

    public int add(String input) {
        String [] numbers = input.split(",");
        if (isEmpty(input)) {
            return 0;
        }
        else {
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
    }
    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
}
