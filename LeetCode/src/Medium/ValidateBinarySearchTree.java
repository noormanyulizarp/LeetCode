// ValidateBinarySearchTree.java
// This class provides a solution to the problem of validating a binary search tree (BST).
// A binary search tree is valid if for every node, all values in the left subtree are less than the node's value,
// and all values in the right subtree are greater than the node's value.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class ValidateBinarySearchTree {
    
    // Main method to validate the binary search tree
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    // Helper method to validate the BST with value constraints
    private boolean isValidBST(TreeNode node, long min, long max) {
        // An empty tree is a valid BST
        if (node == null) {
            return true;
        }
        
        // The current node's value must be within the valid range
        if (node.val <= min || node.val >= max) {
            return false;
        }
        
        // Recursively validate the left and right subtrees
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }

    // Example usage
    public static void main(String[] args) {
        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();

        // Creating a valid BST
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        // Validate the BST
        boolean result = validator.isValidBST(root);
        System.out.println("Is the tree a valid BST? " + result); // Output: true

        // Creating an invalid BST
        TreeNode invalidRoot = new TreeNode(5);
        invalidRoot.left = new TreeNode(1);
        invalidRoot.right = new TreeNode(4);
        invalidRoot.right.left = new TreeNode(3);
        invalidRoot.right.right = new TreeNode(6);

        // Validate the invalid BST
        boolean invalidResult = validator.isValidBST(invalidRoot);
        System.out.println("Is the tree a valid BST? " + invalidResult); // Output: false
    }
}