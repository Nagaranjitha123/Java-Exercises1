package polymorphism;

import java.lang.Math;

public class GeometryCalculator {

  // Method to calculate area of a circle
  public double calculateAreaCircle(double radius) {
    return Math.PI * radius * radius;
  }

  // Method to calculate area of a rectangle
  public double calculateAreaRectangle(double length, double width) {
    return length * width;
  }

  // Method to calculate area of a square (can reuse rectangle method)
  public double calculateAreaSquare(double side) {
    return calculateAreaRectangle(side, side); // Reuse rectangle calculation
  }

  // Method to calculate area of a triangle
  public double calculateAreaTriangle(double height, double base) {
    return 0.5 * height * base;
  }

  public static void main(String[] args) {
    GeometryCalculator obj = new GeometryCalculator();

    double circleArea = obj.calculateAreaCircle(123456);
    double rectangleArea1 = obj.calculateAreaRectangle(123, 456);
    double rectangleArea2 = obj.calculateAreaRectangle(12, 56);
    double squareArea = obj.calculateAreaSquare(12);
    double triangleArea = obj.calculateAreaTriangle(12, 6);

    System.out.println("Area of circle: " + circleArea);
    System.out.println("Area of rectangle (123, 456): " + rectangleArea1);
    System.out.println("Area of rectangle (12, 56): " + rectangleArea2);
    System.out.println("Area of square: " + squareArea);
    System.out.println("Area of triangle: "  + triangleArea);
  }
}