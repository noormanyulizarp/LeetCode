// UniqueBinarySearchTrees.java
// This class provides a solution to the problem of counting the number of unique binary search trees (BSTs) that can be formed with 'n' distinct nodes.
// The solution uses dynamic programming to build up the number of unique trees for each count of nodes from 0 to n.

public class UniqueBinarySearchTrees {
    
    // Method to calculate the number of unique BSTs that can be formed with 'n' nodes
    public int numTrees(int n) {
        // Array to store the number of unique BSTs for each count of nodes
        int[] dp = new int[n + 1];
        
        // Base case: There is one unique BST for 0 nodes and one for 1 node
        dp[0] = 1;
        dp[1] = 1;

        // Fill the dp array using the formula:
        // dp[i] = sum of dp[j] * dp[i - 1 - j] for j from 0 to i - 1
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }
        
        // The result for 'n' nodes will be in dp[n]
        return dp[n];
    }

    // Main method to test the numTrees function
    public static void main(String[] args) {
        UniqueBinarySearchTrees solution = new UniqueBinarySearchTrees();
        
        // Example: Calculate the number of unique BSTs for n = 3
        int n = 3;
        int result = solution.numTrees(n);
        
        // Output the result
        System.out.println("Number of unique BSTs that can be formed with " + n + " nodes: " + result);
    }
}

// Example Output:
// Number of unique BSTs that can be formed with 3 nodes: 5
// Explanation: The unique BSTs that can be formed with 3 nodes (1, 2, 3) are:
// 1.    1         2     3
//      / \       / \   /
//     2   3     1   3 1
//    /         \       \
//   3           2       2
// 2.    3         1     2
//      / \       / \   /
//     1   2     2   1 3
//    /         \       \
//   2           3       1
// 3.    2         1     3
//      / \       / \   /
//     1   3     2   1 2
//    /         \       \
//   3           2       1
// 4.    1         2     3
//      / \       / \   /
//     2   3     1   3 1
//    /         \       \
//   3           2       2
// 5.    3         1     2
//      / \       / \   /
//     1   2     2   1 3
//    /         \       \
//   2           3       1