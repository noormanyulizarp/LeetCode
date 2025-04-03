public class PalindromeChecker {
    public static void main(String[] args) {
        // Test cases for the isPalindrome method
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";
        
        System.out.println("Is \"" + test1 + "\" a palindrome? " + isPalindrome(test1)); // true
        System.out.println("Is \"" + test2 + "\" a palindrome? " + isPalindrome(test2)); // false
        System.out.println("Is \"" + test3 + "\" a palindrome? " + isPalindrome(test3)); // true
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = cleaned.length() - 1;
        
        // Check characters from both ends towards the center
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }
}