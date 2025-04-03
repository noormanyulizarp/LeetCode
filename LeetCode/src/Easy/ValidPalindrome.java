public class ValidPalindrome {
    public static void main(String[] args) {
        // Test cases
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        
        System.out.println("Is valid palindrome: " + isPalindrome(test1)); // Expected: true
        System.out.println("Is valid palindrome: " + isPalindrome(test2)); // Expected: false
    }

    // Function to check if a given string is a valid palindrome
    public static boolean isPalindrome(String s) {
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Check if the cleaned string is a palindrome
        String cleanedStr = cleaned.toString();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }
}