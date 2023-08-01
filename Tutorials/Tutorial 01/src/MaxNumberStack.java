import java.util.Scanner;
import java.util.Stack;

public class MaxNumberStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number sequence");
        String numberSeq = scanner.nextLine();
        maxNumberStack(numberSeq);
    }

    private static void maxNumberStack(String numberSeq){
        Stack<Integer> newStack = new Stack<>();
        int maxNumber = 0;
        int temp;
        String[] numbers = numberSeq.split(" ");
        for (String number : numbers){
            if (!newStack.isEmpty()){

            }
        }
    }
}
