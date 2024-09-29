
import java.util.LinkedHashSet;
public class RemoveDuplicates {

        public static String removeDuplicates(String str) {
            LinkedHashSet<Character> set = new LinkedHashSet<>();

            for (char c : str.toCharArray()) {
                set.add(c);
            }

            StringBuilder sb = new StringBuilder();
            for (Character ch : set) {
                sb.append(ch);
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            String input = "caractere";
            System.out.println("Fără duplicate: " + removeDuplicates(input)); // Output: "carte"
        }
    }
