import java.util.HashSet;

public class HashSetClear {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}