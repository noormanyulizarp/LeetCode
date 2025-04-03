// DiameterOfBinaryTree.java
// This class defines a binary tree and calculates its diameter.
// The diameter of a binary tree is the length of the longest path between any two nodes in the tree.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class DiameterOfBinaryTree {
    private int diameter = 0;

    // Function to calculate the diameter of the binary tree
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }

    // Helper function to calculate the depth of the tree
    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively find the depth of the left and right subtrees
        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        // Update the diameter if the path through the current node is larger
        diameter = Math.max(diameter, leftDepth + rightDepth);

        // Return the depth of the tree rooted at the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }

    // Main method to test the diameter calculation
    public static void main(String[] args) {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();

        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calculating the diameter
        int result = tree.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + result); // Output: 3
    }
}