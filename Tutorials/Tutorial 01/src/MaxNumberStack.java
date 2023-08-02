import java.util.Scanner;

public class MaxNumberStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number sequence: ");
        String numberSeq = scanner.nextLine();
        maxNumberStack(numberSeq);
    }

    private static void maxNumberStack(String numberSeq){
        Stack<Integer> newStack = new Stack<>(numberSeq.length());
        int temp;
        String[] numbers = numberSeq.split(", ");
        for (String number : numbers){
            int num = Integer.parseInt(number);
            if (!newStack.isEmpty()){
                if (newStack.peek() > num){
                    temp = newStack.pop();
                    newStack.push(num);
                    newStack.push(temp);
                } else {
                    newStack.push(num);
                }
            } else if (newStack.isEmpty()) {
                newStack.push(num);
            }
        }
        System.out.println("Highest number: " + newStack.pop());
    }
}
