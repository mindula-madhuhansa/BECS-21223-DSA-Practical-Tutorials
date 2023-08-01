import java.util.Scanner;

public class StringMerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = scanner.next();
        System.out.print("Enter string 2: ");
        String str2 = scanner.next();
        String mergerdString = stringMerger(str1, str2);
        System.out.println("Merged string: " + mergerdString);
    }

    public static String stringMerger(String str1, String str2){
        Queue<String> newQueue =new Queue<>();
        newQueue.insert(str1);
        newQueue.insert(str2);
        return (newQueue.remove() + newQueue.remove());
    }
}
