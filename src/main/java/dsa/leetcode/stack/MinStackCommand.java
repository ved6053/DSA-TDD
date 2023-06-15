package dsa.leetcode.stack;

import java.util.Stack;

/**
 * Solutions 1:
 * https://leetcode.com/problems/min-stack/
 * https://www.youtube.com/watch?v=SM8-Z99SJ_I&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=16
 **/
/**
 * Solutions 2:
 * https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/
 **/
class MinStack {
	private final Stack<Integer> stack;
	private Integer minElement;
	public MinStack() {
		stack= new Stack<>();
	}
	
	public void push(int val) {
		if(stack.isEmpty()){
			stack.push(val);
			minElement=val;
		} else if(minElement>=val){
			stack.push(2*val-minElement);
			minElement=val;
		} else {
			stack.push(val);
		}
	}
	
	public int pop() {
		int val;
		if(stack.peek()<minElement){
			val=minElement;
			minElement=2*minElement-stack.pop();
		} else {
			val = stack.pop();
		}
		return val;
	}
	
	public int peek() {
		if(stack.peek()<minElement){
			return minElement;
		} else {
			return stack.peek();
		}
	}
	
	public int getMin() {
		return minElement;
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
