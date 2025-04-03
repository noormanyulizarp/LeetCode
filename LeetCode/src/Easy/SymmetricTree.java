// SymmetricTree.java
// This class checks if a binary tree is symmetric around its center.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SymmetricTree {
    
    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating a symmetric tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        // Checking if the tree is symmetric
        System.out.println("Is the tree symmetric? " + isSymmetric(root)); // Expected output: true

        // Creating a non-symmetric tree
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(3);
        root2.right.right = new TreeNode(3);

        // Checking if the tree is symmetric
        System.out.println("Is the tree symmetric? " + isSymmetric(root2)); // Expected output: false
    }

    // Function to check if a tree is symmetric
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    // Helper function to check if two trees are mirrors of each other
    private static boolean isMirror(TreeNode t1, TreeNode t2) {
        // If both nodes are null, they are symmetric
        if (t1 == null && t2 == null) {
            return true;
        }
        // If one of the nodes is null, they are not symmetric
        if (t1 == null || t2 == null) {
            return false;
        }
        // Check if the current nodes are equal and recursively check their children
        return (t1.val == t2.val) 
            && isMirror(t1.right, t2.left) 
            && isMirror(t1.left, t2.right);
    }
}