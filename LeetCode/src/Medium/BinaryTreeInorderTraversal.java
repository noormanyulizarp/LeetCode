public class BinaryTreeInorderTraversal {
    
    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Method to perform inorder traversal of a binary tree
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        // Traverse the left subtree
        inorderTraversal(root.left);
        // Visit the root
        System.out.print(root.val + " ");
        // Traverse the right subtree
        inorderTraversal(root.right);
    }

    // Main method to test the inorder traversal
    public static void main(String[] args) {
        // Creating a sample binary tree
        //       1
        //        \
        //         2
        //        /
        //       3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Inorder Traversal of the binary tree:");
        inorderTraversal(root); // Expected output: 1 3 2
    }
}