import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = scanner.nextLine();
        Character output = stringComparison(string);
        System.out.println("Result: " + output);
    }

    private static Character stringComparison(String string){
        Queue<String> newQueue = new Queue<>();
        if (string.contains(":")) {
            String[] arrayOfStr = string.split(" : ");
            for (String str : arrayOfStr){
                newQueue.insert(str);
            }
            String string1 = newQueue.remove();
            String string2 = newQueue.remove();

            if (string1.length() > string2.length()) {
                return 'L';
            } else if (string1.length() < string1.length()) {
                return 'R';
            } else if (string1.length() == string1.length() && string1.equals(string2)) {
                return 'S';
            } else if (string1.length() == string1.length()) {
                return 'D';
            } else {
                return null;
            }
        } else {
            return 'N';
        }
    }
}
