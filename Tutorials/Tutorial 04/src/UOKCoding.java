import java.util.Scanner;

public class UOKCoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of participants: ");
        int numStudent = scanner.nextInt();
        System.out.println();

        StudentList list = new StudentList(numStudent);

        // get participant details
        for (int i = 0; i < numStudent; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();

            System.out.print("Enter round 1 score: ");
            int round1Marks = scanner.nextInt();

            System.out.print("Enter round 2 score: ");
            int round2Marks = scanner.nextInt();
            System.out.println();

            Student student = new Student(name, round1Marks, round2Marks);
            list.InsertLast(student);
        }

        // list all participants
        System.out.println();
        System.out.println("Student\tRound 1\tRound 2");
        for (int i = 0; i < numStudent; i++) {
            Student student = list.RetrieveList(i);
            System.out.println(student.getName() + "\t\t" + student.getRound1Marks() + "\t\t" + student.getRound2Marks());
        }
        System.out.println();

        // find max scorer
        int maxRound1 = 0, marksRound1, maxRound2 = 0, marksRound2, winnerScore = 0, totScore;
        String maxScorerRound1 = "", maxScorerRound2 = "", winner = "";
        for (int i = 0; i < numStudent; i++) {
            Student student = list.RetrieveList(i);
            marksRound1 = student.getRound1Marks();
            marksRound2 = student.getRound2Marks();
            totScore = student.getRound1Marks() + student.getRound2Marks();

            if (marksRound1 > maxRound1){
                maxRound1 = marksRound1;
                maxScorerRound1 = student.getName();
            }
            if (marksRound2 > maxRound2){
                maxRound2 = marksRound2;
                maxScorerRound2 = student.getName();
            }

            if (totScore > winnerScore){
                winnerScore = totScore;
                winner = student.getName();
            }
        }
        System.out.println("Round 1 max scorer: " + maxScorerRound1);
        System.out.println("Round 2 max scorer: " + maxScorerRound2);
        System.out.println();

        displayImprovedScores(list, numStudent);
        System.out.println();

        System.out.println("Coding Champion Title goes to " + winner);
    }

    public static void displayImprovedScores(StudentList list, int numStudent){
        System.out.println("Scores improved students");
        for (int i = 0; i < numStudent; i++) {
            Student student = list.RetrieveList(i);
            if (student.getRound1Marks() < student.getRound2Marks()){
                System.out.println(student.getName());
            }
        }
    }
}
