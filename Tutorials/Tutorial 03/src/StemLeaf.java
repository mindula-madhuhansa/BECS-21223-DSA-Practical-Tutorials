import java.util.Scanner;

public class StemLeaf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        String numberCount = scanner.nextLine();

        System.out.print("Enter list of numbers: ");
        String numSeq = scanner.nextLine();

        List<Integer> list = new List<>(Integer.parseInt(numberCount));
        for (String num : numSeq.split(" ")){
            list.insertLast(Integer.parseInt(num));
        }
        list.sortList();

        System.out.println("Stem\tLeaf");
        for (int i = 0; i < list.listSize(); i++) {
            int number = list.retrieveList(i);
            int stem = number / 10;
            int leaf = number % 10;
            System.out.print(stem + "\t\t" + leaf);
            System.out.println();
        }
    }
}
