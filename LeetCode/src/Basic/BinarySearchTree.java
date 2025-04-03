// BinarySearchTree.java
// This class implements a simple Binary Search Tree (BST) in Java.
// It includes methods for inserting nodes, searching for a value, and performing in-order traversal.

class Node {
    int key;
    Node left, right;

    // Constructor to create a new node
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    // Constructor to create an empty BST
    public BinarySearchTree() {
        root = null;
    }

    // This method calls the recursive insert method
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // return the unchanged node pointer
        return root;
    }

    // This method calls the recursive search method
    boolean search(int key) {
        return searchRec(root, key);
    }

    // A recursive function to search a key in BST
    boolean searchRec(Node root, int key) {
        // Base Cases: root is null or key is present at root
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }

        // Key is greater than root's key
        return key > root.key ? searchRec(root.right, key) : searchRec(root.left, key);
    }

    // This method prints the in-order traversal of the BST
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do in-order traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Main method to demonstrate the functionality of the Binary Search Tree
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Inserting values into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Print in-order traversal of the BST
        System.out.println("In-order traversal of the given tree:");
        bst.inorder();

        // Search for a value in the BST
        int searchKey = 40;
        System.out.println("\n\nSearching for " + searchKey + ": " + (bst.search(searchKey) ? "Found" : "Not Found"));
    }
}