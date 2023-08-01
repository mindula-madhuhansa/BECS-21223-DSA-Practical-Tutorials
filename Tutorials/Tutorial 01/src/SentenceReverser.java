import java.util.Scanner;

public class SentenceReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        sentenceReverser(sentence);
    }

    private static void sentenceReverser(String sentence){
        Stack<String> newStack = new Stack<>(sentence.length());
        String[] words = sentence.split(" ");
        for (String word : words){
            newStack.push(word);
        }
        while (!newStack.isEmpty()){
            System.out.print(newStack.pop() + " ");
        }
    }
}
