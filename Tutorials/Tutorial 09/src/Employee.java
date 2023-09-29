public class Employee {
    String EmployeeID;
    String Name;
    int age;
    int salary;
    public Employee(String employeeID, String name, int age, int salary) {
        EmployeeID = employeeID;
        Name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getEmployeeID() {
        return EmployeeID;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
}