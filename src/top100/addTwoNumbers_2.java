package top100;
import java.lang.*;

public class addTwoNumbers_2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int currentSum = l1.val + l2.val;
        ListNode currentResult = new ListNode(currentSum%10);
        ListNode resultHead = currentResult;
        int extra = Math.abs(currentSum/10);
        while(l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            currentSum = l1.val+l2.val+extra;
            currentResult.next = new ListNode(currentSum%10);
            extra = Math.abs(currentSum/10);
            currentResult = currentResult.next;
        }

        ListNode reminingNum = null;
        if (l1.next != null) reminingNum = l1.next;
        if (l2.next != null) reminingNum = l2.next;

        while (reminingNum != null) {
            currentSum = reminingNum.val + extra;
            currentResult.next = new ListNode(currentSum%10);
            currentResult = currentResult.next;
            extra = Math.abs(currentSum/10);
            reminingNum = reminingNum.next;
        }
        if (extra != 0) {
            currentResult.next = new ListNode(extra);
        }
        return resultHead;
    }
}
