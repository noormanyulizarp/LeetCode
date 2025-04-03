// JavaFundamentalsExample.java
// This file contains basic Java programming examples to demonstrate fundamental concepts.

public class JavaFundamentalsExample {

    public static void main(String[] args) {
        // Example 1: Hello World
        System.out.println("Hello, World!");

        // Example 2: Arithmetic Operations
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b)); // Output: 15
        System.out.println("Subtraction: " + (a - b)); // Output: 5
        System.out.println("Multiplication: " + (a * b)); // Output: 50
        System.out.println("Division: " + (a / b)); // Output: 2

        // Example 3: Conditional Statement
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is less than or equal to " + b);
        }

        // Example 4: Loop Example
        System.out.print("Counting from 1 to 5: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " "); // Output: 1 2 3 4 5
        }
        System.out.println();

        // Example 5: Array Example
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " "); // Output: 1 2 3 4 5
        }
        System.out.println();
    }
}