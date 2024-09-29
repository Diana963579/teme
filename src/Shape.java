import java.util.List;

public abstract class Shape {
        public abstract double calculateArea();
        public abstract double calculatePerimeter();

    public void draw() {
        System.out.println("Drawing shape...");
    }
    public void resize() {
        System.out.println("Resizing shape...");
    }
}


    // Clasa Circle extinde Shape
    class Circle extends Shape {

        @Override
        public void draw() {
            System.out.println("Drawing Circle...");
        }
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle() {

        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // Clasa Rectangle extinde Shape
    class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public Rectangle() {

        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * (length + width);
        }

        class Square extends Shape {
            @Override
            public double calculateArea() {
                return 0;
            }

            @Override
            public double calculatePerimeter() {
                return 0;
            }

            @Override
            public void draw() {
                System.out.println("Drawing Square...");
            }
        }

        class Triangle extends Shape {
            @Override
            public double calculateArea() {
                return 0;
            }

            @Override
            public double calculatePerimeter() {
                return 0;
            }

            @Override
            public void draw() {
                System.out.println("Drawing Triangle...");
            }
        }

        public class ShapePrinter {
            public static void printShapes(List<? extends Shape> shapes) {
                for (Shape shape : shapes) {
                    shape.draw();
                }
            }

        }
    }