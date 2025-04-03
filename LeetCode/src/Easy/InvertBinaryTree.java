public class InvertBinaryTree {
    
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Function to invert a binary tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

    // Helper function to print the tree in-order for verification
    public void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.val + " ");
            printInOrder(node.right);
        }
    }

    // Main method to test the invertTree function
    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();
        
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Original tree (in-order):");
        tree.printInOrder(root);
        
        // Inverting the binary tree
        tree.invertTree(root);
        
        System.out.println("\nInverted tree (in-order):");
        tree.printInOrder(root);
    }
}