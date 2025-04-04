// LinkedListExample2.java
// This class demonstrates a basic implementation of a singly linked list without using constructors.

public class LinkedListExample2 {
    static class Node {
        int data;
        Node next;
    }

    Node head; // Head of the list

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

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
        LinkedListExample2 linkedList = new LinkedListExample2();

        // Inserting elements
        linkedList.insert(5);
        linkedList.insert(15);
        linkedList.insert(25);
        linkedList.insert(35);

        // Displaying the linked list
        System.out.println("Linked List:");
        linkedList.display(); // Output: 5 -> 15 -> 25 -> 35 -> null

        // Deleting a node
        linkedList.delete(15);
        System.out.println("After deleting 15:");
        linkedList.display(); // Output: 5 -> 25 -> 35 -> null
    }
}