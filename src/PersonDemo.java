import java.util.HashMap;
import java.util.Map;

public class PersonDemo {

    public static void main(String[] args) {
        Map<Integer, Person> personMap = new HashMap<>();

        personMap.put(1, new Person("Alice", 28, "Engineer"));
        personMap.put(2, new Person("Bob", 35, "Doctor"));
        personMap.put(3, new Person("Charlie", 22, "Artist"));

        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println("Person: " + entry.getValue().name);
        }
    }
}