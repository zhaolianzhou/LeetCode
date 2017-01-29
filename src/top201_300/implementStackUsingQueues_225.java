package top201_300;

import java.util.ArrayList;

public class implementStackUsingQueues_225 {
	public class MyStack{
		private ArrayList<Integer> stackCore;
		/** Initialize your data structure here. */
	    public MyStack() {
	    	stackCore = new ArrayList<Integer>();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        stackCore.add(x);
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	        if(stackCore.isEmpty()||stackCore.size()==0)
	        	return (Integer)null;
	        else{
	        	int index = stackCore.size()-1;
	        	int top = stackCore.get(index);
	        	stackCore.remove(index);
	        	return top;
	        }
	    }
	    
	    /** Get the top element. */
	    public int top() {
	    	if(stackCore.isEmpty()||stackCore.size()==0)
	        	return (Integer)null;
	        else{
	        	int index = stackCore.size()-1;
	        	int top = stackCore.get(index);
	        	return top;
	        }
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	        return stackCore.isEmpty();
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
