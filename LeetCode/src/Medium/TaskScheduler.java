// TaskScheduler.java
// This class implements a solution to the Task Scheduler problem.
// The goal is to schedule tasks with a given cooldown period between the same tasks.

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
    
    // Method to find the least number of intervals needed to complete all tasks
    public int leastInterval(char[] tasks, int n) {
        // Count the frequency of each task
        Map<Character, Integer> taskCount = new HashMap<>();
        for (char task : tasks) {
            taskCount.put(task, taskCount.getOrDefault(task, 0) + 1);
        }

        // Use a max heap to store the tasks based on their frequency
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(taskCount.values());

        int intervals = 0;

        // While there are tasks left to schedule
        while (!maxHeap.isEmpty()) {
            int time = 0;
            // Temporary list to hold tasks for the current cycle
            List<Integer> temp = new ArrayList<>();

            // Schedule tasks for the current cycle
            for (int i = 0; i <= n; i++) {
                if (!maxHeap.isEmpty()) {
                    temp.add(maxHeap.poll());
                    time++;
                }
            }

            // Decrease the frequency of the tasks scheduled in this cycle
            for (int count : temp) {
                if (--count > 0) {
                    maxHeap.add(count);
                }
            }

            // If there are still tasks left, we need to add idle time
            intervals += maxHeap.isEmpty() ? time : n + 1;
        }

        return intervals;
    }

    // Main method to test the TaskScheduler
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        
        // Example input
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;

        // Calculate the least number of intervals needed
        int result = scheduler.leastInterval(tasks, n);
        
        // Output the result
        System.out.println("Least intervals needed: " + result);
    }
}

// Example Output:
// Least intervals needed: 8
// Explanation: One possible way to schedule the tasks is:
// A -> B -> idle -> A -> B -> idle -> A -> B.