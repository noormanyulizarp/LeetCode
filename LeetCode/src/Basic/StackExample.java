// StackExample.java
// This class demonstrates the use of a Stack in Java.
// A Stack is a data structure that follows the Last In First Out (LIFO) principle.

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Display the Stack
        System.out.println("Stack: " + stack);

        // Pop an element from the Stack
        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Display the Stack after popping
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element of the Stack
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);

        // Get the size of the Stack
        int size = stack.size();
        System.out.println("Size of Stack: " + size);
    }
}

// Example Output:
// Stack: [First, Second, Third]
// Popped Element: Third
// Stack after pop: [First, Second]
// Top Element: Second
// Is the Stack empty? false
// Size of Stack: 2