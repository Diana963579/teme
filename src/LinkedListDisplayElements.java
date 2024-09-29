import java.util.LinkedList;

public class LinkedListDisplayElements {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            list.add("Red");
            list.add("Green");
            list.add("Blue");

            for (int i = 0; i < list.size(); i++) {
                System.out.println("Element at index " + i + ": " + list.get(i));
            }
        }
    }