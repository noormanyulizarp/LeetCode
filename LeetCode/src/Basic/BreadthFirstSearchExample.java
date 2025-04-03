// BreadthFirstSearchExample.java
// This program demonstrates the Breadth-First Search (BFS) algorithm on a graph.
// BFS is used to traverse or search through data structures like trees and graphs.
// It explores all the neighbor nodes at the present depth prior to moving on to nodes at the next depth level.

import java.util.*;

public class BreadthFirstSearchExample {
    
    // Method to perform BFS on a graph represented as an adjacency list
    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();
        // Set to keep track of visited nodes
        Set<Integer> visited = new HashSet<>();
        
        // Start with the initial node
        queue.add(start);
        visited.add(start);
        
        System.out.println("BFS Traversal starting from node " + start + ":");
        
        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue
            int node = queue.poll();
            System.out.print(node + " ");
            
            // Get all adjacent vertices of the dequeued node
            for (int neighbor : graph.get(node)) {
                // If the neighbor hasn't been visited, mark it and enqueue it
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Create a sample graph using an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 4));
        graph.put(3, Arrays.asList(1, 5));
        graph.put(4, Arrays.asList(1, 2));
        graph.put(5, Arrays.asList(3));
        
        // Perform BFS starting from node 0
        bfs(graph, 0);
    }
}

// Example Output:
// BFS Traversal starting from node 0:
// 0 1 2 3 4 5 