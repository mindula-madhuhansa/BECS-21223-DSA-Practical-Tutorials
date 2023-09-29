public class StudentList {
    private int maxSize;
    private int position;
    private Student[] listEntry;
    StudentList(int n){
        maxSize=n;
        listEntry=new Student[maxSize];
        position=-1;
    }
    boolean isListEmpty(){
        return (position==-1);
    }
    boolean isListFull(){
        return (position==maxSize-1);
    }
    int listSize(){
        return (position+1);
    }
    void insertLast(Student data){
        if (isListFull()){System.out.println("List is full.");
        }
        else {
            listEntry[++position]=data;
        }
    }
    void insert(int p,Student data){
        if (isListFull()){
            System.out.println("List is full.");
        } else if (p<0 || p>listSize()) {
            System.out.println("Not in the range.");
        }
        else {
            for (int i=listSize();i>p;i--){
                listEntry[i]=listEntry[i-1];
            }
            listEntry[p]=data;
            position++;
        }
    }
    Student delete(int p){
        if (isListEmpty()){
            System.out.println("List is empty.");
        } else if (p>0 || p<listSize()) {
            System.out.println("Not in the range.");
        }
        else {
            Student element=listEntry[p];
            for (int i=p;i<listSize()-1;i++){
                listEntry[i]=listEntry[i+1];
            }
            position--;
            return element;
        }
        return null;
    }
    Student retrieveList(int p){
        if (isListEmpty()){
            System.out.println("List is empty.");
        } else if (p<0 || p>listSize()) {
            System.out.println("Not in the range.");
        }
        else {
            Student element=listEntry[p];
            return element;
        }
        return null;
    }
    void replace(int p,Student data){
        if (isListEmpty()){
            System.out.println("List is empty.");
        } else if (p<0 || p>listSize()) {
            System.out.println("Not in the range.");
        }
        else {
            listEntry[p]=data;
        }
    }
    void traverseList(){
        for (int i=0;i<listSize();i++){
            System.out.println("Student Number:"+listEntry[i].getStudentNumber()+" | Student Name:"+listEntry[i].getName()+" | Gender:"+listEntry[i].getGender()+" | Grade:"+listEntry[i].getGrade());
        }
    }
    void sort(){
        for (int i = 0; i < listEntry.length; i++) {
            int j = i;
            while (j > 0) {
                if (listEntry[j].getGrade() < listEntry[j - 1].getGrade())
                { Student temp = listEntry[j];
                    listEntry[j] = listEntry[j - 1];
                    listEntry[j - 1] = temp;
                }
                j--; }
        }
    }
    public Student[] binarySearch(char target){
        return binarySearch(target,0,listSize()-1);
    }
    private Student[] binarySearch(char target,int min, int max){
        if (min>max){
            return null;
        }
        else {
            int mid=(min+max)/2;
            if (listEntry[mid].getGrade()==target){
                int start=mid;
                int end=mid;
                while (start>min && listEntry[start-1].getGrade()==target){
                    start--;
                }
                while (end<max && listEntry[end+1].getGrade()==target){
                    end++;
                }
                Student[] result=new Student[end-start+1];
                System.arraycopy(listEntry,start,result,0,end-start+1);
                return result;
            } else if (listEntry[mid].getGrade()<target) {
                return binarySearch(target,mid+1,max);
            }
            else {
                return binarySearch(target,min,mid-1);
            }
        }
    }
}
