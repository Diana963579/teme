import java.util.HashSet;

public class CustomHashSet {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("John", 25, "Accountant"));
        people.add(new Person("Jane", 30, "Buyer"));
        people.add(new Person("John", 25, "Lawyer")); // Duplicate

        System.out.println("HashSet: " + people);
    }
}