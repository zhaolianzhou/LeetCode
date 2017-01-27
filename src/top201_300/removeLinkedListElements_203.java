package top201_300;


public class removeLinkedListElements_203 {
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	public static ListNode removeElements(ListNode head, int val){
		if(head==null)
			return head;
		ListNode before  = head;
		ListNode current = head;
		while(head.val==val){
			head=head.next;
		}
		while(current!=null){
			if(current.val==val){
				before.next=current.next;
				current = current.next;
			}else{
				before=current;
				current = current.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode myList = new ListNode(1);
		myList.next = new ListNode(2);
		myList.next.next = new ListNode(3);
		myList.next.next.next = new ListNode(4);
		
		removeElements(myList, 1);
	}

}
