/**
 * No: 83 Remove Duplicated from Sorted List
 * Description:
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * @author Zhaolian
 *
 */
public class removeDuplicatesfromSortedList_83 {
	static public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	 public static ListNode deleteDuplicates(ListNode head) {
	    if(head==null||head.next==null)
	    	return head;
	    ListNode currNode = head;
	    while(currNode.next!=null){
	    	if(currNode.val==currNode.next.val){
	    		currNode.next=currNode.next.next;
	    	}else{
	    		currNode = currNode.next;
	    	}
	    }
	    return head;
	 }
	 
	 public static void main(String[] args){
		 ListNode myList = new ListNode(1);
		 myList.next = new ListNode(1);
		 myList.next.next = new ListNode(2);
		 removeDuplicatesfromSortedList_83 my83 = new removeDuplicatesfromSortedList_83();
		 ListNode result = my83.deleteDuplicates(myList);
		 while(result!=null){
			 System.out.println(result.val);
			 result = result.next;
		 }
	 }
}
