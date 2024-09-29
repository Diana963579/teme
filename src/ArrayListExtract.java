import java.util.ArrayList;
import java.util.List;

public class ArrayListExtract {
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");

            List<String> subList = colors.subList(1, 3); // Extracts elements from index 1 to 2 (exclusive 3)
            System.out.println("Sublist: " + subList);
        }
    }