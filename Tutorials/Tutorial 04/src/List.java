import java.util.Arrays;

public class List {
    private int maxSize ;
    private int position;
    private int[] ListEntry;

    public List(int size){
        maxSize = size;
        ListEntry = new int[maxSize];
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

    public void InsertLast(int x){
        if (IsListFull())
            System.out.println("Attempt to insert at the end of a full list");
        else
            ListEntry[++position] = x;
    }

    public void InsertList(int p, int element){
        int i;
        if (IsListFull())
            System.out.println("Attempt to insert an entry into a full list");
        else if (p < 0 || p > ListSize())
            System.out.println("attempt to insert a position not in the list");
        else
        {
            for( i = ListSize(); i >p; i--)
                ListEntry[i] = ListEntry[i-1];
            ListEntry[p] = element;
            position++;
        }
    }
    public int DeleteList( int p) {
        int i,element;
        if (IsListEmpty())
            System.out.println("Attempt to delete an entry from an empty list");
        else if (p < 0 || p >= ListSize())
            System.out.println("attempt to delete a position not in the list");
        else {
            element = ListEntry[p];
            for( i = p; i < ListSize()-1; i++)
                ListEntry[i] = ListEntry[i+1];
            position--;
            return element;
        }
        return 0;
    }

    int RetrieveList(int p ){
        int i,element;
        if (IsListEmpty()){
            System.out.println("Attempt to retrieve an entry from an empty list");
            return 0;}
        else if (p < 0 || p >= ListSize()){
            System.out.println("attempt to retrieve an entry at a position not in the list");
            return 0; }
        else{
            element = ListEntry[p];
            return element;}
    }

    public void ReplaceList (int p, int x){
        int i;
        if (IsListEmpty())
            System.out.println("Attempt to replace an entry of an empty list");
        else if (p < 0 || p >= ListSize())
            System.out.println("attempt to replace an entry at a position not in the list");
        else
            ListEntry[p] = x;
    }

    public void TraverselList(){
        int i;
        for (i=0; i<position+1; i++)
            System.out.println(ListEntry[i]);
    }

    public void sortList(){
        Arrays.sort(ListEntry);
    }
}
