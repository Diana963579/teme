import java.util.HashSet;

public class CarDemo {
    public static void main(String[] args) {
        HashSet<Car> carSet = new HashSet<>();

        carSet.add(new Car("Toyota", "Camry", 2020, 24000));
        carSet.add(new Car("Honda", "Civic", 2019, 22000));
        carSet.add(new Car("Toyota", "Camry", 2020, 25000)); // Duplicate based on brand, model, year

        for (Car car : carSet) {
            System.out.println(car);
        }
    }
}