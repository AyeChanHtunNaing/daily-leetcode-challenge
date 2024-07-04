package dev.peacechan;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        int sum = 0;

        while (temp != null && temp.val != 0) {
            sum += temp.val;
            temp = temp.next;
        }

        head.val = sum;
        head.next = mergeNodes(temp);
        return head;
    }

    public static void main(String[] args) {

        int[] input1 = {0, 3, 1, 0, 4, 5, 2, 0};
        ListNode head1 = createLinkedList(input1);
        System.out.print("Input: ");
        printLinkedList(head1);
        Solution solution = new Solution();
        ListNode result1 = solution.mergeNodes(head1);
        System.out.print("Output: ");
        printLinkedList(result1);


        int[] input2 = {0, 1, 0, 3, 0, 2, 2, 0};
        ListNode head2 = createLinkedList(input2);
        System.out.print("Input: ");
        printLinkedList(head2);
        ListNode result2 = solution.mergeNodes(head2);
        System.out.print("Output: ");
        printLinkedList(result2);
    }

    private static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
            if (current != null) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
