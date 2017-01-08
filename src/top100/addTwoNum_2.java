package top100;

public class addTwoNum_2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        StringBuilder resultStr = new StringBuilder();
        num1.append("");
        ListNode tem = l1;
        while(tem!=null){
        	num1.append(tem.val);
        	tem = tem.next;
        }
        num1=num1.reverse();
        System.out.println(num1.toString());
        int resultNum = Integer.parseInt(num1.toString());
        tem = l2;
        while(tem!=null){
        	num2.append(tem.val);
        	tem = tem.next;
        }
        num2=num2.reverse();
        System.out.println(num2.toString());
        resultNum += Integer.parseInt(num2.toString());
        System.out.println(resultNum);
        resultStr.append("");
        resultStr.append(resultNum);
        //resultStr=resultStr.reverse();
        for(int i =0; i < resultStr.length();i++){
        	String currentChar = resultStr.substring(i, i+1);
        	System.out.println(currentChar);
        	int currentNode = Integer.parseInt(currentChar);
        	
        	ListNode current = new ListNode(currentNode);
        	current.next = result.next;
        	result.next = current;
        }
        result = result.next;
        return result;
    }
	public static void main(String[] args){
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(1);
		ListNode subnode = new ListNode(9);
		for(int i =0; i < 9; i++){
			ListNode tem = new ListNode(9);
			tem.next = l2.next;
			l2.next =tem;
		}
		addTwoNumbers(l1,l2);
	}
}

/**
 Definition for singly-linked list.*/

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 