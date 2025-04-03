// ConstructBinaryTree.java
// This class constructs a binary tree from a given array representation and provides methods to traverse the tree.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class ConstructBinaryTree {
    
    // Method to construct a binary tree from an array
    public TreeNode constructTree(int[] arr, int index) {
        // Base case: if the index is out of bounds of the array
        if (index >= arr.length || arr[index] == -1) {
            return null; // -1 indicates that there is no node
        }

        // Create a new tree node with the current value
        TreeNode node = new TreeNode(arr[index]);
        
        // Recursively construct the left and right subtrees
        node.left = constructTree(arr, 2 * index + 1); // Left child index
        node.right = constructTree(arr, 2 * index + 2); // Right child index
        
        return node;
    }

    // Method to perform in-order traversal of the binary tree
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left); // Visit left subtree
            System.out.print(node.val + " "); // Visit node
            inOrderTraversal(node.right); // Visit right subtree
        }
    }

    // Main method to test the binary tree construction and traversal
    public static void main(String[] args) {
        ConstructBinaryTree treeBuilder = new ConstructBinaryTree();
        
        // Example array representation of a binary tree
        int[] arr = {1, 2, 3, 4, 5, -1, 6}; // -1 indicates a null node
        
        // Construct the binary tree
        TreeNode root = treeBuilder.constructTree(arr, 0);
        
        // Perform in-order traversal and print the output
        System.out.println("In-order traversal of the constructed binary tree:");
        treeBuilder.inOrderTraversal(root); // Expected output: 4 2 5 1 3 6
    }
}