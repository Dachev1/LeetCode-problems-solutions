public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        ListNode l1Reversed = reverseList(l1);
        ListNode l2Reversed = reverseList(l2);

        int num = getNumber(l1Reversed) +  getNumber(l2Reversed);

        return new ListNode(num);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        if (head.next == null)
            return head;

        ListNode secondElem = head.next;

        head.next = null;

        ListNode reverseRest = reverseList(secondElem);

        secondElem.next = head;

        return reverseRest;
    }

    public int getNumber(ListNode node) {
        String num = "";
        while (node.next != null) {
            num = String.valueOf(node.next.val);
            node = node.next;
        }

        return Integer.parseInt(num);
    }
}
