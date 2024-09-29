import java.util.LinkedList;

public class LinkedListRemoveElements {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.remove("Green");
        System.out.println("After removal: " + list);
    }
}