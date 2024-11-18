package Exception;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringTokenizer expressionTokenizer = new StringTokenizer(input);

        while (expressionTokenizer.hasMoreTokens()) {
            String expression = expressionTokenizer.nextToken();
            StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

            try {
                String leftString = tokenizer.nextToken();
                String operator = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand = 0;
                double rightOperand = 0;


                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Left operand is not a number: " + leftString);
                    continue;
                }

                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException nfe) {
                    System.out.println("Right operand is not a number: " + rightString);
                    continue;
                }

                double result = 0;

                if (operator.equals("+")) {
                    result = leftOperand + rightOperand;
                } else if (operator.equals("-")) {
                    result = leftOperand - rightOperand;
                } else if (operator.equals("*")) {
                    result = leftOperand * rightOperand;
                } else if (operator.equals("/")) {
                    if (rightOperand != 0) {
                        result = leftOperand / rightOperand;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue;
                    }
                } else {
                    System.out.println("Invalid operator: " + operator);
                    continue;
                }

                System.out.println("Result of " + expression + ": " + result);
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax in expression: " + expression);
            }
        }

        in.close();
    }
}
