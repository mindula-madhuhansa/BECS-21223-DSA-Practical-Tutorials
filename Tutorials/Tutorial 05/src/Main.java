import java.util.Scanner;

public class Main {
    public static void processNextOrder(LinkedList list,LinkedQueue queue){
        if (!queue.isQueueEmpty()){
            Order ord=queue.serve();
            int ordNumber=ord.getOrderName();
            Node currentNode= list.head;
            while (currentNode!=null){
                if (currentNode.entry.getOrderName()==ordNumber){
                    currentNode.entry.setStatus("Processed");
                    break;
                }
                currentNode=currentNode.next;
            }
            System.out.println("Order number "+ordNumber+" has been processed.");
        }
        else {
            System.out.println("No orders to process.");
        }
    }
    public static void printOrderStatus(LinkedList list,int orderNumber){
        Node currentNode= list.head;
        while (currentNode!=null){
            if (currentNode.entry.getOrderName()==orderNumber){
                System.out.println("Status: "+currentNode.entry.getStatus());
                break;
            }
            currentNode=currentNode.next;
        }
    }
    public static void cancelOrder(LinkedList list,int orderNumber){
        Node currentNode= list.head;
        while (currentNode!=null){
            if (currentNode.entry.getOrderName()==orderNumber){
                currentNode.entry.setStatus("Canceled");
                break;
            }
            currentNode=currentNode.next;
        }
    }
    public static void printOrderStatusAfterCancellation(LinkedList list,int orderNumber){
        Node currentNode= list.head;
        while (currentNode!=null){
            if (currentNode.entry.getOrderName()==orderNumber){
                System.out.println(currentNode.entry.getStatus());
                break;
            }
            currentNode=currentNode.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        LinkedQueue queue=new LinkedQueue();
        list.insertLast(new Order(101,"Nimal","Product A","Processing"));
        queue.append(new Order(101,"Nimal","Product A","Processing"));
        list.insertLast(new Order(102,"Kamala","Product B","Pending"));
        queue.append(new Order(102,"Kamala","Product B","Pending"));
        list.insertLast(new Order(103,"Sunil","Product C","Processing"));
        queue.append(new Order(103,"Sunil","Product C","Processing"));
        list.insertLast(new Order(104,"Amal","Product D","Pending"));
        queue.append(new Order(104,"Amal","Product D","Pending"));
        list.insertLast(new Order(105,"Nayana","Product D","Processing"));
        queue.append(new Order(105,"Nayana","Product D","Processing"));
        System.out.print("The person who placed first order in the system: ");
        Order firstOrder=list.head.entry;
        System.out.println(firstOrder.getCustomerName());
        int processesCount=0;
        Node currentNode= list.head;
        while (currentNode!=null){
            if (currentNode.entry.getStatus().equals("Processing")){
                processesCount++;
            }
            currentNode=currentNode.next;
        }
        System.out.print("Processers which are currently being existed: ");
        System.out.println(processesCount);
        processNextOrder(list,queue);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter order number: ");
        int num= input.nextInt();
        printOrderStatus(list,num);
        System.out.println("Enter order number that wants to cancel: ");
        int ordNum= input.nextInt();
        cancelOrder(list,ordNum);
        printOrderStatusAfterCancellation(list,ordNum);
    }
}
