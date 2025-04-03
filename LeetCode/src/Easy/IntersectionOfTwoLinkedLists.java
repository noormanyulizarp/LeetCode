// IntersectionOfTwoLinkedLists.java
// This class provides a solution to find the intersection node of two singly linked lists.
// The intersection node is the node at which the two lists converge.

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class IntersectionOfTwoLinkedLists {
    
    // Function to get the intersection node of two linked lists
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; // If either list is empty, there is no intersection
        }

        ListNode a = headA;
        ListNode b = headB;

        // Traverse both lists
        while (a != b) {
            // When reaching the end of one list, start at the beginning of the other
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        // Either both are null (no intersection) or they meet at the intersection node
        return a;
    }

    // Example usage
    public static void main(String[] args) {
        // Create two linked lists that intersect
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = common; // Intersecting point

        ListNode listB = new ListNode(5);
        listB.next = new ListNode(0);
        listB.next.next = new ListNode(1);
        listB.next.next.next = common; // Intersecting point

        IntersectionOfTwoLinkedLists solution = new IntersectionOfTwoLinkedLists();
        ListNode intersectionNode = solution.getIntersectionNode(listA, listB);

        if (intersectionNode != null) {
            System.out.println("The intersection node's value is: " + intersectionNode.val);
        } else {
            System.out.println("There is no intersection.");
        }
    }
}