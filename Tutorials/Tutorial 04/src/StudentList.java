import java.util.Arrays;

public class StudentList {
    private int maxSize ;
    private int position;
    private Student[] ListEntry;

    public StudentList(int size){
        maxSize = size;
        ListEntry = new Student[maxSize];
        position= -1;
    }

    public boolean IsListEmpty(){
        return (position==-1);
    }

    public boolean IsListFull(){
        return (position== maxSize-1);
    }

    public int ListSize(){
        return (position+1);
    }

    public void InsertLast(Student student){
        if (IsListFull())
            System.out.println("Attempt to insert at the end of a full list");
        else
            ListEntry[++position] = student;
    }

    public void InsertList(int p, Student student){
        int i;
        if (IsListFull())
            System.out.println("Attempt to insert an entry into a full list");
        else if (p < 0 || p > ListSize())
            System.out.println("attempt to insert a position not in the list");
        else
        {
            for( i = ListSize(); i >p; i--)
                ListEntry[i] = ListEntry[i-1];
            ListEntry[p] = student;
            position++;
        }
    }
    public Student RetrieveList(int index){
        Student student;
        if (IsListEmpty()){
            System.out.println("List is empty");
            return null;
        } else if(index < 0 || index >= ListSize()){
            System.out.println("Out of list size. Enter a valid index.");
            return null;
        } else {
            student = ListEntry[index];
            return student;
        }
    }


    public void DeleteList( int p) {
        int i;
        Student student;
        if (IsListEmpty())
            System.out.println("Attempt to delete an entry from an empty list");
        else if (p < 0 || p >= ListSize())
            System.out.println("attempt to delete a position not in the list");
        else {
            student = ListEntry[p];
            for( i = p; i < ListSize()-1; i++)
                ListEntry[i] = ListEntry[i+1];
            position--;
        }
    }

    public void ReplaceList (int p, Student student){
        int i;
        if (IsListEmpty())
            System.out.println("Attempt to replace an entry of an empty list");
        else if (p < 0 || p >= ListSize())
            System.out.println("attempt to replace an entry at a position not in the list");
        else
            ListEntry[p] = student;
    }

    public void TraverselList(){
        int i;
        for (i=0; i<position+1; i++)
            System.out.println(ListEntry[i]);
    }

}
