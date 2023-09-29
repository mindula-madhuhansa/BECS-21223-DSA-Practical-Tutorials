public class LinkedQueue {
    Node front;
    private Node rear;
    private int count;
    LinkedQueue(){
        front=null;
        rear=null;
        count=0;
    }
    boolean isQueueEmpty(){
        return (count==0);
    }
    public Book serve(){
        if (isQueueEmpty()){
            System.out.println("Queue is empty.");
            return null;
        }
        else {
            Book element=front.entry;
            front=front.next;
            count--;
            return element;
        }
    }
    void append(Book book){
        Node oldRear=rear;
        rear=new Node();
        rear.entry=book;
        rear.next=null;
        if (isQueueEmpty()){
            front=rear;
        }
        else {
            oldRear.next=rear;
        }
        count++;
    }
}
