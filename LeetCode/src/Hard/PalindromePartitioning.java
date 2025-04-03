// PalindromePartitioning.java
import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    
    // Main method to test the palindrome partitioning
    public static void main(String[] args) {
        String input = "aab";
        List<List<String>> result = partition(input);
        System.out.println("Input: " + input);
        System.out.println("Palindrome Partitions: " + result);
    }

    // Method to partition the string into all possible palindrome partitions
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    // Backtracking helper method
    private static void backtrack(List<List<String>> result, List<String> tempList, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int end = start + 1; end <= s.length(); end++) {
                String substring = s.substring(start, end);
                if (isPalindrome(substring)) {
                    tempList.add(substring);
                    backtrack(result, tempList, s, end);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    // Helper method to check if a string is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Example Output:
// Input: aab
// Palindrome Partitions: [[a, a, b], [aa, b]]