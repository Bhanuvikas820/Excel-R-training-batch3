import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int total = val1 + val2 + carry;

            carry = total / 10;
            current.next = new ListNode(total % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}

public class LTCode004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number as digits separated by space (in reverse order):");
        ListNode l1 = createLinkedList(scanner.nextLine());

        System.out.println("Enter the second number as digits separated by space (in reverse order):");
        ListNode l2 = createLinkedList(scanner.nextLine());

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.println("The result is:");
        printLinkedList(result);

        scanner.close();
    }

    private static ListNode createLinkedList(String input) {
        String[] values = input.split(" ");
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value));
            current = current.next;
        }
        return dummy.next;
    }

    private static void printLinkedList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}
