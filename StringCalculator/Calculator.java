package StringCalculator;

public class Calculator {

    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(s);
    }
}
