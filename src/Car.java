import java.util.HashSet;
import java.util.Objects;

public class Car {
        String brand;
        String model;
        int year;
        double price;

        public Car(String brand, String model, int year, double price) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand, model, year);
        }

        @Override
        public String toString() {
            return brand + " " + model + " (" + year + ")";
        }
    }