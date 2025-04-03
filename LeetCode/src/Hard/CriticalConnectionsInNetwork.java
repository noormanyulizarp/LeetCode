// This Java program finds all critical connections in a network represented as a graph.
// A critical connection is an edge that, when removed, increases the number of connected components in the graph.

import java.util.ArrayList;
import java.util.List;

public class CriticalConnectionsInNetwork {
    private int time = 0; // Timer for DFS
    private List<List<Integer>> result = new ArrayList<>(); // To store the critical connections
    private List<List<Integer>> graph; // Adjacency list representation of the graph
    private int[] low; // Low-link values
    private int[] disc; // Discovery times of visited vertices
    private boolean[] visited; // Visited array

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        // Initialize the graph
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (List<Integer> connection : connections) {
            graph.get(connection.get(0)).add(connection.get(1));
            graph.get(connection.get(1)).add(connection.get(0));
        }

        // Initialize arrays
        low = new int[n];
        disc = new int[n];
        visited = new boolean[n];

        // Start DFS from the first node
        dfs(0, -1);

        return result;
    }

    private void dfs(int u, int parent) {
        visited[u] = true;
        disc[u] = low[u] = ++time; // Initialize discovery time and low value

        for (int v : graph.get(u)) {
            if (v == parent) continue; // Skip the parent node

            if (!visited[v]) {
                dfs(v, u); // Recur for DFS

                // Check if the subtree rooted at v has a connection back to one of the ancestors of u
                low[u] = Math.min(low[u], low[v]);

                // If the lowest vertex reachable from subtree under v is below u in DFS tree, then u-v is a critical connection
                if (low[v] > disc[u]) {
                    result.add(List.of(u, v));
                }
            } else {
                // Update low value of u for parent function calls
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        CriticalConnectionsInNetwork solution = new CriticalConnectionsInNetwork();
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(List.of(0, 1));
        connections.add(List.of(1, 2));
        connections.add(List.of(2, 0));
        connections.add(List.of(1, 3));

        List<List<Integer>> criticalConnections = solution.criticalConnections(4, connections);
        System.out.println("Critical Connections: " + criticalConnections);
    }
}

// Example Output:
// Critical Connections: [[1, 3]]