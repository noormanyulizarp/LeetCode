// LeafSimilarTreesChecker.java
// This class checks if two binary trees are leaf-similar.
// Leaf-similar trees are trees that have the same sequence of leaf values when traversed from left to right.

import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LeafSimilarTreesChecker {

    // Main method to check if two trees are leaf-similar
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        
        // Collect leaf values from both trees
        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);
        
        // Compare the collected leaf values
        return leaves1.equals(leaves2);
    }

    // Helper method to collect leaf values from a tree
    private void collectLeaves(TreeNode node, List<Integer> leaves) {
        if (node == null) {
            return;
        }
        // If it's a leaf node, add its value to the list
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
        } else {
            // Recur for left and right children
            collectLeaves(node.left, leaves);
            collectLeaves(node.right, leaves);
        }
    }

    // Example usage
    public static void main(String[] args) {
        // Create two sample trees
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(7);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(5);
        root2.left.right.left = new TreeNode(4);
        root2.left.right.right = new TreeNode(7);

        LeafSimilarTreesChecker checker = new LeafSimilarTreesChecker();
        boolean result = checker.leafSimilar(root1, root2);
        
        // Output the result
        System.out.println("Are the two trees leaf-similar? " + result);
    }
}