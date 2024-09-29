import java.util.ArrayList;

public class ArrayListClone {
        public static void main(String[] args) {
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");

            ArrayList<String> clonedList = (ArrayList<String>) colors.clone();
            System.out.println("Cloned list: " + clonedList);
        }
    }