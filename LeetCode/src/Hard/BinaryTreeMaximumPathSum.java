// BinaryTreeMaximumPathSum.java
// This class provides a solution to the problem of finding the maximum path sum in a binary tree.
// A path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
// The path must contain at least one node and does not need to go through the root.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeMaximumPathSum {
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        calculateMaxPath(root);
        return maxSum;
    }

    private int calculateMaxPath(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Calculate the maximum path sum of left and right subtrees
        int leftMax = Math.max(calculateMaxPath(node.left), 0); // Ignore negative paths
        int rightMax = Math.max(calculateMaxPath(node.right), 0); // Ignore negative paths

        // Update the maximum path sum found so far
        maxSum = Math.max(maxSum, node.val + leftMax + rightMax);

        // Return the maximum path sum "starting" from this node
        return node.val + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        // Example usage:
        BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();

        // Constructing the binary tree:
        //        -10
        //        /  \
        //       9   20
        //          /  \
        //         15   7
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Calculating the maximum path sum
        int result = solution.maxPathSum(root);
        System.out.println("Maximum Path Sum: " + result); // Output: 42
    }
}