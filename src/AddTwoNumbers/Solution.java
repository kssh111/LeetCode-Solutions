package src.AddTwoNumbers;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to hold the result linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // Loop through both lists until both are fully traversed and carry is 0
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from current nodes, or 0 if the list is exhausted
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Compute sum and carry
            int sum = val1 + val2 + carry;
            carry = sum / 10; // Carry for next iteration

            // Create a new node with the remainder (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next; // Move current pointer forward

            // Move to the next node in l1 and l2 if they exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the resulting linked list starting from dummy.next
        return dummy.next;
    }
    public static void printList(ListNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (node != null) {
            sb.append(node.val);
            if (node.next != null) {
                sb.append(" -> ");
            }
            node = node.next;
        }

        sb.append("]");
        System.out.println("res = " + sb.toString());
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers(l1, l2);
        printList(result);  // Output: 7 0 8

    }
}
