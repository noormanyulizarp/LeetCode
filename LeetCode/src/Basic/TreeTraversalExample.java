// TreeTraversalExample.java
// This class demonstrates basic tree traversal techniques in Java.
// It includes examples of pre-order, in-order, and post-order traversals.

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

public class TreeTraversalExample {

    // Pre-order traversal: Root -> Left -> Right
    void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " "); // Visit the root
        preOrder(node.left); // Traverse left subtree
        preOrder(node.right); // Traverse right subtree
    }

    // In-order traversal: Left -> Root -> Right
    void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left); // Traverse left subtree
        System.out.print(node.value + " "); // Visit the root
        inOrder(node.right); // Traverse right subtree
    }

    // Post-order traversal: Left -> Right -> Root
    void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left); // Traverse left subtree
        postOrder(node.right); // Traverse right subtree
        System.out.print(node.value + " "); // Visit the root
    }

    public static void main(String[] args) {
        TreeTraversalExample tree = new TreeTraversalExample();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Pre-order traversal:");
        tree.preOrder(root); // Output: 1 2 4 5 3
        System.out.println("\nIn-order traversal:");
        tree.inOrder(root); // Output: 4 2 5 1 3
        System.out.println("\nPost-order traversal:");
        tree.postOrder(root); // Output: 4 5 2 3 1
    }
}