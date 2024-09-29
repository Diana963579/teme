import java.util.HashSet;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;

public class Person {
        String name;
        private int age;
        private String job;

        public Person(String name, int age,String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

            @Override
            public String toString() {
                return name + " (" + age + ", Job: " + job + ")";
        }
    }