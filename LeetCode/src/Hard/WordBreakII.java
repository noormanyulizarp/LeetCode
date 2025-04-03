// WordBreakII.java
// This class provides a solution to the Word Break II problem, which involves finding all possible 
// sentences that can be formed by breaking a given string into words from a provided dictionary.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakII {
    
    // Main function to find all possible sentences
    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> result = new ArrayList<>();
        backtrack(s, wordDict, 0, new StringBuilder(), result);
        return result;
    }

    // Helper function to perform backtracking
    private void backtrack(String s, Set<String> wordDict, int start, StringBuilder current, List<String> result) {
        if (start == s.length()) {
            result.add(current.toString().trim());
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordDict.contains(word)) {
                int lengthBefore = current.length();
                current.append(word).append(" ");
                backtrack(s, wordDict, end, current, result);
                current.setLength(lengthBefore); // backtrack
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        WordBreakII solution = new WordBreakII();
        Set<String> wordDict = new HashSet<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");

        String s = "catsanddog";
        List<String> sentences = solution.wordBreak(s, wordDict);
        
        // Output the results
        System.out.println("Possible sentences:");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}

// Example Output:
// Possible sentences:
// cats and dog
// cat sand dog