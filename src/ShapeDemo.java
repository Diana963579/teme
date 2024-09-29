import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());

        for (Shape shape : shapes) {
            shape.draw(); // Will call the draw method of each shape
            abstract class Shape {
                abstract void draw();
            }

            class Circle extends Shape {
                @Override
                void draw() {
                    System.out.println("Drawing Circle");
                }
            }

            class Rectangle extends Shape {
                @Override
                void draw() {
                    System.out.println("Drawing Rectangle");
                }
            }
        }
    }
}