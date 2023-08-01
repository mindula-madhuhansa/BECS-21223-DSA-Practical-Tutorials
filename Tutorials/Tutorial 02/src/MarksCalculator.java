import java.util.Scanner;

class Student{
    private int stdNo;
    private int mathsMarks;
    private int chemistryMarks;
    private int physicsMarks;
    private float totalMarks;
    private float avgMarks;

    public Student(int stdNo, int mathsMarks, int chemistryMarks, int physicsMarks) {
        this.stdNo = stdNo;
        this.mathsMarks = mathsMarks;
        this.chemistryMarks = chemistryMarks;
        this.physicsMarks = physicsMarks;
        this.totalMarks = mathsMarks + chemistryMarks + physicsMarks;
        this.avgMarks = totalMarks / 3;
    }

    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks(float avgMarks) {
        this.avgMarks = avgMarks;
    }
}

public class MarksCalculator {
    public static void main(String[] args) {
        Queue<Student> studentQueue = new Queue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much student do you want to add to database: ");
        int noOfStudents = scanner.nextInt();
        System.out.println();

        for (int i = 0; i < noOfStudents; i++) {
            System.out.print("Enter the Student No: ");
            int stdNo = scanner.nextInt();
            System.out.print("Enter the Maths Marks: ");
            int mathsMarks = scanner.nextInt();
            System.out.print("Enter the Chemistry Marks: ");
            int chemistryMarks = scanner.nextInt();
            System.out.print("Enter the Physics Marks: ");
            int physicsMarks = scanner.nextInt();
            System.out.println();

            studentQueue.insert(new Student(stdNo, mathsMarks, chemistryMarks, physicsMarks));
        }

        while (!studentQueue.isEmpty()){
            Student student = studentQueue.remove();
            System.out.println("Average mark of student number " + student.getStdNo() + " is " + student.getAvgMarks());
        }
    }



}
