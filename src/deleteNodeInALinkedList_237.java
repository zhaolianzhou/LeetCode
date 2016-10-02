/**
 * Problem No : 237
 * Description:
 * Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 
 * and you are given the third node with value 3, 
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 * @author Zhaolian
 *
 */
public class deleteNodeInALinkedList_237 {
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	
	public void deleteNode(ListNode node){
		ListNode pre = node;
		ListNode curr = node;
		ListNode post;
		while(curr.next!=null){
			post = curr.next;
			curr.val = post.val;
			pre = curr;
			curr = curr.next;
		}
		pre.next = null;
	}
}


