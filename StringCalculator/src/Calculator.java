package StringCalculator.src;

public class Calculator {

    public int add(String input) throws Exception {
        if (isEmpty(input)) {
            return 0;
        }
        if (input.length() == 1) {
            return stringToInt(input);
        }
        else {
                String delimiter = ",";
                if(input.matches("//(.*)\n(.*)")){
                    delimiter = Character.toString(input.charAt(2));
                    input = input.substring(4);
                }

                String numbers[] = splitNumbers(input, delimiter + "|\n");
                return findSum(numbers);
        }
    }

    private String[] splitNumbers(String numbers, String divider) {
        return numbers.split(divider);
    }

    private int findSum(String[] numbers) throws Exception {
        findWrongInput(numbers);
        int sum = 0;
        for (String currentNum : numbers) {
            sum += stringToInt(currentNum);
        }
        return sum;
    }

    private void findWrongInput(String[]numbers) throws Exception {
        for (String currentNum : numbers) {
            if (stringToInt(currentNum) < 0) {
                throw new Exception("Negatives not allowed" + stringToInt(currentNum));
            }
        }
    }

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }

    private boolean isEmpty(String input) {
        return input.isEmpty();
    }
}
