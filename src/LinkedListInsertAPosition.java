import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListInsertAPosition {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("Red");
            list.add("Green");

            list.addAll(1, Arrays.asList("Blue", "Yellow"));
            System.out.println("After inserting at position 1: " + list);
        }
    }