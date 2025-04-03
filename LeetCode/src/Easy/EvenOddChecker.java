// EvenOddChecker.java
// This program checks if a number is even or odd and prints the result.

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        scanner.close();
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

// Example Output:
// Enter an integer: 5
// 5 is odd.