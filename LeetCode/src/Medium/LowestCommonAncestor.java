// LowestCommonAncestor.java
// This class provides a solution to find the Lowest Common Ancestor (LCA) of two nodes in a binary tree.
// The LCA of two nodes p and q is defined as the lowest node in the tree that has both p and q as descendants.

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LowestCommonAncestor {
    
    // This method finds the LCA of two nodes in a binary tree.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if the root is null or matches one of the nodes
        if (root == null || root == p || root == q) {
            return root;
        }

        // Recursively search for the nodes in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are non-null, the current root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return the non-null child
        return left != null ? left : right;
    }

    // Example usage
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node6 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node0 = new TreeNode(0);
        TreeNode node8 = new TreeNode(8);
        
        root.left = node5;
        root.right = node1;
        node5.left = node6;
        node5.right = node2;
        node1.left = node0;
        node1.right = node8;

        LowestCommonAncestor lcaFinder = new LowestCommonAncestor();
        TreeNode lca = lcaFinder.lowestCommonAncestor(root, node5, node1);
        
        // Output the result
        System.out.println("Lowest Common Ancestor of " + node5.val + " and " + node1.val + " is: " + lca.val);
    }
}