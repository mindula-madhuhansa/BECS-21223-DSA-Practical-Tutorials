public class Student {
    private String studentNumber;
    private String name;
    char gender;
    private char grade;
    public Student(String studentNumber, String name, char gender, char
            grade) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public char getGrade() {
        return grade;
    }
}
