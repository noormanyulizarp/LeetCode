// ValidParenthesesChecker.java
// This class checks if a given string of parentheses is valid.
// A string is considered valid if every opening bracket has a corresponding closing bracket
// and the brackets are closed in the correct order.

import java.util.Stack;

public class ValidParenthesesChecker {
    
    // Method to check if the input string has valid parentheses
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Check for closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty or top of the stack doesn't match, return false
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        // If stack is empty, all brackets were matched; otherwise, return false
        return stack.isEmpty();
    }

    // Helper method to check if the opening and closing brackets match
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    // Main method to test the isValid function
    public static void main(String[] args) {
        // Test cases
        String test1 = "()"; // Expected output: true
        String test2 = "({[]})"; // Expected output: true
        String test3 = "(]"; // Expected output: false
        String test4 = "([)]"; // Expected output: false
        String test5 = "{[]}"; // Expected output: true

        System.out.println("Test 1: " + isValid(test1)); // true
        System.out.println("Test 2: " + isValid(test2)); // true
        System.out.println("Test 3: " + isValid(test3)); // false
        System.out.println("Test 4: " + isValid(test4)); // false
        System.out.println("Test 5: " + isValid(test5)); // true
    }
}