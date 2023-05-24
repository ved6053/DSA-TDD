package dsa.leetcode.string;

import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 * https://www.youtube.com/watch?v=TfENDUMm0XE&list=PL1w8k37X_6L86f3PUUVFoGYXvZiZHde1S&index=14
 **/
public class BackspaceStringCompare {
	public Boolean backspaceCompare(String str1, String str2){
		String result1 = removeBackspace(str1);
		String result2 = removeBackspace(str2);
		return result1.equals(result2);
	}
	
	private String removeBackspace(String str){
		Stack<Character> stack = new Stack<>();
		String result = "";
		for(Character ch: str.toCharArray()){
			if(ch=='#'){
				if(!stack.empty())
					stack.pop();
			} else {
				stack.push(ch);
			}
		}
		while (!stack.empty()) {
			result=stack.pop()+result;
		}
		return result;
	}
}
