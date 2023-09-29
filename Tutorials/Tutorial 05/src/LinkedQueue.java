public class LinkedQueue {
    private Node front;
    private Node rear;
    private int count;

    LinkedQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    boolean isQueueEmpty() {
        return (count == 0);
    }

    Order serve() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        } else {
            Order element = front.entry;
            front = front.next;
            count--;
            return element;
        }
    }

    void append(Order ord) {
        Node oldRear = rear;
        rear = new Node();
        rear.entry = ord;
        rear.next = null;
        if (isQueueEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        count++;
    }
}
