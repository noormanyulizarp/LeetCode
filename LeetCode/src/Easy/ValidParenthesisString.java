// ValidParenthesisString.java
// This class provides a method to check if a string containing parentheses, 
// asterisks, and letters is valid. The asterisk can represent either 
// an empty string, a single opening parenthesis, or a single closing parenthesis.

public class ValidParenthesisString {

    // Method to check if the given string is a valid parenthesis string
    public static boolean checkValidString(String s) {
        int low = 0, high = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                low--;
                high--;
            } else { // c == '*'
                low--;
                high++;
            }
            if (high < 0) {
                return false; // Too many closing parentheses
            }
            low = Math.max(low, 0); // low should not be negative
        }
        return low == 0; // All parentheses must be closed
    }

    // Main method to test the checkValidString method
    public static void main(String[] args) {
        String test1 = "(*))";
        String test2 = "(*()";
        String test3 = "((*)";
        String test4 = "(*))(*";
        
        System.out.println("Test 1: " + test1 + " -> " + checkValidString(test1)); // Expected: true
        System.out.println("Test 2: " + test2 + " -> " + checkValidString(test2)); // Expected: true
        System.out.println("Test 3: " + test3 + " -> " + checkValidString(test3)); // Expected: true
        System.out.println("Test 4: " + test4 + " -> " + checkValidString(test4)); // Expected: true
    }
}