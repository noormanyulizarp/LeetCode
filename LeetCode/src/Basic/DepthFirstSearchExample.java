// DepthFirstSearchExample.java
// This example demonstrates the Depth First Search (DFS) algorithm on a graph.
// DFS is a traversal algorithm that explores as far as possible along each branch before backtracking.

import java.util.*;

public class DepthFirstSearchExample {
    
    // Method to perform DFS on a graph
    public void depthFirstSearch(int vertex, boolean[] visited, List<List<Integer>> adjacencyList) {
        // Mark the current vertex as visited
        visited[vertex] = true;
        System.out.print(vertex + " "); // Print the visited vertex

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                depthFirstSearch(neighbor, visited, adjacencyList);
            }
        }
    }

    public static void main(String[] args) {
        // Create a graph using an adjacency list
        int numberOfVertices = 5;
        List<List<Integer>> adjacencyList = new ArrayList<>(numberOfVertices);
        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // Adding edges to the graph
        adjacencyList.get(0).add(1);
        adjacencyList.get(0).add(2);
        adjacencyList.get(1).add(3);
        adjacencyList.get(1).add(4);
        adjacencyList.get(2).add(4);

        // Create an instance of the DFS example
        DepthFirstSearchExample dfsExample = new DepthFirstSearchExample();
        
        // Array to keep track of visited vertices
        boolean[] visited = new boolean[numberOfVertices];

        // Perform DFS starting from vertex 0
        System.out.println("Depth First Search starting from vertex 0:");
        dfsExample.depthFirstSearch(0, visited, adjacencyList);
    }
}

// Example Output:
// Depth First Search starting from vertex 0:
// 0 1 3 4 2 