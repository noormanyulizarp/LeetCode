// PalindromeLinkedList.java
// This class checks if a given linked list is a palindrome.

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class PalindromeLinkedList {
    
    // Function to check if the linked list is a palindrome
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node is a palindrome
        }

        // Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode prev = null;
        while (slow != null) {
            ListNode nextTemp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextTemp;
        }

        // Compare the first half and the reversed second half
        ListNode left = head;
        ListNode right = prev; // This is the head of the reversed second half
        while (right != null) {
            if (left.val != right.val) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // It is a palindrome
    }

    // Example usage
    public static void main(String[] args) {
        PalindromeLinkedList pll = new PalindromeLinkedList();

        // Creating a palindrome linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        // Check if the linked list is a palindrome
        boolean result = pll.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result); // Output: true

        // Creating a non-palindrome linked list: 1 -> 2 -> 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        // Check if the linked list is a palindrome
        boolean result2 = pll.isPalindrome(head2);
        System.out.println("Is the linked list a palindrome? " + result2); // Output: false
    }
}