// WordBreakII.java
// This class provides a solution to the Word Break II problem.
// Given a string s and a dictionary of strings wordDict, 
// this method returns all possible sentences that can be formed 
// by concatenating words from the dictionary.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakII {
    
    // Main method to find all possible sentences
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        List<String> result = new ArrayList<>();
        backtrack(s, wordSet, result, "", 0);
        return result;
    }

    // Helper method for backtracking
    private void backtrack(String s, Set<String> wordSet, List<String> result, String currentSentence, int start) {
        if (start == s.length()) {
            result.add(currentSentence.trim());
            return;
        }
        
        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordSet.contains(word)) {
                backtrack(s, wordSet, result, currentSentence + " " + word, end);
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        WordBreakII solution = new WordBreakII();
        String s = "catsanddog";
        List<String> wordDict = List.of("cat", "cats", "and", "sand", "dog");
        
        List<String> sentences = solution.wordBreak(s, wordDict);
        System.out.println("Possible sentences: " + sentences);
    }
}

// Example Output:
// Possible sentences: [cats and dog, cat sand dog]