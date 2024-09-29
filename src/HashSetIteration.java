import java.util.HashSet;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        for (String color : set) {
            System.out.println(color);
        }
    }
}