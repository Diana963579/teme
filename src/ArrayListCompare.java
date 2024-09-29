import java.util.ArrayList;
public class ArrayListCompare {
        public static void main(String[] args) {
            ArrayList<String> colors1 = new ArrayList<>();
            colors1.add("Red");
            colors1.add("Green");
            colors1.add("Blue");

            ArrayList<String> colors2 = new ArrayList<>();
            colors2.add("Red");
            colors2.add("Green");
            colors2.add("Blue");

            boolean areEqual = colors1.equals(colors2);
            System.out.println("Are the two lists equal? " + areEqual);
        }
    }