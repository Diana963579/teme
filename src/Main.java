import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //SESIUNEA 18
        //1. Create a Runnable that prints "Hello, World!" using a lambda expression.
        //2. Create a Comparator<String> using a lambda expression that compares strings based on their length.
        //3. Create a Function<String, Integer> using a lambda expression that takes a string and returns its length.
        //4. Create a BiPredicate<String, String> using a lambda expression that tests whether the first string is longer than the second string.
        //5. Create a UnaryOperator<Integer> using a lambda expression that squares an integer.
        //6. Create a BinaryOperator<Integer> using a lambda expression that adds two integers.
        //7. Given a list of strings, use a lambda expression to sort the list in reverse alphabetical order.

        //1. Given a list of strings, write a stream pipeline that converts all the strings to uppercase and collects them into a new list.
        //2. Given a list of integers, write a stream pipeline that filters out the even numbers and then squares the remaining numbers.
        //3. Given a list of integers, write a stream pipeline that finds the maximum value.
        //4. Given a list of integers, write a stream pipeline that calculates the sum of all the integers.
        //5. Given a list of integers, write a stream pipeline that removes duplicates and collects the unique integers into a list.
        //1
        Runnable runnable = () -> System.out.println("Hello, World!");
        runnable.run();

        //2
        Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        //3
        Function<String, Integer> stringLengthFunction = s -> s.length();

        //4
        BiPredicate<String, String> isFirstStringLonger = (s1, s2) -> s1.length() > s2.length();

        //5
        UnaryOperator<Integer> squareFunction = x -> x * x;

        //6
        BinaryOperator<Integer> addFunction = (x, y) -> x + y;

        //7
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        strings.sort((s1, s2) -> s2.compareTo(s1));
// Output: [cherry, banana, apple]

//1
        List<String> uppercasedStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
// Output: [APPLE, BANANA, CHERRY]

//2
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oddSquaredNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
// Output: [1, 9, 25]

//3
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
// Output: Optional[5]

//4
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
// Output: 15

//5
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
// Output: [1, 2, 3, 4, 5]


        // SESIUNEA 11

        //1. Suma elementelor de pe diagonala principala si cea secundara;
        //2. Verificarea daca un array este monotonic (daca elementele sale sunt fie in ordine crescatoare, sau descrescatoare);
        //3. Gasirea celui mai lung cuvant intr-un sir de caractere;
        //4. Eliminarea caracterelor duplicate dintr-un sir de caractere;
        //5. Continuarea exercitiului din clasa cu Circle si Rectangle. Problema era cu o clasa abstracta Shape, iar in main sa putem observa ce printeaza metodele in functie de tipul instantei.

//1
        //A SE VEDEA CLASA MatrixSum
//2
        //A SE VEDEA CLASA MonotonicArray
//3
        //A SE VEDEA CLASA LongestWord
//4
        //A SE VEDEA CLASA RemoveDuplicates
//5
        //A SE VEDEA CLASA Shape

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

    //SESIUNEA 12

        // ArrayList Homework
       // 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.
        //2. Write a Java program to iterate through all elements in an array list.
        //3. Write a Java program to insert an element into the array list at the first position.
        //4. Write a Java program to remove the third element from an array list.
        //5. Write a Java program to search an element in an array list.
        //6. Write a Java program to sort a given array list.
        //7. Write a Java program that swaps two elements in an array list.
        //8. Write a Java program to join two array lists.
        //9. Write a Java program to clone an array list to another array list.
        //10. Write a Java program to reverse elements in an array list.
        //11. Write a Java program to extract a portion of an array list.
        //12. Write a Java program to compare two array lists.

// LinkedList Homework
        //1. Write a Java program to append the specified element to the end of a linked list.
        //2. Write a Java program to insert the specified element at the front of a linked list.
        //3. Write a Java program to insert some elements at the specified position into a linked list.
        //4. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        //5. Write a Java program to display the elements and their positions in a linked list.
        //6. Write a Java program to remove a specified element from a linked list.

// HashSet Homework
        //1. Write a Java program to append the specified element to the end of a hash set.
        //2. Create a custom class and override equals() and hashCode() methods. Create a hash set and store objects of the class in it.
        //3. Write a Java program to iterate through all elements in a hash list.
        //4. Write a Java program to get the number of elements in a hash set.
        //5. Write a Java program to empty a hash set.
        //6. Write a Java program to compare two sets and retain elements that are the same.

//1
   // A SE VEDEA CLASA ArrayListExample
