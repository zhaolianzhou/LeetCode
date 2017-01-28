package top101_200;

import java.util.ArrayList;
import java.util.Stack;

public class minStack_155 {
	public static class MinStack{
		private int min;
		private Stack<Integer> myStack;
		private Stack<Integer> minStack;
		public MinStack(){
			myStack=new Stack<Integer>();
			minStack=new Stack<Integer>();
		}
		public void push(int x){
			if(myStack.isEmpty()){
				min=x;
			}else{
				min=minStack.peek();
				if(min>x)
					min=x;
			}
			myStack.add(x);
			minStack.add(min);
		}
		
		public void pop(){
			if(!myStack.isEmpty()){
				myStack.pop();
				minStack.pop();
				
			}
		}
		public int top(){
			return myStack.peek();
		}
		
		public int getMin(){
			return minStack.peek();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();
		obj.push(2147483646);
		obj.push(2147483646);
		obj.push(2147483647);
		obj.top();
		obj.pop();
		obj.getMin();
		obj.pop();
		obj.getMin();
		obj.pop();
		obj.push(2147483647);
		obj.top();
		obj.getMin();
		obj.push(-2147483647);
		obj.top();
		obj.getMin();
		obj.pop();
		obj.getMin();
		
	}

}
