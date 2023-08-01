public class Stack<E> {
    private static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> top;
    private int size;

    public Stack(int size) {
        this.top = null;
        this.size = size;
    }

    public boolean isEmpty(){
        return top == null;
    }

    // push
    public void push(E data){
        Node<E> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // pop
    public E pop(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }

        E popData = top.data;
        top = top.next;
        size--;
        return popData;
    }

    // peak
    public E peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }
        return top.data;
    }

    public int size(){
        return size;
    }
}
