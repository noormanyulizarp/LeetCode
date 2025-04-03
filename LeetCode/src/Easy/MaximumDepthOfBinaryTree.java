// MaximumDepthOfBinaryTree.java
// This class provides a solution to find the maximum depth of a binary tree.
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaximumDepthOfBinaryTree {
    
    // Method to calculate the maximum depth of the binary tree
    public int maxDepth(TreeNode root) {
        // Base case: if the tree is empty, the depth is 0
        if (root == null) {
            return 0;
        }
        // Recursively find the depth of the left and right subtrees and take the maximum
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    // Main method to test the maxDepth function
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree tree = new MaximumDepthOfBinaryTree();
        
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        // Calculating the maximum depth
        int depth = tree.maxDepth(root);
        
        // Output the result
        System.out.println("Maximum Depth of the Binary Tree: " + depth);
    }
}

// Example Output:
// Maximum Depth of the Binary Tree: 3
// Explanation: The longest path from the root (1) to the leaf nodes (4 or 5) has 3 nodes.