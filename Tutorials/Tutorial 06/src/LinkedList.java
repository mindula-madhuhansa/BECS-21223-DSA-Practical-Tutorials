public class LinkedList {
    Node head;
    private int count;
    LinkedList(){
        head=null;
        count=0;
    }
    boolean isListEmpty(){
        return (count==0);
    }
    int listSize(){
        return count;
    }
    void insertLast(Book book){
        Node newNode=new Node();
        newNode.entry=book;
        newNode.next=null;
        if (head==null){
            head=newNode;
        }
        else {
            Node n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=newNode;
        }
        count++;
    }
    void insert(int p,Book book){
        Node newNode=new Node();
        newNode.entry=book;
        newNode.next=null;
        if (p<0 || p>listSize()){
            System.out.println("Not in the range");
        }
        else {
            Node n=head;
            for (int i=0;i<p-1;i++){
                n=n.next;
            }
            newNode.next=n.next;
            n.next=newNode;
            count++;
        }
    }
    void delete(int p){
        if (isListEmpty()){
            System.out.println("List is empty.");
        } else if (p<0 || p>listSize()) {
            System.out.println("Not in the range");
        } else if (p==0) {
            head=head.next;
            count--;
        }
        else {
            Node n=head;
            Node n1=null;
            for (int i=0;i<p-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            n1=null;
            count--;
        }
    }
    void traverseList(){
        Node n=head;
        while (n.next!=null){
            System.out.println(n.entry);
            n=n.next;
        }
        System.out.println(n.entry);
    }
}
