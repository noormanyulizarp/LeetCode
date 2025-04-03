// LoopExample.java
// This program demonstrates the use of different types of loops in Java: for loop, while loop, and do-while loop.

public class LoopExample {
    public static void main(String[] args) {
        // For loop example
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop example
        System.out.println("\nWhile Loop Example:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Do-while loop example
        System.out.println("\nDo-While Loop Example:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);
    }
}

// Example Output:
// For Loop Example:
// Iteration 1
// Iteration 2
// Iteration 3
// Iteration 4
// Iteration 5
//
// While Loop Example:
// Iteration 1
// Iteration 2
// Iteration 3
// Iteration 4
// Iteration 5
//
// Do-While Loop Example:
// Iteration 1
// Iteration 2
// Iteration 3
// Iteration 4
// Iteration 5

// The program demonstrates three types of loops in Java: 
// 1. For loop: Used for iterating a specific number of times.
// 2. While loop: Continues until a specified condition is false.
// 3. Do-while loop: Similar to the while loop, but it guarantees at least one execution of the loop body.