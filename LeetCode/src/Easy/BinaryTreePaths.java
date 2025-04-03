public class BinaryTreePaths {
    
    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // This method returns all root-to-leaf paths in a binary tree.
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            constructPaths(root, "", paths);
        }
        return paths;
    }

    // Helper method to construct paths from the root to leaf nodes.
    private static void constructPaths(TreeNode root, String path, List<String> paths) {
        path += Integer.toString(root.val); // Add the current node's value to the path
        if (root.left == null && root.right == null) { // If it's a leaf node
            paths.add(path); // Add the path to the list
        } else {
            path += "->"; // Add the arrow for the next node
            if (root.left != null) {
                constructPaths(root.left, path, paths); // Recur on the left child
            }
            if (root.right != null) {
                constructPaths(root.right, path, paths); // Recur on the right child
            }
        }
    }

    // Main method to test the binaryTreePaths function
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        // Get all root-to-leaf paths
        List<String> paths = binaryTreePaths(root);
        
        // Print the paths
        System.out.println("Root-to-leaf paths: " + paths);
    }
}

Output:
Root-to-leaf paths: [1->2->5, 1->3]