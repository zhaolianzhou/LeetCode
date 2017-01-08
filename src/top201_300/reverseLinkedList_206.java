package top201_300;


public class reverseLinkedList_206 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x; 
		}
	}
	public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
        	return head;
		ListNode pre, curr, post;
        pre = null;
        curr = head;
        post = head.next;
		while(curr!=null){
			post = curr.next;
			curr.next = pre;
			pre=curr;
			curr = post;
		}
		return pre;
    }
	
	
	public static void main(String[] args){
		reverseLinkedList_206 reList = new reverseLinkedList_206();
		ListNode myList = new ListNode(1);
		myList.next = new ListNode(2);
		myList.next.next = new ListNode(3);
		myList.next.next.next = new ListNode(4);
		ListNode result = reverseLinkedList_206.reverseList(myList);
		while(result!=null){
			System.out.println(result.val);
			result = result.next;
		}
	}
}



