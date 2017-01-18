package top100;

public class swapNodesinPairs_24 {
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	public static ListNode swapPairs(ListNode head){
		if(head==null||head.next==null)
			return head;
		ListNode curr = head;
		while(curr!=null&&curr.next!=null){
			int tem = curr.val;
			curr.val= curr.next.val;
			curr.next.val = tem;
			curr = curr.next.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		ListNode head2 = swapPairs(head);
		while(head2!=null){
			System.out.println(head2.val);
			head2=head2.next;
		}
	}

}
