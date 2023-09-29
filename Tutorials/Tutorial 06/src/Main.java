public class Main {
    private static LinkedList list=new LinkedList();
    private static LinkedQueue queue=new LinkedQueue();
    public static void addBook(Book book){
        list.insertLast(book);
    }
    public static void processNextRequest(){
        if (!queue.isQueueEmpty()){
            Book bookRequest=queue.serve();
            Node currentNode=list.head;
            while (currentNode!=null){
                if
                (currentNode.entry.getBookId().equals(bookRequest.getBookId())){
                    if (currentNode.entry.getAvailableCopies()>0){

                        currentNode.entry.setAvailableCopies(currentNode.entry.getAvailableCopies()
                                - bookRequest.getNumberOfRequests());

                        currentNode.entry.setNumberOfTimesBorrowed(currentNode.entry.getNumberOfTimesBorrowed()+1);
                        break;
                    }
                    else {
                        System.out.println("No available copies.");
                    }
                }
                currentNode=currentNode.next;
            }
        }
    }
    public static int findAvailableCopies(String bookTitle){
        Node currentNode=list.head;
        while (currentNode!=null){
            if (currentNode.entry.getBookTitle().equals(bookTitle)){
                return currentNode.entry.getAvailableCopies();
            }
            currentNode=currentNode.next;
        }
        return 0;
    }
    public static void mostBorrowedBook(){
        int maxCount=0;
        Book maxBook=null;
        Node currentNode=queue.front;
        while (currentNode!=null){
            if (currentNode.entry.getNumberOfRequests()>maxCount){
                maxCount=currentNode.entry.getNumberOfRequests();
                maxBook=currentNode.entry;
            }
            currentNode=currentNode.next;
        }
        System.out.println("Most borrowed book is: "+maxBook.getBookTitle());
    }
    public static void printBookAvailability(String bookTitle){
        int num=findAvailableCopies(bookTitle);
        if (num>0){
            System.out.println("Book: "+bookTitle+", Available copies: "+num);
        }
        else {
            System.out.println("Book not found: "+bookTitle);
        }
    }
    public static void main(String[] args) {
        list.insertLast(new Book("B101","Introduction to Programming",5,0));
                list.insertLast(new Book("B102","History of science",4,0));
        list.insertLast(new Book("B103","The Lord of the Ring",6,0));
        list.insertLast(new Book("B104","Jane Eyre",7,0));
        list.insertLast(new Book("B105","David Copperfield",1,0));
        queue.append(new Book("B101","Introduction to Programming",2));
        queue.append(new Book("B102","History of science",1));
        queue.append(new Book("B103","The Lord of the Ring",4));
        queue.append(new Book("B104","Jane Eyre",0));
        queue.append(new Book("B105","David Copperfield",0));
        int numberOfCopies=findAvailableCopies("Introduction to Programming");
        System.out.println("Number of copies are: "+numberOfCopies);
        mostBorrowedBook();
        processNextRequest();
        printBookAvailability("Introduction to Programming");
    }
}
