// ImplementStackUsingQueues.java
// This class implements a stack using two queues.
// It provides methods to push, pop, top, and check if the stack is empty.

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    // Constructor to initialize the two queues
    public ImplementStackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(int x) {
        // Always push to queue1
        queue1.offer(x);
    }

    // Remove the element on the top of the stack
    public int pop() {
        // Move all elements except the last one from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        // The last element in queue1 is the top element
        int topElement = queue1.poll();
        // Swap the names of the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topElement;
    }

    // Get the top element of the stack
    public int top() {
        // Move all elements except the last one from queue1 to queue2
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        // The last element in queue1 is the top element
        int topElement = queue1.peek();
        // Move the last element to queue2 as well
        queue2.offer(queue1.poll());
        // Swap the names of the queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topElement;
    }

    // Check if the stack is empty
    public boolean empty() {
        return queue1.isEmpty();
    }

    // Main method to demonstrate the stack functionality
    public static void main(String[] args) {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // Output: 2
        System.out.println(stack.pop());    // Output: 2
        System.out.println(stack.empty());  // Output: false
    }
}