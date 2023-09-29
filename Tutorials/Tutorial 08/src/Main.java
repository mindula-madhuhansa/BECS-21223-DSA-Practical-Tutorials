import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentList stList=new StudentList(10);
        stList.insertLast(new Student("PS/2017/280","Kamal",'M','B'));
        stList.insertLast(new Student("PS/2017/149","Nirmal",'F','B'));
        stList.insertLast(new Student("PS/2017/045","Sarath",'M','C'));
        stList.insertLast(new Student("PS/2017/73","Kasuni",'F','A'));
        stList.insertLast(new Student("PS/2017/301","Chanaka",'M','C'));
        stList.insertLast(new Student("PS/2017/312","Akila",'F','A'));
        stList.insertLast(new Student("PS/2017/105","Dasuni",'F','A'));
        stList.insertLast(new Student("PS/2017/016","Amal",'M','A'));
        stList.insertLast(new Student("PS/2017/198","Binura",'M','B'));
        stList.insertLast(new Student("PS/2017/151","Sithara",'F','A'));
        stList.traverseList();
        System.out.println();
        stList.sort();
        System.out.println("After sorting:-");
        stList.traverseList();
        System.out.println();
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Grade: ");
        char grade=input.next().charAt(0);
        Student[] result = stList.binarySearch(grade); if (result != null)
        {
            System.out.println("Students with Grade " + grade + ":"); for
        (Student student : result) {
            System.out.println(student.getStudentNumber() + " | " +
                    student.getName() + "\t| " + student.getGender() + "\t| " +
                    student.getGrade());
        }
        } else {
            System.out.println("No students found" + grade);
        }
    }
}
