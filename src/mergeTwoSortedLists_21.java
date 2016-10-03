/**
 * Problem No: 21
 * Description: Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * Tags: Linked List
 * @author Zhaolian
 *
 */
public class mergeTwoSortedLists_21 {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val = x;}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		ListNode curr1 = l1;
		ListNode curr2 = l2;
		ListNode l3 = new ListNode((l1.val<=l2.val)?l1.val:l2.val);
		ListNode result = l3;
		if(l1.val<=l2.val)
			curr1 = l1.next;
		else
			curr2 = l2.next;
		while(curr1!= null&&curr2!= null){
			if(curr1.val<=curr2.val){
				l3.next = curr1;
				curr1 = curr1.next;
			}
			else{
				l3.next = curr2;
				curr2 = curr2.next;
			}
			l3 = l3.next;
		}
		if(curr1 == null)
			l3.next = curr2;
		else
			l3.next = curr1;
		
		return result;
	}
}
