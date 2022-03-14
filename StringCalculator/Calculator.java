package StringCalculator;

public class Calculator {

    public int add(String input) {
        if (isEmpty(input)) {
            return 0;
        }
        return stringToInt(input);
    }
    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
}
