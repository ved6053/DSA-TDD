package dsa.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/min-stack/
 * https://www.youtube.com/watch?v=SM8-Z99SJ_I&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=16
 **/
class MinStack {
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

public class MinStackCommand {
	private MinStack minStack;
	public MinStackCommand() {
		minStack= new MinStack();
	}
	
	public Integer command(String cmd, Integer input){
		switch (cmd){
			case "MinStack":
				minStack= new MinStack();
				break;
			case  "push":
				minStack.push(input);
				break;
			case  "getMin":
				return minStack.getMin();
			case "pop":
				return minStack.pop();
			case "top":
				return  minStack.peek();
		}
		return null;
	}
}
