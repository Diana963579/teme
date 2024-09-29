import java.util.ArrayList;
public class ArrayListJoin {
        public static void main(String[] args) {
            ArrayList<String> colors1 = new ArrayList<>();
            colors1.add("Red");
            colors1.add("Green");

            ArrayList<String> colors2 = new ArrayList<>();
            colors2.add("Blue");
            colors2.add("Yellow");

            colors1.addAll(colors2);
            System.out.println("Joined list: " + colors1);
        }
    }
