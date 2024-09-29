import java.util.TreeSet;

public class Runner implements Comparable<Runner> {
        String name;
        int age;
        int speed;

        public Runner(String name, int age, int speed) {
            this.name = name;
            this.age = age;
            this.speed = speed;
        }

        @Override
        public int compareTo(Runner other) {
            return Integer.compare(this.speed, other.speed); // Order by speed
        }

        @Override
        public String toString() {
            return name + " (" + age + " years old, Speed: " + speed + ")";
        }
    }