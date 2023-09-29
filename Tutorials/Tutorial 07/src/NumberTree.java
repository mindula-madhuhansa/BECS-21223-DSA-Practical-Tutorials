import java.util.Scanner;

public class NumberTree {
    public static void main(String[] args) {
        IntTree tree = new IntTree();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter count: ");
        int count=input.nextInt();
        for (int i=1;i<=count;i++){
            System.out.print("Enter number "+i+": ");
            int num=input.nextInt();
            tree.insert(num);
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
