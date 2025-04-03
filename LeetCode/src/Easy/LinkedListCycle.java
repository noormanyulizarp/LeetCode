public class LinkedListCycle {
    
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // Function to detect if a linked list has a cycle
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false; // No cycle
    }

    // Example usage
    public static void main(String[] args) {
        // Creating a linked list with a cycle for testing
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating a cycle

        // Testing the hasCycle function
        boolean result = hasCycle(node1);
        System.out.println("Does the linked list have a cycle? " + result); // Expected output: true
    }
}