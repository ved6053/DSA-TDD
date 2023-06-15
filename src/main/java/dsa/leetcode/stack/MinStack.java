package dsa.leetcode.stack;

import java.util.Stack;

public class MinStack {
	private final Stack<Integer> stack;
	private final Stack<Integer> sideStack;
	public MinStack() {
		stack= new Stack<>();
		sideStack = new Stack<>();
	}
	
	public void push(int val) {
		stack.push(val);
		sideStack.push((sideStack.isEmpty()||sideStack.peek()>val)?val:sideStack.peek());
	}
	
	public int pop() {
		sideStack.pop();
		return stack.pop();
	}
	
	public int peek() {
		return stack.peek();
	}
	
	public int getMin() {
		return sideStack.peek();
	}

}
