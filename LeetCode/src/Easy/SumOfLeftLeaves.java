// SumOfLeftLeaves.java
// This class contains a method to calculate the sum of all left leaves in a binary tree.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SumOfLeftLeaves {
    
    // Method to calculate the sum of left leaves
    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeftLeaves(root, false);
    }

    // Helper method to traverse the tree
    private int sumLeftLeaves(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        // If it's a leaf node and it's a left leaf
        if (node.left == null && node.right == null && isLeft) {
            return node.val;
        }
        // Recursively sum left leaves in both subtrees
        return sumLeftLeaves(node.left, true) + sumLeftLeaves(node.right, false);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        SumOfLeftLeaves solution = new SumOfLeftLeaves();

        // Creating a sample binary tree:
        //        3
        //       / \
        //      9   20
        //         /  \
        //        15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Calculating the sum of left leaves
        int result = solution.sumOfLeftLeaves(root);
        System.out.println("Sum of left leaves: " + result); // Output: 24 (9 + 15)
    }
}