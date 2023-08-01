import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.print("Vowels: ");
        vowelFinder(string);
    }

    private static void vowelFinder(String string){
        Queue<Character> newQueue = new Queue<>();
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            switch (letter) {
                case 'A', 'U', 'O', 'I', 'E', 'a', 'e', 'i', 'o', 'u' -> newQueue.insert(letter);
                default -> {
                    continue;
                }
            }
        }
        while (!newQueue.isEmpty()){
            System.out.print(newQueue.remove() + " ");
        }
    }
}
