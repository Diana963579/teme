import java.util.HashSet;
public class HashSetCompare {
        public static void main(String[] args) {
            HashSet<String> set1 = new HashSet<>();
            set1.add("Red");
            set1.add("Green");
            set1.add("Blue");

            HashSet<String> set2 = new HashSet<>();
            set2.add("Green");
            set2.add("Blue");
            set2.add("Yellow");

            set1.retainAll(set2); // Keeps only elements present in both sets
            System.out.println("Common elements: " + set1);
        }
    }