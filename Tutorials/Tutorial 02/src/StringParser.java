import java.util.Scanner;

public class StringParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = scanner.nextLine();
        stringParser(string);
    }

    private static void stringParser(String string){
        Queue<Character> newQueue = new Queue<>();
        for (int i = 0; i < string.length(); i++) {
            newQueue.insert(string.charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            System.out.print(newQueue.remove());

        }
    }
}
