import java.util.Scanner;

public class WordTree {
    public static void main(String[] args) {
        StringTree t6=new StringTree();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter count: ");
        int count=input.nextInt();
        input.nextLine();
        for (int i=0;i<count;i++){
            System.out.print("Enter string "+(i+1)+": ");
            String str=input.nextLine();
            t6.insert(str);
        }
        System.out.println("Pre-order: ");
        t6.preOrder();
        System.out.println();
        System.out.println("In-order: ");
        t6.inOrder();
        System.out.println();
        System.out.println("Post-order: ");
        t6.postOrder();
    }
}