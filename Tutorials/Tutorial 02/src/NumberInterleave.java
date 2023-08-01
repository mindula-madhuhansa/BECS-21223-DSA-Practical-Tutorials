import java.util.Scanner;

public class NumberInterleave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number sequence: ");
        String numberSequence = scanner.nextLine();
        String changedNumber = numberInterleave(numberSequence);
        System.out.println(changedNumber);
    }

    private static String numberInterleave(String number){
        Queue<String> newQueue1 = new Queue<>();
        Queue<String> newQueue2 = new Queue<>();
        int count = 1;
        String[] arrayOfNumbers = number.split(" ");
        int numOfElements = arrayOfNumbers.length;
        int mid = numOfElements / 2;
        for (String num : arrayOfNumbers){
            if (count <= mid){
                newQueue1.insert(num);
                count++;
            } else if (count <= arrayOfNumbers.length){
                newQueue2.insert(num);
                count++;
            }
        }
        String interleavedNumber = "";
        for (int i = 0; i < mid; i++) {
             interleavedNumber += newQueue1.remove() + " " + newQueue2.remove() + " ";
        }
        return interleavedNumber;
    }
}
