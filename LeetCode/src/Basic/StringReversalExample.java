// StringReversalExample.java
// This program demonstrates how to reverse a string in Java.

public class StringReversalExample {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        
        // Output the original and reversed strings
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        
        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }
}

// Example Output:
// Original String: Hello, World!
// Reversed String: !dlroW ,olleH