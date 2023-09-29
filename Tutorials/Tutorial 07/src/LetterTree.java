import java.util.Scanner;

public class LetterTree {
    public static void main(String[] args) {
        CharTree tree = new CharTree();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter character " + i + ": ");
            char ch = input.next().charAt(0);
            tree.insert(ch);
        }
        System.out.println("Pre-order: ");
        tree.preOrder();
        System.out.println();
        System.out.println("In-order: ");
        tree.inOrder();
        System.out.println();
        System.out.println("Post-order: ");
        tree.postOrder();
    }
}
