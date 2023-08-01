public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a mathematical expression: ");
        String expression = scanner.nextLine();
        int result = calculateExpression(expression);
        System.out.println("Output: " + result);
    }

    public static int calculateExpression(String expression) {
        int len = expression.length();
        Stack<Integer> numbers = new Stack<>(len);
        Stack<Character> operators = new Stack<>(len);

        for (int i = 0; i < len; i++) {
            char character = expression.charAt(i);

            if (Character.isDigit(character)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                numbers.push(num);
            } else if (character == ' ') {
                continue;
            } else if (character == '+' || character == '-' || character == '*' || character == '/') {
                while (!operators.isEmpty() && hasPrecedence(character, operators.peek())) {
                    char operator = operators.pop();
                    int num2 = numbers.pop();
                    int num1 = numbers.pop();
                    int result = applyOperation(num1, num2, operator);
                    numbers.push(result);
                }
                operators.push(character);
            }
        }

        while (!operators.isEmpty()) {
            char operator = operators.pop();
            int num2 = numbers.pop();
            int num1 = numbers.pop();
            int result = applyOperation(num1, num2, operator);
            numbers.push(result);
        }
        return numbers.pop();
    }

    private static boolean hasPrecedence(char op1, char op2) {
        return (op2 == '*' || op2 == '/') && (op1 == '+' || op1 == '-');
    }

    private static int applyOperation(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
