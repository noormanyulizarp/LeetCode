// QueueExample.java
// This class demonstrates the use of a Queue in Java.
// A Queue is a data structure that follows the First In First Out (FIFO) principle.

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Displaying the elements of the Queue
        System.out.println("Queue: " + queue);

        // Removing an element from the Queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Displaying the elements of the Queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peek at the front element of the Queue
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Displaying the final state of the Queue
        System.out.println("Final Queue: " + queue);
    }
}

// Example Output:
// Queue: [First, Second, Third]
// Removed Element: First
// Queue after removal: [Second, Third]
// Front Element: Second
// Final Queue: [Second, Third]