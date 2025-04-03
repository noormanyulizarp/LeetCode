// FlattenBinaryTree.java
// This class provides a solution to flatten a binary tree to a linked list in-place.
// The flattening is done using a pre-order traversal approach.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class FlattenBinaryTree {
    // This method flattens the binary tree rooted at 'root' into a linked list.
    public void flatten(TreeNode root) {
        if (root == null) return;

        // Flatten the left and right subtrees
        flatten(root.left);
        flatten(root.right);

        // Store the left subtree
        TreeNode tempRight = root.right;

        // Move the left subtree to the right
        root.right = root.left;
        root.left = null;

        // Find the end of the new right subtree and attach the original right subtree
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.right = tempRight;
    }

    // Example usage
    public static void main(String[] args) {
        FlattenBinaryTree solution = new FlattenBinaryTree();

        // Creating a sample binary tree
        //       1
        //      / \
        //     2   5
        //    / \   \
        //   3   4   6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        // Flatten the binary tree
        solution.flatten(root);

        // Print the flattened tree
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
        // Expected output: 1 2 3 4 5 6
    }
}