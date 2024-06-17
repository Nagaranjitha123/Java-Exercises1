package inheritance;

class Shape {
    public double calculateArea() {
        return 0.0; // Default implementation for unknown shapes
    }
}

// Subclass 1
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass 2
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) { // Fix the missing arguments in constructor
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Subclass 3
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Creating objects of Circle, Rectangle, and Triangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0); // Provide both length and width
        Triangle triangle = new Triangle(6.0, 8.0);

        // Now you can call calculateArea() on each object polymorphically
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}
