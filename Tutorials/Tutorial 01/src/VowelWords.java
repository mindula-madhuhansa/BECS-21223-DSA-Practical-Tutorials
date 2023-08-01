import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class VowelWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();
        vowelChecker(sentence.toLowerCase());
    }

    private static void vowelChecker(String sentence){
        String[] words = sentence.split(" ");
        Stack<String> newStack = new Stack<>(sentence.length());
        for (String word : words){
            if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")){
                newStack.push(word);
            } else {
                continue;
            }
        }

        List<String> sortedWords = new ArrayList<>();
        while (!newStack.isEmpty()){
            sortedWords.add(newStack.pop());
        }
        sortedWords.sort(String::compareTo);

        for (String word : sortedWords){
            System.out.println(word);
        }
    }

}
