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
            return findSum(numbers);
        }
    }
    private int findSum(String[] numbers) {
        int sum = 0;
        for (int currentNum = 0; currentNum < numbers.length; currentNum++) {
            sum += Integer.parseInt(numbers[currentNum]);
        }
        return sum;
    }
    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
}
