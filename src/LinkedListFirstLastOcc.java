import java.util.LinkedList;

public class LinkedListFirstLastOcc {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Red");

        String first = list.getFirst();
        String last = list.getLast();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }
}