//2
// A SE VEDEA CLASA ArrayListIteration
//3
// A SE VEDEA CLASA ArrayListInsert
//4
// A SE VEDEA CLASA ArrayListRemove
//5
// A SE VEDEA CLASA ArrayListSearch
//6
// A SE VEDEA CLASA ArrayListSort
//7
// A SE VEDEA CLASA ArrayListSwap
//8
// A SE VEDEA CLASA ArrayListJoin
//9
// A SE VEDEA CLASA ArrayListClone
//10
// A SE VEDEA CLASA ArrayListReserve
//11
// A SE VEDEA CLASA ArrayListExtract
//12
// A SE VEDEA CLASA ArrayListCompare
//1
// A SE VEDEA CLASA LinkedListAppend
//2
// A SE VEDEA CLASA LinkedListInsertFront
//3
// A SE VEDEA CLASA LinkedListInsertAPosition
//4
// A SE VEDEA CLASA LinkedListFisrtLastOcc
//5
// A SE VEDEA CLASA LinkedListDisplayElements
//6
// A SE VEDEA CLASA LinkedListRemoveElements
//1
// A SE VEDEA CLASA HashSetAppend
//2
// A SE VEDEA CLASA Person SI CustomHashSet
//3
// A SE VEDEA CLASA HashSetIteration
//4
// A SE VEDEA CLASA HashSetSize
//5
// A SE VEDEA CLASA HashSetClear
//6
// A SE VEDEA CLASA HashSetCompare

//SESIUNEA 13

        //1. Create two classes called Circle and Rectangle which extend a Shape abstract class.
        //Shape abstract class has a method called draw() which is implemented by Circle and Rectangle classes.
        //The draw method in Circle class should print “Drawing Circle” and draw method in Rectangle class should print “Drawing Rectangle”.
        //Please write a program to create a Shape list which can hold Circle and Rectangle objects, then iterate through the list and call draw method on each object.

        //2. Create a class Car with the following properties: String brand; String model; int year; double price.
        //Adapt the Car class to be able to add only unique cars in a HashSet.
        //The rules for equality are the following: two cars are equal if they have the same brand, model and year.

        //3. Create c class Runner with the following properties: String name; int age; int speed.
        //Adapt the Runner class to be able to add only unique runners in a TreeSet, ordered by speed.

        //4. Create a class called Person with the following properties: String name; int age; String job.
        //Create multiple instances of type Person and add them to a Map (the key can be an integer).
        //Please iterate over the map and print the name of each person.

//1
// A SE VEDEA CLASA ShapeDemo
//2
// A SE VEDEA CLASA Car SI CarDemo
//3
// A SE VEDEA CLASA Runner SI RunnerDemo
//4
// A SE VEDEA CLASA Person SI PersonDemo

//SECTIUNEA 14-15

        //1. Design an interface Machine that includes methods print(), scan(), and fax(). Create classes Printer, Scanner, and FaxMachine that implement this interface. Refactor the design to follow the Interface Segregation Principle.
        //2. Create a superclass Bird with a method fly(). Then, create subclasses Sparrow and Penguin. Demonstrate a violation of the Liskov Substitution Principle and refactor the design to comply with LSP.
        //3. Create a class Shape with methods draw() and resize(). Create subclasses Circle, Square, and Triangle. Demonstrate a violation of the Open/Closed Principle and refactor the design to comply with OCP.
        //4. Create a generic method that takes an array of numbers and returns the maximum value. Use bounded type parameters to ensure the method works with any subclass of Number
        //5. Create a generic class Pair that holds two objects of different types. Implement methods to get and set the values of these objects.
        //6. Create a utility class with a generic method swap that swaps two elements in an array. Ensure the method can work with any type of array.
        //7. Create a method printShapes that takes a list of elements that extend a Shape class and calls the draw() method on each element.
        //8. Create a generic class Triple that can hold three objects of any types. Implement methods to get and set the values of these objects.
        //9. Define an enum TrafficLight with constants RED, YELLOW, and GREEN. Write a method that takes a TrafficLight value and returns the duration for which the light stays on.
        //10. Create an enum Season with constants WINTER, SPRING, SUMMER, and FALL. Add a field for average temperature and a method to get the average temperature for each season.
        //11. Define an enum Operation with constants ADD, SUBTRACT, MULTIPLY, and DIVIDE. Implement an abstract method apply in the enum that performs the respective operation on two operands.
        //12. Create an enum Day with constants for all days of the week. Use EnumSet to create a set of weekdays and a set of weekends. Write a method that prints the days in each set.
        //13. Define an enum Level with constants LOW, MEDIUM, HIGH. Use EnumMap to map each level to a specific action (e.g., LOW -> "Low action"). Write a method that prints the action for each level.
//1
// A FOST FACUT LA CURS
//2
// A FOST FACUT LA CURS
//3
// A SE VEDEA CLASA Shape
//4
// A SE VEDEA CLASA GenericMax
//5
// A SE VEDEA CLASA Pair
//6
// A SE VEDEA CLASA ArrayUtil
//7
// A SE VEDEA CLASA Shape
//8
// A SE VEDEA CLASA Triple
//9
// A SE VEDEA ENUM TrafficLight
//10
// A SE VEDEA ENUM Season
//11
// A SE VEDEA ENUM Operation
//12
// A SE VEDEA ENUM Day SI CLASA DaySets
//13
// A SE VEDEA ENUM Level SI CLASA LevelAction

    }
}