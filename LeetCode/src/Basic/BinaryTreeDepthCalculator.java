// BinaryTreeDepthCalculator.java
// This class calculates the depth of a binary tree.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class BinaryTreeDepthCalculator {

    // Method to calculate the depth of a binary tree
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // Base case: if the tree is empty, depth is 0
        } else {
            // Recursively find the depth of the left and right subtrees
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            // Return the larger depth plus one for the current node
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    // Main method to test the maxDepth function
    public static void main(String[] args) {
        BinaryTreeDepthCalculator calculator = new BinaryTreeDepthCalculator();

        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calculate the depth of the binary tree
        int depth = calculator.maxDepth(root);
        System.out.println("The maximum depth of the binary tree is: " + depth);
    }
}

// Example Output:
// The maximum depth of the binary tree is: 3
// Explanation: The tree has three levels, hence the maximum depth is 3.