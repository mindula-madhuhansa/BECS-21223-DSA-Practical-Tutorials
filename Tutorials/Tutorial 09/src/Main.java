import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Employee count: ");
        int count = sc.nextInt();
        EmployeeList list = new EmployeeList(count);
        sc.nextLine();
        for (int i=0;i<count;i++) {
            System.out.print("Enter Employee Id : ");
            String employeeID = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();
            list.InsertLast(new Employee(employeeID, name, age, salary));
        }
        list.TraverselList();
        list.BubbleSort();
        System.out.print("\nAfter Sorting: ");
        list.TraverselList();
        System.out.println();
        System.out.print("Enter Age of Employee: ");
        int age = sc.nextInt();
        Employee[] result = list.searchEmployeesByAge(age);
        if (result != null) {
            System.out.println("Employee with Age " + age + " : ");
            for (Employee employee : result) {

                System.out.println("|\t"+employee.getEmployeeID()+"\t\t|\t"+employee.getName( )+"\t\t|\t"+employee.getAge()+"\t|\t"+employee.getSalary()+"\t|");
            }
        } else {
            System.out.println("No Employee found with age " + age);
        }
    }
}
