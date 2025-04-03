// File: PathSum.java
// This class provides a solution to the Path Sum problem.
// The problem is to determine if a given binary tree has a root-to-leaf path such that adding up all the values along the path equals a given sum.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class PathSum {
    // Method to check if there is a root-to-leaf path with the given sum
    public boolean hasPathSum(TreeNode root, int sum) {
        // Base case: if the node is null, return false
        if (root == null) {
            return false;
        }
        // Check if we have reached a leaf node and the sum equals the node's value
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        // Recursively check the left and right subtrees with the updated sum
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    // Example usage
    public static void main(String[] args) {
        PathSum pathSum = new PathSum();

        // Creating a sample binary tree:
        //       5
        //      / \
        //     4   8
        //    /   / \
        //   11  13  4
        //  /  \      \
        // 7    2      1
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        // Test the hasPathSum method
        int sum = 22;
        boolean result = pathSum.hasPathSum(root, sum);
        System.out.println("Does the tree have a path sum of " + sum + "? " + result);
    }
}

// Example output:
// Does the tree have a path sum of 22? true
// Explanation: The path 5 -> 4 -> 11 -> 2 sums up to 22.