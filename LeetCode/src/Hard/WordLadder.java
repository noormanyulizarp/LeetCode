// WordLadder.java
import java.util.*;

public class WordLadder {
    // Function to find the length of the shortest transformation sequence from beginWord to endWord
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Convert the word list to a set for faster lookups
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0; // If endWord is not in the word list, return 0
        }

        // Queue for BFS
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int length = 1; // Start with the length of the beginWord

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                // Check all possible transformations
                for (int j = 0; j < currentWord.length(); j++) {
                    char[] wordChars = currentWord.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        wordChars[j] = c; // Change one letter at a time
                        String newWord = new String(wordChars);
                        if (newWord.equals(endWord)) {
                            return length + 1; // Found the endWord
                        }
                        if (wordSet.contains(newWord)) {
                            queue.add(newWord); // Add to queue for further exploration
                            wordSet.remove(newWord); // Remove to prevent cycles
                        }
                    }
                }
            }
            length++; // Increment the length for each level of BFS
        }
        return 0; // If no transformation is found
    }

    public static void main(String[] args) {
        // Example usage
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        int result = ladderLength(beginWord, endWord, wordList);
        System.out.println("Length of the shortest transformation sequence: " + result);
    }
}

// Example Output:
// Length of the shortest transformation sequence: 5
// Explanation: The sequence is "hit" -> "hot" -> "dot" -> "dog" -> "cog".