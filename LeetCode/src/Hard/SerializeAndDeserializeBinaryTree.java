// SerializeAndDeserializeBinaryTree.java
// This class provides methods to serialize and deserialize a binary tree.
// Serialization is the process of converting a data structure into a format that can be easily stored or transmitted.
// Deserialization is the reverse process, converting the serialized format back into the original data structure.

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Serializes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "null,";
        }
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    // Deserializes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        for (String s : data.split(",")) {
            queue.offer(s);
        }
        return deserializeHelper(queue);
    }

    private TreeNode deserializeHelper(Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper(queue);
        node.right = deserializeHelper(queue);
        return node;
    }

    // Example usage
    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree codec = new SerializeAndDeserializeBinaryTree();
        
        // Creating a sample binary tree:
        //      1
        //     / \
        //    2   3
        //   / \
        //  4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Serialize the tree
        String serialized = codec.serialize(root);
        System.out.println("Serialized: " + serialized);

        // Deserialize the string back to tree
        TreeNode deserializedRoot = codec.deserialize(serialized);
        String deserializedSerialized = codec.serialize(deserializedRoot);
        System.out.println("Deserialized and re-serialized: " + deserializedSerialized);
    }
}