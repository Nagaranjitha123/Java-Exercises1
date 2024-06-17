package polymorphism;

public class Calculator {
//Overloaded method to add two integers
 public int calculate(int a, int b) {
    return a + b;
}

// Overloaded method to add two double values
 public double calculate(double a, double b) {
    return a + b;
}

// Overloaded method to subtract two integers
 public int calculate(int a, int b, String operation) {
    if (operation.equals("subtract")) {
        return a - b;
    }
    return 0;
}

// Overloaded method to multiply two integers
 public int calculate(int a, int b, String operation, boolean isMultiplication) {
    if (isMultiplication) {
        return a * b;
    }
    return 0;
}
 public static void main(String[] args) {
     Calculator calc = new Calculator();

     // Test addition
     System.out.println("Addition of 5 and 3: " + calc.calculate(5, 3));
     System.out.println("Addition of 5.5 and 3.2: " + calc.calculate(5.5, 3.2));

     // Test subtraction
     System.out.println("Subtraction of 5 and 3: " + calc.calculate(5, 3, "subtract"));

     // Test multiplication
     System.out.println("Multiplication of 5 and 3: " + calc.calculate(5, 3, "multiply", true));

     
 }
}

