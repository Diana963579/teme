import java.util.LinkedList;
public class LinkedListAppend {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("Red");
            list.add("Green");

            list.addLast("Blue");
            System.out.println("After appending: " + list);
        }
    }