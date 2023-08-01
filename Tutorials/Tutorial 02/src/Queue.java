public class Queue<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element){
            this.element = element;
            this.next = null;
        }
    }

    public void insert(E element){
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public E remove(){
        if (isEmpty()) {
            System.out.println("Query is empty");
            return null;
        }
        E element = head.element;
        head = head.next;

        if (isEmpty()) {
            tail = null;
        }
        size--;
        return element;
    }

    public E peek(){
        if (isEmpty()) {
            System.out.println("Query is empty");
            return null;
        } else {
            return head.element;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

}
