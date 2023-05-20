public class Calculator {
    public int evaluate(String expression) {
        int sum = 1;
        for (String summand: expression.split("\\+"))
            sum += Integer.parseInt(summand);
        return sum;
    }
}