import java.util.HashSet;
public class HashSetAppend {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<>();
            set.add("Red");
            set.add("Green");

            set.add("Blue");
            System.out.println("After appending: " + set);
        }
    }