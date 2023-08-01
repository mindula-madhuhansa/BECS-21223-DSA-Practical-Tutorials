import java.util.Scanner;

public class NumberChanger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = scanner.next();
        String changedNumber = numberChanger(number);
        System.out.println(changedNumber);
    }

    private static String numberChanger(String number){
        Queue<String> newQueue = new Queue<>();
        int numberLen = number.length();
        int mid = numberLen/2;
        String[] arrayOfNumbers = new String[]{number.substring(mid), number.substring(0, mid)};
        for (String num : arrayOfNumbers){
            newQueue.insert(num);
        }
        return (newQueue.remove() + newQueue.remove());
    }
}
