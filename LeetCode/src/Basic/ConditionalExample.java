// ConditionalExample.java
// This program demonstrates the use of conditional statements in Java.
// It includes examples of if-else statements and switch-case statements.

public class ConditionalExample {
    public static void main(String[] args) {
        // Example of if-else statement
        int number = 10;

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Example of switch-case statement
        String day = "Wednesday";

        // Determine the type of day
        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println(day + " is a weekday.");
            case "Saturday", "Sunday" -> 
                System.out.println(day + " is a weekend.");
            default -> 
                System.out.println(day + " is not a valid day.");
        }
    }
}

// Example Output:
// 10 is even.
// Wednesday is a weekday.