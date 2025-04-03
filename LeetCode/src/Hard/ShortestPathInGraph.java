// ShortestPathInGraph.java
// This class implements a solution to find the shortest path in a graph using Dijkstra's algorithm.
// The graph is represented using an adjacency list.

import java.util.*;

public class ShortestPathInGraph {
    // Method to find the shortest path from the source node to all other nodes in the graph
    public static Map<Integer, Integer> dijkstra(int[][] graph, int source) {
        int n = graph.length; // Number of nodes in the graph
        Map<Integer, Integer> distances = new HashMap<>(); // Map to store the shortest distance from source to each node
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1])); // Min-heap to get the node with the smallest distance

        // Initialize distances to infinity and add the source node with distance 0
        for (int i = 0; i < n; i++) {
            distances.put(i, Integer.MAX_VALUE);
        }
        distances.put(source, 0);
        minHeap.add(new int[]{source, 0});

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int currentNode = current[0];
            int currentDistance = current[1];

            // If the current distance is greater than the recorded distance, skip it
            if (currentDistance > distances.get(currentNode)) {
                continue;
            }

            // Explore neighbors
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (graph[currentNode][neighbor] > 0) { // If there is an edge
                    int newDistance = currentDistance + graph[currentNode][neighbor];
                    // If a shorter path to the neighbor is found
                    if (newDistance < distances.get(neighbor)) {
                        distances.put(neighbor, newDistance);
                        minHeap.add(new int[]{neighbor, newDistance});
                    }
                }
            }
        }
        return distances; // Return the map of shortest distances
    }

    // Main method to test the Dijkstra's algorithm implementation
    public static void main(String[] args) {
        // Example graph represented as an adjacency matrix
        int[][] graph = {
            {0, 1, 4, 0, 0, 0},
            {1, 0, 2, 5, 0, 0},
            {4, 2, 0, 0, 1, 0},
            {0, 5, 0, 0, 3, 0},
            {0, 0, 1, 3, 0, 2},
            {0, 0, 0, 0, 2, 0}
        };

        int source = 0; // Starting node
        Map<Integer, Integer> shortestPaths = dijkstra(graph, source);

        // Output the shortest paths from the source node
        System.out.println("Shortest paths from node " + source + ":");
        for (Map.Entry<Integer, Integer> entry : shortestPaths.entrySet()) {
            System.out.println("Node " + entry.getKey() + " has distance " + entry.getValue());
        }
    }
}