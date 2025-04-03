// CourseSchedule.java
// This class implements a solution to the Course Schedule problem using Depth First Search (DFS).
// The problem is to determine if you can finish all courses given the prerequisites.

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    
    // Method to determine if all courses can be finished
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Build the graph
        for (int[] prereq : prerequisites) {
            graph.get(prereq[1]).add(prereq[0]);
        }
        
        boolean[] visited = new boolean[numCourses];
        boolean[] onPath = new boolean[numCourses];
        
        // Check for cycles in the graph
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i] && hasCycle(graph, visited, onPath, i)) {
                return false; // Cycle detected
            }
        }
        
        return true; // No cycles detected
    }
    
    // Helper method to perform DFS and detect cycles
    private boolean hasCycle(List<List<Integer>> graph, boolean[] visited, boolean[] onPath, int node) {
        visited[node] = true;
        onPath[node] = true;
        
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (hasCycle(graph, visited, onPath, neighbor)) {
                    return true; // Cycle detected
                }
            } else if (onPath[neighbor]) {
                return true; // Cycle detected
            }
        }
        
        onPath[node] = false; // Backtrack
        return false;
    }
    
    // Main method to test the functionality
    public static void main(String[] args) {
        CourseSchedule cs = new CourseSchedule();
        
        // Example 1
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println("Can finish all courses (Example 1): " + cs.canFinish(numCourses1, prerequisites1)); // Output: true
        
        // Example 2
        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println("Can finish all courses (Example 2): " + cs.canFinish(numCourses2, prerequisites2)); // Output: false
    }
}