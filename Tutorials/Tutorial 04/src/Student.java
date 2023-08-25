public class Student {
    private final String name;
    private final int round1Marks;
    private final int round2Marks;

    public Student(String name, int round1Marks, int round2Marks) {
        this.name = name;
        this.round1Marks = round1Marks;
        this.round2Marks = round2Marks;
    }

    public String getName() {
        return name;
    }

    public int getRound1Marks() {
        return round1Marks;
    }

    public int getRound2Marks() {
        return round2Marks;
    }

}
