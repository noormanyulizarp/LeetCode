// PrefixTrie.java
// This class implements a simple Prefix Trie (or Prefix Tree) data structure.
// A Trie is used to store a dynamic set of strings, where the keys are usually strings.
// It is particularly useful for tasks like autocomplete and spell checking.

import java.util.HashMap;
import java.util.Map;

public class PrefixTrie {
    // Node class representing each node in the Trie
    private class TrieNode {
        Map<Character, TrieNode> children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }

    private TrieNode root;

    // Constructor to initialize the Trie
    public PrefixTrie() {
        root = new TrieNode();
    }

    // Method to insert a word into the Trie
    public void insert(String word) {
        TrieNode currentNode = root;
        for (char ch : word.toCharArray()) {
            currentNode = currentNode.children.computeIfAbsent(ch, c -> new TrieNode());
        }
        currentNode.isEndOfWord = true; // Mark the end of the word
    }

    // Method to search for a word in the Trie
    public boolean search(String word) {
        TrieNode currentNode = root;
        for (char ch : word.toCharArray()) {
            currentNode = currentNode.children.get(ch);
            if (currentNode == null) {
                return false; // Not found
            }
        }
        return currentNode.isEndOfWord; // Return true if it's an end of a word
    }

    // Method to check if there is any word in the Trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode currentNode = root;
        for (char ch : prefix.toCharArray()) {
            currentNode = currentNode.children.get(ch);
            if (currentNode == null) {
                return false; // No such prefix
            }
        }
        return true; // Prefix exists
    }

    // Main method to demonstrate the functionality of the Prefix Trie
    public static void main(String[] args) {
        PrefixTrie trie = new PrefixTrie();
        trie.insert("apple");
        trie.insert("app");

        // Search for words
        System.out.println(trie.search("apple")); // true
        System.out.println(trie.search("app"));   // true
        System.out.println(trie.search("appl"));  // false

        // Check for prefixes
        System.out.println(trie.startsWith("app")); // true
        System.out.println(trie.startsWith("ap"));  // true
        System.out.println(trie.startsWith("a"));   // true
        System.out.println(trie.startsWith("b"));   // false
    }
}