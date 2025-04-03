// MinStack.java
// This class implements a stack that supports push, pop, top, and retrieving the minimum element in constant time.

import java.util.Stack;

class MinStack {
    // Stack to store the elements
    private Stack<Integer> stack;
    // Stack to store the minimum elements
    private Stack<Integer> minStack;

    // Constructor to initialize the stacks
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element x onto the stack
    public void push(int x) {
        stack.push(x);
        // If the minStack is empty or the current element is less than or equal to the top of minStack
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Removes the element on the top of the stack
    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        // If the popped element is the minimum, pop it from minStack as well
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }

    // Get the top element
    public int top() {
        return stack.peek();
    }

    // Retrieve the minimum element in the stack
    public int getMin() {
        return minStack.peek();
    }

    // Main method to demonstrate the MinStack functionality
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Minimum: " + minStack.getMin()); // Returns -3
        minStack.pop();
        System.out.println("Top: " + minStack.top()); // Returns 0
        System.out.println("Minimum: " + minStack.getMin()); // Returns -2
    }
}