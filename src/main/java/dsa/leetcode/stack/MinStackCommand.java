package dsa.leetcode.stack;


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
