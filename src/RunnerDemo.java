import java.util.TreeSet;
public class RunnerDemo {
    public static void main(String[] args) {
        TreeSet<Runner> runners = new TreeSet<>();

        runners.add(new Runner("John", 25, 15));
        runners.add(new Runner("Emily", 23, 18));
        runners.add(new Runner("Bob", 30, 15)); // Duplicate speed, won't be added

        for (Runner runner : runners) {
            System.out.println(runner);
        }
    }
}