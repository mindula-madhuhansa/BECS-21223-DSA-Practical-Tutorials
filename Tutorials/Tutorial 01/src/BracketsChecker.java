import java.util.Scanner;

public class BracketsChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the mathematical expression: ");
        String expression = scanner.nextLine();
        boolean result = bracketsChecker(expression);
        if (result){
            System.out.println("Brackets are correctly balanced");
        } else {
            System.out.println("Brackets aren't correctly balanced");
        }

    }

    private static boolean bracketsChecker(String expression){
        Stack<Character> newStack = new Stack<>(expression.length());
        for (char letter : expression.toCharArray()){
            if (letter == '(' || letter == '{' || letter == '['){
                newStack.push(letter);
            } else if (letter == ')' || letter == '}' || letter == ']'){
                if (newStack.isEmpty()){
                    return false;
                }
                char top = newStack.pop();
                if (letter == ')' && top != '('){
                    return false;
                } else if (letter == '}' && top != '{'){
                    return false;
                } else if (letter == ']' && top != '['){
                    return false;
                }
            }
        }
        return newStack.isEmpty();
    }
}
