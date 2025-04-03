// GenerateParentheses.java
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a method to generate all combinations of well-formed parentheses.
 */
public class GenerateParentheses {

    /**
     * Generates all combinations of n pairs of parentheses.
     *
     * @param n the number of pairs of parentheses
     * @return a list of strings representing all combinations of well-formed parentheses
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", n, n);
        return result;
    }

    /**
     * Helper method to generate parentheses using backtracking.
     *
     * @param result the list to store valid combinations
     * @param current the current combination of parentheses
     * @param open the number of open parentheses left
     * @param close the number of close parentheses left
     */
    private void generate(List<String> result, String current, int open, int close) {
        // If there are no more open and close parentheses left, add the current combination to the result
        if (open == 0 && close == 0) {
            result.add(current);
            return;
        }
        // If there are open parentheses left, add an open parenthesis
        if (open > 0) {
            generate(result, current + "(", open - 1, close);
        }
        // If there are more close parentheses left than open, add a close parenthesis
        if (close > open) {
            generate(result, current + ")", open, close - 1);
        }
    }

    /**
     * Main method to test the generateParenthesis method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        int n = 3; // Example: 3 pairs of parentheses
        List<String> combinations = gp.generateParenthesis(n);
        
        // Print the generated combinations
        System.out.println("Generated combinations of " + n + " pairs of parentheses:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}

// Example Output:
// Generated combinations of 3 pairs of parentheses:
// ((()))
// (()())
// (())()
// ()(())
// ()()()