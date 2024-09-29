import java.util.HashSet;

public class HashSetSize {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        System.out.println("Size of HashSet: " + set.size());
    }
}