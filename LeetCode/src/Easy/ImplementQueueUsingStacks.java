// ImplementQueueUsingStacks.java
// This class implements a queue using two stacks.
// It provides methods to enqueue and dequeue elements, demonstrating how stacks can be used to simulate queue behavior.

import java.util.Stack;

public class ImplementQueueUsingStacks {
    private Stack<Integer> stack1; // Stack to hold the incoming elements
    private Stack<Integer> stack2; // Stack to hold the outgoing elements

    // Constructor to initialize the stacks
    public ImplementQueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Method to add an element to the queue
    public void enqueue(int x) {
        stack1.push(x); // Push the element onto stack1
    }

    // Method to remove the element from the front of the queue
    public int dequeue() {
        if (stack2.isEmpty()) { // If stack2 is empty, transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop(); // Pop the top element from stack2, which is the front of the queue
    }

    // Method to get the front element of the queue without removing it
    public int front() {
        if (stack2.isEmpty()) { // If stack2 is empty, transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek(); // Peek the top element from stack2
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty(); // The queue is empty if both stacks are empty
    }

    // Main method to demonstrate the functionality of the queue
    public static void main(String[] args) {
        ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
        
        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Front element: " + queue.front()); // Output: 1
        
        // Dequeue an element
        System.out.println("Dequeued: " + queue.dequeue()); // Output: 1
        System.out.println("Front element after dequeue: " + queue.front()); // Output: 2
        
        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
        
        // Dequeue the last element
        queue.dequeue();
        System.out.println("Is queue empty after dequeuing all elements? " + queue.isEmpty()); // Output: true
    }
}