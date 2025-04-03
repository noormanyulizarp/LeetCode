// GraphTraversalExample.java
// This example demonstrates basic graph traversal techniques using Depth-First Search (DFS) and Breadth-First Search (BFS).

import java.util.*;

public class GraphTraversalExample {
    
    // A method to perform Depth-First Search (DFS)
    public void depthFirstSearch(int start, Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfsHelper(start, graph, visited);
        System.out.println();
    }

    // Helper method for DFS
    private void dfsHelper(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (visited.contains(node)) return;
        visited.add(node);
        System.out.print(node + " ");
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            dfsHelper(neighbor, graph, visited);
        }
    }

    // A method to perform Breadth-First Search (BFS)
    public void breadthFirstSearch(int start, Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        System.out.print("BFS Traversal: ");
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Main method to demonstrate the graph traversal
    public static void main(String[] args) {
        GraphTraversalExample graphTraversal = new GraphTraversalExample();
        
        // Creating a sample graph using an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(2, 4));

        // Performing DFS and BFS
        graphTraversal.depthFirstSearch(0, graph);
        graphTraversal.breadthFirstSearch(0, graph);
    }
}

// Example Output:
// DFS Traversal: 0 1 3 4 5 2 
// BFS Traversal: 0 1 2 3 4 5 