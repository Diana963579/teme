import java.util.LinkedList;

public class LinkedListInsertFront {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("Green");
            list.add("Blue");

            list.addFirst("Red");
            System.out.println("After inserting at the front: " + list);
        }
    }