public class LongestValidParentheses {
    // This method calculates the length of the longest valid parentheses substring
    public static int longestValidParentheses(String s) {
        int maxLength = 0;
        int lastInvalid = -1; // Index of the last invalid parentheses

        // Stack to keep track of the indices of the opening parentheses
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '(') {
                // Push the index of the opening parenthesis onto the stack
                stack.push(i);
            } else {
                // If we encounter a closing parenthesis
                if (stack.isEmpty()) {
                    // If the stack is empty, we have an invalid closing parenthesis
                    lastInvalid = i; // Update the last invalid index
                } else {
                    // Pop the last opening parenthesis index
                    stack.pop();
                    if (stack.isEmpty()) {
                        // If the stack is empty, calculate the length from the last invalid index
                        maxLength = Math.max(maxLength, i - lastInvalid);
                    } else {
                        // Calculate the length from the last unmatched opening parenthesis
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                }
            }
        }
        return maxLength; // Return the maximum length found
    }

    public static void main(String[] args) {
        // Example test cases
        String test1 = "(()";
        String test2 = ")()())";
        String test3 = "";
        String test4 = "()(())";

        System.out.println("Longest valid parentheses in \"" + test1 + "\": " + longestValidParentheses(test1)); // Output: 2
        System.out.println("Longest valid parentheses in \"" + test2 + "\": " + longestValidParentheses(test2)); // Output: 4
        System.out.println("Longest valid parentheses in \"" + test3 + "\": " + longestValidParentheses(test3)); // Output: 0
        System.out.println("Longest valid parentheses in \"" + test4 + "\": " + longestValidParentheses(test4)); // Output: 6
    }
}