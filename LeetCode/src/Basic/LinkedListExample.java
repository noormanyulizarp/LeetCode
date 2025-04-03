// LinkedListExample.java
// This class demonstrates basic operations on a singly linked list in Java.

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    Node head; // head of the list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node by value
    public void delete(int value) {
        if (head == null) return;

        // If the node to be deleted is the head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next; // Bypass the node to delete
                return;
            }
            current = current.next;
        }
    }

    // Main method to demonstrate the linked list operations
    public static void main(String[] args) {
        LinkedListExample linkedList = new LinkedListExample();

        // Inserting elements
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);

        // Displaying the linked list
        System.out.println("Linked List:");
        linkedList.display(); // Output: 10 -> 20 -> 30 -> 40 -> null

        // Deleting a node
        linkedList.delete(20);
        System.out.println("After deleting 20:");
        linkedList.display(); // Output: 10 -> 30 -> 40 -> null
    }
}