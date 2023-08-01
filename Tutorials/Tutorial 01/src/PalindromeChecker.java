import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        boolean isPalindrome = palindromeChecker(word.toLowerCase());

        if (isPalindrome){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    private static boolean palindromeChecker(String word){
        Stack<Character> newStack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            newStack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (newStack.pop() != word.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
