public class BinaryTreeLevelOrderTraversal {
    
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Method to perform level order traversal of a binary tree
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result; // Return empty list if the tree is empty
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // Start with the root node

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll(); // Get the front node
                currentLevel.add(currentNode.val); // Add its value to the current level list

                // Add child nodes to the queue for the next level
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel); // Add the current level to the result
        }

        return result; // Return the final result
    }

    // Main method to test the level order traversal
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal treeTraversal = new BinaryTreeLevelOrderTraversal();

        // Creating a sample binary tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Performing level order traversal
        List<List<Integer>> result = treeTraversal.levelOrder(root);

        // Printing the result
        System.out.println("Level Order Traversal: " + result);
    }
}