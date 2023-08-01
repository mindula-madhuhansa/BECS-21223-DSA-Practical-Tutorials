import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the number sequence: ");
        int len = scanner.nextInt();
        System.out.print("Enter a number sequence: ");
        int numberSeq = scanner.nextInt();
        int reversedSequence = numberReverser(len, numberSeq);
        System.out.println("Reversed number sequence: " + reversedSequence);
    }

    public static int numberReverser(int len, int numberSeq){
        Stack<Integer> stack = new Stack<>(len);

        while (numberSeq != 0){
            int num = numberSeq % 10;
            stack.push(num);
            numberSeq /=  10;
        }

        int reversedNumber = 0;
        int multiplier = 1;
        while (!stack.isEmpty()){
            int num = stack.pop();
            reversedNumber += num * multiplier;
            multiplier *= 10;
        }
        return reversedNumber;
    }
}
