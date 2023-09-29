public class EmployeeList {
    private int maxSize;
    private int position;
    private static Employee[] ListEntry;
    EmployeeList(int size) {
        maxSize = size;
        ListEntry = new Employee[maxSize];
        position = -1;
    }
    boolean IsListEmpty() {
        return position == 1;
    }
    boolean IsListFull() {
        return (position == maxSize - 1);
    }
    int ListSize() {
        return (position + 1);
    }
    void InsertLast(Employee x) {
        if (IsListFull())
            System.out.println("Attempt to insert at the end of a full list");
        else
            ListEntry[++position] = x;
    }
    Employee RetrieveList(int p) {
        int i;
        Employee element;
        if (IsListEmpty()) {
            System.out.println("Attempt to retrieve an entry from an empty");
            return null;
        } else if (p < 0 || p >= ListSize()) {
            System.out.println("attempt to retrieve an entry at a position not in the");
            return null;
        } else {
            element = ListEntry[p];
            return element;
        }
    }
    void TraverselList() {
        int i;
        System.out.println("|\tEmployeeId\t|\tName\t\t\t|\tAge\t|\tSalary\t|");
        for (i = 0; i < position + 1; i++) {
            System.out.println("|\t" + ListEntry[i].getEmployeeID() +
                    "\t\t|\t" + ListEntry[i].getName() + "\t\t|\t" + ListEntry[i].getAge() +
                    "\t|\t" + ListEntry[i].getSalary() + "\t|");
        }
    }
    void BubbleSort() {
        int n = ListEntry.length;
        Employee temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (ListEntry[j - 1].getSalary() >
                        ListEntry[j].getSalary()) {
                    temp = ListEntry[j - 1];
                    ListEntry[j - 1] = ListEntry[j];
                    ListEntry[j] = temp;
                }
            }
        }
    }
    public Employee[] searchEmployeesByAge(int targetAge) {
        Employee[] result = new Employee[maxSize];
        int resultIndex = 0;
        for (int i = 0; i <= position; i++) {
            if (ListEntry[i].getAge() == targetAge) {
                result[resultIndex++] = ListEntry[i];
            }
        }
        if (resultIndex > 0) {
            Employee[] trimmedResult = new Employee[resultIndex];
            System.arraycopy(result, 0, trimmedResult, 0, resultIndex);
            return trimmedResult;
        } else {
            return null;
        }
    }
}