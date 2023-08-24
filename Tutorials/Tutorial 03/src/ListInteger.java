//import java.util.Arrays;
//
//public class List<T> {
//    private int maxSize;
//    private int position;
//    private T[] listEntry;
//
//    public List(int size) {
//        maxSize = size;
//        listEntry = (T[]) new Object[maxSize];
//        position = -1;
//    }
//
//    public boolean isListEmpty() {
//        return position == -1;
//    }
//
//    public boolean isListFull() {
//        return position == maxSize - 1;
//    }
//
//    public int listSize() {
//        return position + 1;
//    }
//
//    public void insertLast(T value) {
//        if (isListFull()) {
//            System.out.println("List is full");
//        } else {
//            listEntry[++position] = value;
//        }
//    }
//
//    public void insertList(T value, int index) {
//        if (isListFull()) {
//            System.out.println("List is full");
//        } else if (index < 0 || index > listSize()) {
//            System.out.println("Out of list size. Enter a valid index.");
//        } else {
//            for (int i = listSize(); i > index; i--) {
//                listEntry[i] = listEntry[i - 1];
//            }
//            listEntry[index] = value;
//            position++;
//        }
//    }
//
//    public T deleteList(int index) {
//        T element = null;
//        if (isListEmpty()) {
//            System.out.println("List is empty");
//        } else if (index < 0 || index >= listSize()) {
//            System.out.println("Out of list size. Enter a valid index.");
//        } else {
//            element = listEntry[index];
//            for (int i = index; i < listSize() - 1; i++) {
//                listEntry[i] = listEntry[i + 1];
//            }
//            position--;
//        }
//        return element;
//    }
//
//    public T retrieveList(int index) {
//        if (isListEmpty()) {
//            System.out.println("List is empty");
//            return null;
//        } else if (index < 0 || index >= listSize()) {
//            System.out.println("Out of list size. Enter a valid index.");
//            return null;
//        } else {
//            return listEntry[index];
//        }
//    }
//
//    public void replaceList(int index, T value) {
//        if (isListEmpty()) {
//            System.out.println("List is empty");
//        } else if (index < 0 || index >= listSize()) {
//            System.out.println("Out of list size. Enter a valid index.");
//        } else {
//            listEntry[index] = value;
//        }
//    }
//
//    public void traversalList() {
//        for (int i = 0; i < position + 1; i++) {
//            System.out.println(listEntry[i]);
//        }
//    }
//
//    public void sortList() {
//        Arrays.sort(listEntry, 0, position + 1);
//    }
//}
