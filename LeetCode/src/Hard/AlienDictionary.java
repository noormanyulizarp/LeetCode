// AlienDictionary.java
// This program determines the order of characters in an alien language based on a given dictionary of words.

import java.util.*;

public class AlienDictionary {
    
    // Function to find the order of characters in the alien language
    public static String findOrder(String[] words, int n, int alpha) {
        // Create a graph to represent the character order
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < alpha; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Build the graph based on the given words
        for (int i = 0; i < n - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int minLength = Math.min(word1.length(), word2.length());
            for (int j = 0; j < minLength; j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    graph.get(word1.charAt(j) - 'a').add(word2.charAt(j) - 'a');
                    break;
                }
            }
        }
        
        // Perform topological sort to find the order of characters
        int[] inDegree = new int[alpha];
        for (List<Integer> neighbors : graph) {
            for (int neighbor : neighbors) {
                inDegree[neighbor]++;
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < alpha; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        StringBuilder order = new StringBuilder();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            order.append((char) (current + 'a'));
            for (int neighbor : graph.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        
        // If the order length is less than the number of characters, there is a cycle
        return order.length() == alpha ? order.toString() : "";
    }
    
    // Main method to test the function
    public static void main(String[] args) {
        String[] words = {"caa", "aaa", "aab"};
        int n = words.length;
        int alpha = 3; // Number of unique characters (a, b, c)
        
        String order = findOrder(words, n, alpha);
        System.out.println("The order of characters in the alien language is: " + order);
    }
}

// Example Output:
// The order of characters in the alien language is: cab

// Explanation:
// The function constructs a directed graph based on the order of characters from the given words.
// It then performs a topological sort to determine the order of characters in the alien language.