import java.util.ArrayList;
import java.util.Collections;
public class ArrayListReserve {
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");

            Collections.reverse(colors);
            System.out.println("Reversed list: " + colors);
        }
    }