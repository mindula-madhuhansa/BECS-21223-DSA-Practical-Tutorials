import java.util.Scanner;

public class MeanMedianModeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number length: ");
        int len = scanner.nextInt();

        System.out.print("Enter number sequence: ");
        String input = scanner.next();

        String[] numberStrings = input.split(",");
        List listNumber = new List(len);

        for (int i = 0; i < len; i++) {
            listNumber.InsertLast(Integer.parseInt(numberStrings[i]));
        }
        checkMean(listNumber);
        checkMedian(listNumber);
        checkMode(listNumber);
        checkRange(listNumber);
    }

    public static void checkMean(List list){
        double total = 0, mean;
        for (int i = 0; i <= list.ListSize()-1; i++) {
            total += list.RetrieveList(i);
        }
        mean = total/list.ListSize();
        System.out.println("Mean = " + mean);
    }

    public static void checkMedian(List list){
        double median;
        int midPosition;
        list.sortList();
        if (list.ListSize()%2 == 1){
            midPosition = (list.ListSize() + 1)/2;
            median = list.RetrieveList(--midPosition);
            System.out.println("Median = " + (int) median);
        } else if (list.ListSize()%2 == 0) {
            int prevPosition = list.ListSize()/2 - 1;
            int nextPosition = prevPosition++;
            median = (double) (list.RetrieveList(prevPosition) + list.RetrieveList(nextPosition)) / 2;
            System.out.println("Median = " + median);
        }
    }

    public static void checkMode(List list){
        int mode = list.RetrieveList(0);
        int maxCount = 1;
        for (int i = 0; i < list.ListSize(); i++) {
            int count = 0;
            for (int j = 0; j < list.ListSize(); j++) {
                if (list.RetrieveList(i) == list.RetrieveList(j)){
                    count++;
                }
            }
            if (count > maxCount){
                maxCount = count;
                mode = list.RetrieveList(i);
            }
        }
        System.out.println("Mode = " + mode);
    }

    public static void checkRange(List list){
        list.sortList();
        System.out.println("Range = " + (list.RetrieveList(list.ListSize() - 1) - list.RetrieveList(0)));
    }
}
