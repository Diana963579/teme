import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort {
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Blue");
            colors.add("Red");
            colors.add("Green");

            Collections.sort(colors);
            System.out.println("Sorted list: " + colors);
        }
    }