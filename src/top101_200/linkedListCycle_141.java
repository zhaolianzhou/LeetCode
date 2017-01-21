package top101_200;

import top201_300.reverseLinkedList_206.ListNode;

public class linkedListCycle_141 {
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { 
			val = x;
			next=null;
		}
	}
	public static boolean hasCycle(ListNode head){
		boolean result=false;
		if(head==null||head.next==null)
			return result;
		ListNode first=head, second =head;
		while(second.next!=null&&second.next.next!=null){
			first = first.next;
			second = second.next.next;
			if(first==second)
				return true;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode myList = new ListNode(1);
		myList.next = new ListNode(2);
		myList.next.next = new ListNode(3);
		myList.next.next.next = myList.next;
		
		System.out.println(hasCycle(myList));
	}

}
