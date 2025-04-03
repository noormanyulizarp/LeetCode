public class ValidAnagram {
    // This method checks if two strings are anagrams of each other.
    public static boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to count the frequency of each character
        int[] count = new int[26]; // Assuming only lowercase letters a-z

        // Count the characters in the first string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Subtract the count based on the second string
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
            // If the count goes negative, t has more of that character
            if (count[c - 'a'] < 0) {
                return false;
            }
        }

        // If all counts are zero, then they are anagrams
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + isAnagram(s1, s2));

        String s3 = "rat";
        String s4 = "car";
        System.out.println("Are '" + s3 + "' and '" + s4 + "' anagrams? " + isAnagram(s3, s4));
    }
} 

/*
Example Output:
Are 'anagram' and 'nagaram' anagrams? true
Are 'rat' and 'car' anagrams? false
*/