// ReverseLinkedList.java
// This class provides a solution to reverse a singly linked list.
// It includes a method to reverse the linked list and a method to print the list.

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class ReverseLinkedList {
    
    // Method to reverse the linked list
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev to current
            current = next;      // Move to next node
        }
        return prev; // New head of the reversed list
    }

    // Method to print the linked list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the reverseList method
    public static void main(String[] args) {
        ReverseLinkedList rll = new ReverseLinkedList();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        rll.printList(head);

        // Reversing the linked list
        ListNode reversedHead = rll.reverseList(head);
        System.out.println("Reversed Linked List:");
        rll.printList(reversedHead);
    }
}

// Example Output:
// Original Linked List:
// 1 -> 2 -> 3 -> 4 -> 5 -> null
// Reversed Linked List:
// 5 -> 4 -> 3 -> 2 -> 1 -> null